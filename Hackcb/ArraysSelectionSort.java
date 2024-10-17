package Hackcb;
import java.util.Scanner;
public class ArraysSelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] arr=new int[t];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void sort(int[] arr ) 
    {
        for(int i=0;i<arr.length;i++)
     {
        int mini=i;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]<arr[mini])
            {
            mini=j;
            }
        }
        int t=arr[i];
        arr[i]=arr[mini];
        arr[mini]=t;
     }
    }
}
