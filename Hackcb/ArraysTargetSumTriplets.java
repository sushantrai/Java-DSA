package Hackcb;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysTargetSumTriplets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        triptar(arr, tar);
    }
    public static void triptar(int[] arr,int tar) 
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==tar)
            System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
                }
            }
        }
    }

}
