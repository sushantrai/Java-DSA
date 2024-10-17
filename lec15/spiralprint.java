package lec15;
import java.util.Scanner;
public class spiralprint {
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
        while(minr<=maxr && minc<=maxc && count<te)
        {
        for(int i=minc;i<=maxc && count<te;i++)
        {
            System.out.print(arr[minr][i]+", ");
            count++;
        }
        minr++;
        for(int i=minr;i<=maxr && count<te;i++)
        {
            System.out.print(arr[i][maxc]+", ");
            count++;
        }
        maxc--;
        for(int i=maxc;i>=minc && count<te;i--)
        {
            System.out.print(arr[maxr][i]+", ");
            count++;
        }
        maxr--;
        for(int i=maxr;i>=minr && count<te;i--)
        {
            System.out.print(arr[i][minc]+", ");
            count++;
        }
        minc++;
    }
    System.out.println("END");
    }
}
