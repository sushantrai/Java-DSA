package Hackcb;
import java.util.Scanner;
public class allindices {
    public static int indices(int[] arr,int s,int key)
    {
        if(arr.length== s)
        {
            return -1;
        }
        if(arr[s]==key)
        {
            return s;
        }
        return indices(arr, s+1, key);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println(indices(arr, 0, key));
    }
}
