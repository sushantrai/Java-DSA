package Hackcb;
import java.util.Arrays;
import java.util.Scanner;

public class arraybinarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.println(search(arr, m));
    }
    public static int search(int[] arr,int m) {
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi)
        {
            int mid =(lo+hi)/2;
            if(arr [mid]==m)
            {
                return mid;
            }
            else if(arr[mid]>m)
            {
                hi=mid-1;
            }
            else
            {
                lo=mid+1;
            }

        }
        return -1;
        
    }
    
}
