import java.util.Scanner;
public class specificreverse {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val_i=sc.nextInt();
        int val_j=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        reverse(arr, val_i, val_j);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int[] arr,int val_i,int val_j) 
    {
     int i=val_i;
     int j=val_j;
     while(i<j)
     {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
     }   
    }
    
}
