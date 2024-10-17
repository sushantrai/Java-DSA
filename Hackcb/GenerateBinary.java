package Hackcb;
import java.util.Scanner;
public class GenerateBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        String str=sc.next();
        gen(str, 0);

        }
    }
    public static String gen(String str,int i)
    {
        if(str.length()==i)
        {
            return str;
        }
        if(str.charAt(i)=='?')
        {
            System.out.print("0");
        }
        else
        {
            System.out.print(str.charAt(i));
        }
        return gen(str, i+1);
    }
}
