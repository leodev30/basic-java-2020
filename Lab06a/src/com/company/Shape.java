package com.company;

public abstract class Shape {
    public int color;
    public Shape(){

    }
    public void draw(){
        System.out.println("draw Shape");
    }
    public void rotate(int angle){
        System.out.println("angle is "+angle);
    }
    public void moveLeft(int point){
        System.out.println("Move Left"+point);
    }
    public void setColor(int color){
        this.color = color;
    }
}
