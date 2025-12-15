package gr.aueb.cf.cf9.ch15.skeletal_impl;

public class Square extends AbstractRectangle {

    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

}
