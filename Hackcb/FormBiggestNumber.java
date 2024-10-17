package Hackcb;

import java.util.Scanner;

public class FormBiggestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        t++;
    }
    biggest(arr);
    }
    public static void biggest(int[] arr) 
    {
        int[] arr2=new int [arr.length];
        int j=0;
        int temp=arr[0];
        while(j>arr.length)
        {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>temp)
            {
                arr[i]=temp;
            }
        }
        arr2[j]=temp;
    }   
    for(int i=0;i<arr.length;i++)
    System.out.print(arr2[i]);
    }
}
