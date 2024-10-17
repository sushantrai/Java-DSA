package Hackcb;
import java.util.Scanner;
public class StringsOddevenCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        oddeven(str);
    }
    public static void oddeven(String str) 
    {
        for(int i=0;i<str.length();i++)
        {
            int n=str.charAt(i);
            if(i%2==0)
            {
                n++;
            }
            else{
                n--;
            }
            char c=(char)n;
            System.out.print(c);
        }
    }
}
