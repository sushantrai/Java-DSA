package Lec44;

import java.lang.Thread.State;

public class subsequence {
    public static void main(String[] args) {
        String str="ABC";
        printsub(str);
    }

    public static void printsub(String str)
    {
        int len=str.length();
        for(int i=0;i<(1<<len);i++)
        {
            pattern(str,i);
        }
    }
    private static void pattern(String str,int i)
    {
        int pos=0;
        while(i>0)
        {
            if((i&1)!=0)
            {
                System.out.print(str.charAt(pos));
            }
            i>>=1;
            pos++;
        }
        System.out.println();
    }
}
