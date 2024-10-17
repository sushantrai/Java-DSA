package Hackcb;
import java.util.Scanner;
public class Findthegreaterelement {
    public static void nextgreater(int[] arr)
    {
        int n=arr.length;
        int next, i, j;
        for (i = 0; i < n; i++) {
            next = -1;
            for (j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.print(next+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++ )
        {
            arr[i]=sc.nextInt();
        }
        nextgreater(arr);
    }
}
