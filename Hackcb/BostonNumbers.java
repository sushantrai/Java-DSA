package Hackcb;
import java.util.*;
public class BostonNumbers {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=n;
        int sum=0;
        int rem=0;
        int sum2=0;
        while(d>0)
        {
            rem=d%10;
            sum2=sum2+rem;
            d=d/10;

        }
            for(int i=2;i<=n;i++)
            {
                while(n%i==0)
                {
                    int j=i;
                    int rem2=0;
                    if(i>9)
                    {
                        while(j>0)
                        {
                            rem2=j%10;
                            sum=sum+rem2;
                            j=j/10;
                            
                        }
                    }
                    else{
                        sum=sum+i;
                    }
                    
                    n=n/i;
                }
            }
        if(sum==sum2)
            {
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
    }
}