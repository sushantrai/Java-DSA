package leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class validanagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();    
        System.out.print(checkana(s, t));
    }  
    public static boolean checkana(String s,String t)
    {
        if(s.length()==t.length())
        {
            char[] str=s.toCharArray();
            char[] str1=t.toCharArray();
            Arrays.sort(str);
            Arrays.sort(str1);
            return Arrays.equals(str,str1);
        }
        else
        {
            return false;
        }
    }
}