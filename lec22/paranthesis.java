package lec22;
import java.util.Scanner;
public class paranthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        paranthesis(n,0,0,"");
    }
    public static void paranthesis(int n,int opening,int closing,String ans) {
        if(opening==n&&closing==n)
        {
            System.out.println(ans);
        }
        if(closing<opening)
        {
            paranthesis(n, opening, closing+1, ans+")");
        }
        if(opening<n)
        {
            paranthesis(n, opening+1, closing, ans+"(");
        }
    }
}
