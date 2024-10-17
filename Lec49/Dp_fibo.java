package Lec49;

import java.util.Scanner;

public class Dp_fibo {
    public static int fiboTd(int n,int dp[])
    {
        if(n==0||n==1)
        {
            return n;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }

        return fiboTd(n-1)+fiboTd(n-2);
    }
    public static int fibBU(int n)
    {
        int[]dp=new int [n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++)
        {
            dp[i]=dp[i-2]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []dp=new dp[n+1];
        System.out.println(fiboTd(n));
    }
}
