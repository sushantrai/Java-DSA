package lec9;
public class swap {
    public static void main(String[] args) 
    {
        int a=8;
        int b=12;
        System.out.println(a+" "+b);
        swapp(a, b);
    }
    public static void swapp(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);   
    }
}
