package Lec50;
import java.util.Arrays;
public class coinnchageIIDp {
    public static void main(String[] args) {
        int arr[]={2,1,3,4};
        int amount=10;
        
        int[][] dp=new int[arr.length][amount+1];
        for(int[]a:dp)
        {
            Arrays.fill(a, -1);
        }
        System.out.println(coinchange(coin, amount, idx, dp));
    }
    public static int coinchange(int[] coin,int amount,int idx,int[][]dp)
    {
        if(amount==0)
        {
            return 1;
        }
        if(idx==coin.length)
        {
            return 0;
        }
        if(dp[idx][amount]!=-1)
        {
            return dp[idx][amount];
        }
        int inc=0,exc=0;
        if(amount>=coin[idx])
        {
            coinchange(coin, amount-coin[idx], idx, dp);
        }
        exc=coinchange(coin, amount, idx+1, dp);
        return dp[amount][idx]=inc+exc;
    }
    public static void coinchangee(int[]coin,int amount)
    {
        int[][] dp=new int [amount+1][coin.length+1];
        for(int i=0;i<dp[0].length;i++)
        {
            dp[0][i]=1;
        }
        for(int a=1;a<=amount;a++)
        {
            for(int i=1;i<=coin.length;i++)
            {
                int inc=0,exc=0;
                if(a>=coin[i-1])
                {
                    inc=dp[a-coin[i-1]][i];
                }
                exc=dp[a][i-1];
                                
            }
        }
    }
}
