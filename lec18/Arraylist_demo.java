package lec18;
import java.util.*;
public class Arraylist_demo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(list);
        System.out.println(list.size());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(-20);
        System.out.println(list);
        list.add(2, 89);
        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println(list);
    }
}
