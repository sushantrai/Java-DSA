package lec21;
import java.util.*;
public class fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(facto(n,1));
    }
    public static int facto(int n,int ans)
    {
        if(n==0)
        {
            return ans;
        }

       return facto(n-1,ans*n);
    }   
}