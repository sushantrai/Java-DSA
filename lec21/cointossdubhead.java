package lec21;
import java.util.Scanner;
public class cointossdubhead {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        cointoss(n, "");
    }
    public static void cointoss(int n,String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
        {
        cointoss(n-1, ans+"H");
        }
        cointoss(n-1, ans+"T");
    }
    
}
