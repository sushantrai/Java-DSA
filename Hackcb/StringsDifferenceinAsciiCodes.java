package Hackcb;
import java.util.Scanner;
public class StringsDifferenceinAsciiCodes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        stringdiff(str);
    }
    public static void stringdiff(String str) 
    {
        int temp=str.charAt(0);
        for(int i=0;i<str.length();i++)
        {
            int n=str.charAt(i);
            if(i==0)
            {
                System.out.print(str.charAt(i));
            }
            else{
                int diff=(int)n-(int)temp;
                System.out.print(diff);
                System.out.print(str.charAt(i));
                temp=n;
            }

        }    
    }
}
