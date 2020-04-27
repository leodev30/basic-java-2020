import java.util.*;
import java.util.ArrayList;

import static java.util.Collections.*;

public class ArrayListDemo3{
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student(1,"Nguyen Van A");
        Student s2 = new Student(2,"Nguyen Van B");
        Student s3 = new Student(3,"Nguyen Van C");
        Student s4 = new Student(4,"Nguyen Van D");
        Student s5 = new Student(5,"Nguyen Van E");
        Student s6 = new Student(6,"Nguyen Van F");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        System.out.println("DS la");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        list.set(1, s3);
        System.out.println("DS la");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        list.remove(new Student(5,"Nguyen Van E"));

        System.out.println("DS la");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }


        Collections.sort(list);
        System.out.println("DS la");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

    }
}
