package lec22;
import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        int[] arr={2,3,7,3,3,7,6,3};
        int item=3;
        System.out.println(rtidx(arr, 0,item));
    }
    public static int rtidx(int[]arr,int i,int item) 
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==item)
        {
            return i;
        }
        return rtidx(arr, i+1, item);
    }
}
