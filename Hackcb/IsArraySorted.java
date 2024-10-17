package Hackcb;

import java.util.Scanner;

public class IsArraySorted {
    static int temp=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(issorted(arr,1));
    }
    public static boolean issorted(int[] arr,int idx) 
    {
        if(arr.length <=1) return true;
        return sortedHelper(arr , 1 );
    }

    //created this helper method as in Java we cannot do(arr + 1) (Java does not allow us to play with pointers)
    // Java allows us to create references but at backend it uses concept of pointers.

    //we have passed the index value and if condition is satisfied we increase idx + 1;

    public static boolean sortedHelper(int[] arr , int idx){
        if(idx ==arr.length)
            return true;
        if(arr[idx - 1] > arr[idx])
            return false;
        return sortedHelper(arr , idx + 1);
    }
}
