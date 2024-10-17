package lec9;

public class swaparray {
    public static void main(String[] args) {
        int []arr={10,20,3,4,5,7,8,9,91,-77,56};
        rev(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static void rev(int []arr) 
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
