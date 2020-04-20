package com.company;

import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
            List<Shape> figuer = new ArrayList<Shape>();
            Shape line = new Line();
            Shape cir1 = new Circular();
            Shape cir2 = new Circular();
            Composite com = new Composite();
            Shape lineC = new Line();
            Shape cirC = new Circular();
            com.add(lineC);
            com.add(cirC);
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
