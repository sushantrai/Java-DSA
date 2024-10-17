package lec7;

public class fun2 {
    public static void main(String[] args) {
        System.out.println("Hi");
        int a=9;
        int b=78; 
        addition(a,b);
    }
    public static void addition(int a,int b) 
    {
        sub(a, b);
        int c=a+b;
        System.out.println(c);
    }
    public static void sub(int a, int b) 
    {
      int c=a-b;
      System.out.println(c);  
    }
    
}
