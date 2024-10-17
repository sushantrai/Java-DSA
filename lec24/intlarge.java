package lec24;

import java.util.Scanner;

public class intlarge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr1=new int[m];
        for(int i=0;i<m;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int sum=0,sum1=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        for(int i=0;i<m;i++)
        {
            sum1=sum1+arr1[i];
        }
        if(sum>sum1)
        {
            System.out.println("First array is larger");
        }
        else{
            System.out.println("Second array is larger");
        }
    }
    
}
