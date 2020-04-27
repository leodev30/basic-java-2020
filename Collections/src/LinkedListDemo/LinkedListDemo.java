package LinkedListDemo;
import  java.util.*;
import java.text.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        List<String> list = new LinkedList<>();
        for(int i = 0; i<1000000;i++){
            list.add("A"+i);
        }
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        date = new Date();
        System.out.println(dateFormat.format(date));
    }
}
