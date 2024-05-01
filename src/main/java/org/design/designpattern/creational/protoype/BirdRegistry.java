package org.design.designpattern.creational.protoype;

import java.util.HashMap;

public class BirdRegistry {

    private HashMap<String, Bird> registry = new HashMap<>();


    public void register(String name , Bird bird){
        registry.put(name, bird);
    }

    public Bird getBird(String name){
        return registry.get(name).clone();
    }


}
