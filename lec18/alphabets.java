package lec18;
import java.util.Scanner;
public class alphabets {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       int[] ans=freq(str);
       for(int i=0;i<ans.length;i++)
       {
        System.out.print(ans[i]+" ");
       }
    }
    public static int[] freq(String str) {
        int[] alp=new int[26];
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            alp[ch-'a']=alp[ch-'a']+1;
        }
        return alp;
    }
}
