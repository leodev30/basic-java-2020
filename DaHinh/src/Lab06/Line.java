package com.lab06;

public class Line extends Shape {
    protected  int length = 10;
    Line(){

    }
    @Override
    public void draw() {
        System.out.println("This is Line");
    }

    @Override
    public void rotate(int angle) {

        System.out.println("this is rotate"+ angle);
    }

    @Override
    public void moveLeft(int point) {

        System.out.println("move Left "+ point);
    }

    @Override
    public void setColor(int color) {
        System.out.println("Set color Line "+ color);
    }
    public int getLength(){
        return length;
    }
}
