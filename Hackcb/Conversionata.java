package Hackcb;
import java.util.Scanner;
public class Conversionata {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sb=sc.nextInt();
        int sd=sc.nextInt();
        int sn=sc.nextInt();
        conversion(sb, sd, sn);
    }
    public static void conversion(int a, int b ,int c) 
    {
        int sum=0;
        int mul=1;
        while(c!=0)
        {
            int rem=c%10;
            sum=sum+rem*mul;
            c=c/10;
            mul=mul*a;
        }
        System.out.println(sum);
        int sum1=sum;
        int sum2=0;
        int mul2=1;
        while(sum1!=0)
        {
            int rem2=sum1%b;
            sum2=sum2+rem2*mul2;
            sum1=sum1/b;
            mul2=mul2*10;
        }
        System.out.println(sum2);
        }
}
