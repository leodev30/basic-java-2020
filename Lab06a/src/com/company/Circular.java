package com.company;

public class Circular extends Shape {
    final double PI = 3.14;
    protected  int r = 10;
    Circular(){

    }
    @Override
    public void rotate(int angle) {

        System.out.println("this is rotate"+ angle);
    }

    @Override
    public void draw() {

        System.out.println("This is Circular");
    }

    @Override
    public void moveLeft(int point) {


        System.out.println("move Left "+ point);

    }

    @Override
    public void setColor(int color) {

        System.out.println("Set color Circular "+ color);
    }
    public double getArea(){
        return PI*r*r;
    }
}
