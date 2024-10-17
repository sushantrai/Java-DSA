package Lec50;

import java.security.KeyPair;

public class Knapsack {
    public static void main(String[] args) {
        int[] wt={1,2,3,2,2};
        int [] val={8,4,0,5,3};
        int cap=4;
        System.out.println(Knapsack01(wt, val, cap,0));
    }
    public static int Knapsack01(int[] wt,int[]val,int cap,int idx )
    {
        if(cap==0||idx==wt.length)
        {
            return 0;
        }
        int inc=0,exc=0;
        if(cap>=wt[idx]){
            inc=val[idx]+Knapsack01(wt, val, cap-wt[idx], idx)
        }
    }
}