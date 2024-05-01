package org.design.designpattern.protoype;

public class TestPrototype {


    public static void main(String[] args) {

        Crow crow = new Crow();
        crow.setSound("caw caw");
        crow.setDrinkWater(10);

        BirdRegistry birdRegistry = new BirdRegistry();
        birdRegistry.register("crow", crow);

        Crow sweetCrowSound = (Crow) birdRegistry.getBird("crow").clone();
        sweetCrowSound.setSound("sweet caw");
        sweetCrowSound.setDrinkWater(20);


        System.out.println(sweetCrowSound.getSound());
        System.out.println(sweetCrowSound.getDrinkWater());

        System.out.println(crow.getSound());
        System.out.println(crow.getDrinkWater());

    }
}
