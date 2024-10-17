package Hackcb;
import java.util.Scanner;
public class LastIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.println(lastin(arr, n-1, m));
    }
    public static int lastin(int[]arr,int i,int m) 
    {
        if(i==0)
        {
            return -1;
        }
        if(arr[i]==m)
        {
            return i;
        }
        return lastin(arr, i-1, m);
    }
}
