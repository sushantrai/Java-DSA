package Hackcb;

import java.util.Scanner;

public class MaximumSumPathinTwoArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] arr=new int[n];
            int[] arr2=new int[m];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                arr2[i]=sc.nextInt();
            }
            t--;
        }
    }
    public static void main(int[] arr,int[] arr2) {
        
    }
    
}
