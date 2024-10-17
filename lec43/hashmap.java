package lec43;
import java.util.ArrayList;
public class hashmap {
    public class HashMap{
        public class Node
        {
            String key;
            Integer value;
            Node next;
        }
        private ArrayList<Node>list;
        public HashMap (int x)
        {
            list=new ArrayList<>();
            for(int i=0;i<x;i++)
            {
                list.add(null);
            }
        }
        HashMap()
        {
            this(4);                                                        
        }
    }
    public void put(String key,Integer value)
    {
        
    }
}