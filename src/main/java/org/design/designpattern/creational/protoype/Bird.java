package org.design.designpattern.creational.protoype;

public class Bird implements Cloneable<Bird> {

    private int color;
    private int height;
    private int weight;
    private String sound;

    public Bird() {
    }

    public Bird(Bird bird) {
        this.color = bird.color;
        this.height = bird.height;
        this.weight = bird.weight;
        this.sound = bird.sound;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public Bird clone() {
        return new Bird(this);
    }
}
