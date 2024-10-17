package lec9;
public class maxinarray {
    public static void main(String[] args) {
        int []arr={10,20,3,4,5,7,8,9,91,-77,56};
        int x=arr.length;
        System.out.println(maxof(arr,x));
    }
    public static int maxof(int []arr,int x) 
    {
        int largest=Integer.MIN_VALUE;
        {
            for(int i=0;i<x;i++)
            {
                if(largest<arr[i])
                {
                    largest=arr[i];
                }
            }
            return largest;
        }   
    }
}