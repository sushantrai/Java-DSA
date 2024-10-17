package Hackcb;
import java.util.*;
public class SpiralPrintAnticlockwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr= new int[n][m];
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        display(arr);
    }
    public static void display(int [][]arr)
    {
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int count=0;
        int te=arr.length*arr[0].length;
               
    }
}