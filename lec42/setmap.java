package lec42;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setmap {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(-5);
        set.add(7);
        set.add(1);
        set.add(-9);
        set.add(11);
        set.add(17);
        System.out.println(set);
        TreeSet<Integer>set1=new TreeSet<>();
        set1.add(2);
        set1.add(3);
        set1.add(-5);
        set1.add(7);
        set1.add(1);
        set1.add(-9);
        set1.add(11);
        set1.add(17);
        System.out.println(set1);
        LinkedHashSet<Integer>set2=new LinkedHashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(-5);
        set2.add(7);
        set2.add(1);
        set2.add(-9);
        set2.add(11);
        set2.add(17);
        System.out.println(set2);
        Set<Integer>
    }
}