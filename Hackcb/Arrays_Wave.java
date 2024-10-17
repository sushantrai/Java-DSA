package Hackcb;
import java.util.Scanner;
public class Arrays_Wave {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        wave(arr);
    }
    public static void wave(int[][]arr) 
    {
        int j=0;
        int length =arr.length;
        while(length>j)
        {
        if(j%2==0)
        {
            for(int i=0;i<length;i++)
            System.out.print(arr[i][j]+", ");
        }
        else
        {
            for(int i=length-1;i>=0;i--)
            {
                System.out.print(arr[i][j]+", ");
            }
        }
        j++;
    }
    System.out.println("END");
    }
}
