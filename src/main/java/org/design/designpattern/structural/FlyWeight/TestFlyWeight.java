package org.design.designpattern.structural.FlyWeight;

public class TestFlyWeight {

    public static void main(String[] args) {

        Bullet five_mm_bullet = new Bullet();
        five_mm_bullet.setRadius(10.9);
        five_mm_bullet.setWeight(10);
        five_mm_bullet.setColor("Blue");

        Bullet ten_mm_bullet = new Bullet();
        ten_mm_bullet.setRadius(10.9);
        ten_mm_bullet.setWeight(10);
        ten_mm_bullet.setColor("Blue");


        BulletRegistry bulletRegistry = new BulletRegistry();
        bulletRegistry.register("5mm", five_mm_bullet);
        bulletRegistry.register("10mm", ten_mm_bullet);


        for(int i = 0; i < 100 ;i++){
            FlyingBullet bullet = new FlyingBullet();
            bullet.setX_cordinate(10);
            bullet.setY_cordinate(20);
            // here 5mm bullet is created once but referred in multiple object since it is intrinsic value

            bullet.setBullet(bulletRegistry.getBullet("5mm"));
            System.out.println(bullet);
        }


    }
}
