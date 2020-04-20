package com.company;

import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
            List<Shape> figuer = new ArrayList<Shape>();
            Line line = new Line();
            Circular cir1 = new Circular();
            Circular cir2 = new Circular();
            Composite com = new Composite();
            figuer.add(line);
            figuer.add(cir1);
            figuer.add(cir2);
            figuer.add(com);
            for(Shape s: figuer){
                s.draw();
                s.rotate(50);
                s.moveLeft(100);
            }

    }
}
