package Hackcb;

import java.util.Scanner;

public class MaximumCircularSum {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            
            int n=sc.nextInt();
            int arr[]=new int[n];

            for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
    }
        System.out.println(maxsum(arr));
    }
    }
    public static int maxsum(int[] arr) 
    {
        int linear_sum=kadens(arr);
        int totalsum=0;
        for(int i=0;i<arr.length;i++)
        {
            totalsum+=arr[i];
            arr[i]=arr[i]*-1;
        }
        int mid_sum=kadens(arr);
        int curr_sum=totalsum+mid_sum;
        if(curr_sum==0)
        {
            return linear_sum;
        }
        return Math.max(linear_sum,curr_sum);
        
    }
    public static int kadens(int[] arr) 
    {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            ans=Math.max(ans,sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        return ans;
    }
}
