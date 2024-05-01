package org.design.designpattern.structural.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {
    private Map<String , Bullet> registry = new HashMap<>();


    public void register(String name, Bullet bullet){
        registry.put(name, bullet);
    }

    public Bullet getBullet(String name){
        return registry.get(name);
    }
}
