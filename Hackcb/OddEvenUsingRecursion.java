package Hackcb;
import java.util.Scanner;
public class OddEvenUsingRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        oddrecur(n);
    }
    public static void oddrecur(int n) 
    {
        if(n==0)
        {
            return;
        }
        if(n%2!=0)
        {
            System.out.println(n);
        }
        oddrecur(n-1);
        if(n%2==0)
        {
            System.out.println(n);
        }
    }
}
