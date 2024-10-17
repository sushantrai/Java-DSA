package lec12;

public class binarysearch 
{
    public static void main(String[] args) {
        int[] arr={3,5,6,8,11,15,18,19,20,21};
        int item=18;
        System.out.println(search(arr, item));
    }
    public static int search(int[] arr,int item) {
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(arr[mid]==item)
            {
                return mid;
            }
            else if(arr[mid]>item)
            {
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return -1;
    }
    
}
