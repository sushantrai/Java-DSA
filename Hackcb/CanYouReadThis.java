package Hackcb;
import java.util.Scanner;
public class CanYouReadThis {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        read(str);
    }
    public static void read(String str) 
    {
        int len=str.length();
        for(int i=0;i<len;)
        {
            if(Character.isUpperCase(str.charAt(i))&&i<len)
            {
                System.out.print(str.charAt(i));
                i++;
                while(i<len&&!Character.isUpperCase(str.charAt(i)))
                {
                    System.out.print(str.charAt(i));
                        i++;
                }
                System.out.println();
            }
            else{
                i++;
            }
        }
    }
}