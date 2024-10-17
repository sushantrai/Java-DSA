package lec7;

public class fun4 {
    public static void main(String[] args) {
        System.out.println(v);
        fun();
        
    }
    static int v=10;
    public static void fun() 
    {
        int v=90;
        System.out.println(v+90);
        v=v+4;
        System.out.println(v);
        fun4.v=fun4.v+10;
        System.out.println(fun4.v);
    }
    
}
