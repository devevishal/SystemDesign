package org.design.designpattern.protoype;

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
