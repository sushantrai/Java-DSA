package Hackcb;
import java.util.Scanner;
public class ArraysBubbleSort {
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
            System.out.println(arr[i]);
        }
    }
    public static void sort(int[] arr ) 
    {
        for (int trun = 1; trun < arr.length; trun++) {
			for (int i = 0; i < arr.length - trun; i++) {
				if (arr[i] > arr[i + 1]) {
					int t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
				}

			}
		}
        
    }
    
}