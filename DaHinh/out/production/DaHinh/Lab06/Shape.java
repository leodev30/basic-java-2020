package com.lab06;

public abstract class Shape {
    public int color;
    public Shape(){

    }
    public abstract void draw();
    public abstract  void rotate(int angle);
    public abstract  void moveLeft(int point);
    public abstract  void setColor(int color);
}
