import java.util.Scanner;

public class search {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(sear(arr, k));
    }
    public static int sear(int []arr,int k) 
    {
        for(int i=0;i<arr.length;i++)
        {
            if(k==arr[i])
            {
                return i;
            }
        }
        return -1;
    }  
} 
