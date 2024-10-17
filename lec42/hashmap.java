package lec42;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Raj",87);
        map.put("Aman", 89);
        map.put("Kunal", 77);
        map.put("Amit", 56);
        map.put("Pooja", 68);
        map.put("Shivam", 68);
        map.put("Mohan", 48);
        map.put("Amisha", 98);
        System.out.println(map);
        // //to get value
        // System.out.println(map.get("Raj"));
        // System.out.println(map.containsKey("Shivam"));
        // System.out.println(map.remove("Ankita"));
        TreeMap<String,Integer>map1=new TreeMap<>();
        map1.put("Raj",87);
        map1.put("Aman", 89);
        map1.put("Kunal", 77);
        map1.put("Amit", 56);
        map1.put("Pooja", 68);
        map1.put("Shivam", 68);
        map1.put("Mohan", 48);
        map1.put("Amisha", 98);
        System.out.println(map1);
        LinkedHashMap<String,Integer>map2=new LinkedHashMap<>();
        map2.put("Raj",87);
        map2.put("Aman", 89);
        map2.put("Kunal", 77);
        map2.put("Amit", 56);
        map2.put("Pooja", 68);
        map2.put("Shivam", 68);
        map2.put("Mohan", 48);
        map2.put("Amisha", 98);
        System.out.println(map2);

    }
}
