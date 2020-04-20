package com.company;

public class Line extends Shape {
    protected  int length = 10;
    Line(){

    }
    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void rotate(int angle) {
        super.rotate(angle);
    }

    @Override
    public void moveLeft(int point) {
        super.moveLeft(point);
    }

    @Override
    public void setColor(int color) {
        super.setColor(color);
    }
    public int getLength(){
        return length;
    }
}
