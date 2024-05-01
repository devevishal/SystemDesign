package org.design.designpattern.creational.protoype;

public class Sparrow extends Bird{

    int flyingHeight;

    public Sparrow(Sparrow sparrow) {
        super(sparrow);
        this.flyingHeight = sparrow.flyingHeight;
    }

    @Override
    public Sparrow clone() {
          return new Sparrow(this);
    }
}
