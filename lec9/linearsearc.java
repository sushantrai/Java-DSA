package lec9;

public class linearsearc {
    public static void main(String[] args) {
        int []arr={10,20,3,4,5,7,8,9,91,-77,56};
        int item=5;
        int x=arr.length;
        System.out.println(linearsearch(arr,item,x));
    }
    public static int linearsearch(int []arr,int y,int x) 
    {
        for(int i=0;i<x;i++)
        {
            if(arr[i]==y)
            {
                return i;
            }
        }
        return -1;
    }
    
}
