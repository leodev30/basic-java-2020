package com.company;

import java.util.List;
import java.util.ArrayList;
public class Composite extends Shape {
    List<Shape> listShape = new ArrayList<>();
    Composite(){

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
