package org.design.designpattern.protoype;

public class Crow extends Bird{

    private int drinkWater;
    public Crow(Crow crow) {
        super(crow);
        this.drinkWater = crow.drinkWater;
    }

    public Crow(){
        super();
    };

    @Override
    public Crow clone() {
       return new Crow(this);
    }

    public int getDrinkWater() {
        return drinkWater;
    }

    public void setDrinkWater(int drinkWater) {
        this.drinkWater = drinkWater;
    }

}
