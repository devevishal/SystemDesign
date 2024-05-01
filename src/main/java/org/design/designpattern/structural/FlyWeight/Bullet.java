package org.design.designpattern.structural.FlyWeight;

public class Bullet {
    private double radius;
    private String color;
    private double length;
    private double weight;

    private byte[] image;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public byte[] getImage() {
        return image;
    }
}
