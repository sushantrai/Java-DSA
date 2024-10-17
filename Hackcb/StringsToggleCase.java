package Hackcb;
import java.util.Scanner;
public class StringsToggleCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        toggle(str);
    }
    public static void toggle(String str) 
    {
        // int n=0;
        for(int i=0;i<str.length();i++)
        {
            int n=str.charAt(i);
            if(n>=65 && n<=90)
            {
                n=n+32;
                char ch=(char)n;
                System.out.print(ch);
                
            }
            else
            {
               n=n-32;
               char ch=(char)n;
               System.out.print(ch);
            }
        }
    }
    
}
