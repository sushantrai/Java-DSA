package Hackcb;

import java.util.Scanner;

public class RecursionDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        strdub(str, 0);
    }
    public static String strdub(String str,int i) 
    {
        if(str.length()-1==i)
        {
            return str;
        }
        System.out.print(str.charAt(i));
        if(str.charAt(i)==str.charAt(i+1))
        {
            System.out.print("*");
        }
        if(i==str.length()-2)
        {
        System.out.println(str.charAt(i+1));
        }
        return strdub(str, i+1);
    }
    
}
