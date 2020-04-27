import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        List<String> list1 = new ArrayList<>();
        for(int i = 0; i<1000000;i++){
            list1.add("AAA"+i);
        }
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        date = new Date();
        System.out.println(dateFormat.format(date));


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(2);
        list.add(23);
        list.add(14);
        list.add(12);
        System.out.println("DS");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("DS");
        list.remove(2);
        for(int i : list){
            System.out.println(i);
        }
        list.set(2, 100);
        System.out.println("DS");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        System.out.println("DS");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
