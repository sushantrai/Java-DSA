package Hackcb;
import java.util.Scanner;
public class ArraysWavePrintrowWise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][]arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        rowwise(arr);
    }
    public static void rowwise(int[][] arr) 
    {
        int j=0;
        int n=arr.length;
        int m=arr[0].length;
        while(j<n)
        {
        if(j%2==0)
        {
            for(int i=0;i<m;i++)
            {
                System.out.print(arr[j][i]+", ");
            }
        }
        else
        {
            for(int i=(m-1);i>=0;i--)
            {
                System.out.print(arr[j][i]+", ");
            }
        }
        j++;
    }
    System.out.println("END");

    }
    
}
