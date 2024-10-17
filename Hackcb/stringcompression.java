package Hackcb;
import java.util.*;
public class stringcompression {
    public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(arr[i]==m)
            {
                int k=arr[i+1]-arr[i];
                int l=arr[i]-arr[i-1];
                if(k>l)
                {
                    System.out.println(arr[i-1]);
                }
                else
                {
                    System.out.println(arr[i+1]);
                }
            }
        }
    }
}