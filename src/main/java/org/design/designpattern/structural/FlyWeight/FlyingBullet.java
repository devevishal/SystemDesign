package org.design.designpattern.structural.FlyWeight;

public class FlyingBullet {
    private int x_cordinate;
    private int y_cordinate;
    private double speed;

    Bullet bullet;

    public int getX_cordinate() {
        return x_cordinate;
    }

    public void setX_cordinate(int x_cordinate) {
        this.x_cordinate = x_cordinate;
    }

    public int getY_cordinate() {
        return y_cordinate;
    }

    public void setY_cordinate(int y_cordinate) {
        this.y_cordinate = y_cordinate;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
