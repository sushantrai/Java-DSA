package lec20;
import java.util.*;
public class acending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        acen(n);
    }
    public static void acen(int n)
    {
        if(n==0)
        {
            return;
        }
        acen(n-1);
        System.out.println(n);
    }
}
