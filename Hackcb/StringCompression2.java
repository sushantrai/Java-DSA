package Hackcb;
import java.util.Scanner;
public class StringCompression2 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s=sc.next();
     compress(s);
    }
    public static void compress(String s) 
    {
        int n=s.length();
        
        if(n>=1 && n<=100)
        {
            for(int i=0;i<n;i++)
            {
                int count=1;
                while(i<n-1&&(s.charAt(i))==(s.charAt(i+1)))
                {
                    count++;
                    i++;
                }
                System.out.print(s.charAt(i)+""+count);
            }
        }
    }
}
