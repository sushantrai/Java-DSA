package Hackcb;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysTargetSumPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        target(arr, tar);
    }
    public static void target(int[] arr,int tar) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==tar)
                System.out.println(arr[i]+" and "+arr[j]);
            }
        }
    }
    
}
