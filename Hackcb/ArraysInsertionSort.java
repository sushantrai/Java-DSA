package Hackcb;
import java.util.Scanner;
public class ArraysInsertionSort 
{
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
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int[] arr ) 
    {
        for(int i=1;i<arr.length;i++)
        {
            int j=i-1;
            int temp=arr[i];
            while(j>=0&&arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=temp;
        }
    }
    
}
