package lec20;
import java.util.Scanner;
public class a2pwb {
    public static int power(int num,int pow)
    {
        if(pow==0)
        {
            return 1;
        }
        return num*power(num, pow-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pow=sc.nextInt();
        System.out.println(power(n, pow));
    }
    
}
