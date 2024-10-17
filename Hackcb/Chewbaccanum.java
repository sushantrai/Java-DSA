package Hackcb;
import java.util.Scanner;
public class Chewbaccanum 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long rem=1;
        long sum=0;
        long mul=1;
        while(n>9)
        {
          rem=n%10;
          
          if(rem>=5)
          {
            sum=sum+(9-rem)*mul;
          }
          else
          {
            sum=(sum+rem*mul);
          }
          n=n/10;
          mul=mul*10;
        }
        if(n==9 || n<5){
            sum=(sum+n*mul);  
        }
        else{
            sum=sum+(9-n)*mul;

        }
        System.out.println(sum);
    }    
}
