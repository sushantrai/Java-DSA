package lec19;
import java.util.*;
import java.util.Collections;
public class arraylist {
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
        Collections.sort(list);
        System.out.println(list);
        list.set(2, -90);
        System.out.println(list);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        for(int v:list)
        {
            System.out.print(v+" ");
        }
    }
}
