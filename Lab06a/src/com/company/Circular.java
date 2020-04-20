package com.company;

public class Circular extends Shape {
    final double PI = 3.14;
    protected  int r = 10;
    Circular(){

    }
    @Override
    public void rotate(int angle) {
        super.rotate(angle);
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void moveLeft(int point) {
        super.moveLeft(point);
    }

    @Override
    public void setColor(int color) {
        super.setColor(color);
    }
    public double getArea(){
        return PI*r*r;
    }
}
