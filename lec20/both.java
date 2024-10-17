package lec20;
import java.util.Scanner;
public class both {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        bot(n);
    }
    public static void bot(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        bot(n-1);
        System.out.println(n);
    }
}
