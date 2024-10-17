package Hackcb;

import java.util.Scanner;

public class replace0t05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        replace(str);
    }
    public static void replace(String str) 
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0')
            {
                str.replace(i, i);
            }
            System.out.println(str);
        }    
    }
}
