package Hackcb;
import java.util.Scanner;
public class VonNeumanLovesBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int i=1;
        int n[]=new int[10000];
        while(i<=no)
        {
            n[i]=sc.nextInt();
            i++;
        }
        int j=1;
        while(j<=no)
        {
            binary(n[j]);
            j++;
        }
    }
    public static void binary(int n) 
    {
        int sum=0;
        int mul=1;
        while(n!=0)
        {
            int rem=n%2;
            sum=sum+rem*mul;
            n=n/2;
            mul=mul*10;
        }
        System.out.println(sum);
    }
}
