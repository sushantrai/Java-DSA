package Hackcb;

import java.util.Scanner;

public class CalculateTheSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        while(q-->0){
            int x=sc.nextInt();
            arr=replaceopr(arr, x);
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        sum=sum%10000007;
        System.out.println(sum);
    }
    public static int[] replaceopr(int []arr,int x) 
    {
        int []brr=new int[arr.length];
        for(int i=0;i<brr.length;i++)
        {
            int j=i-x;
            if(j<0)
            {
                j+=arr.length;
            }
            brr[i]=arr[i]+arr[j];
        }
        return arr;
    }
}
