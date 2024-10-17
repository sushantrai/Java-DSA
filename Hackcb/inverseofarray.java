package Hackcb;
import java.util.Scanner;
public class inverseofarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        rev(arr);

    }
    public static void rev(int[] arr) 
    {
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arr2[arr[i]]=i;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        }
}
