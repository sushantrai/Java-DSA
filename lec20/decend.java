package lec20;
import java.util.*;
public class decend {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       dece(n);
        
    }
    public static void dece(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        dece(n-1);
        System.out.println(n);
    }
    
}
