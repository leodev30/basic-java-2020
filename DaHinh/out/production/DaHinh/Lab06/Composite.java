package com.lab06;

import java.util.List;
import java.util.ArrayList;
public class Composite extends Shape {
    List<Shape> listShape = new ArrayList<>();
    Composite(){

    }
    @Override
    public void draw() {
        System.out.println("draw");

    }

    @Override
    public void rotate(int angle) {

        System.out.println("rotate composite "+ angle);
    }

    @Override
    public void moveLeft(int point) {

        System.out.println("move Left composite"+ point);

    }

    @Override
    public void setColor(int color) {

        System.out.println("Set color composite "+ color);

    }
    public void add(Shape shape){
        listShape.add(shape);
    }
    public void remove(Shape shape){
        for(Shape s : listShape){
            if(s.equals(shape)){
                listShape.remove(shape);
            }
        }
    }
    public void getChild(int id){
        listShape.get(id);
    }
}
