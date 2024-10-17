// when array is already sorted insertion sort is better
package lec10;
public class insertionsort {
    public static void main(String[] args) {
        int[] arr={4,5,2,7,8};
        sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void sort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int j=i-1;
            int temp=arr[i];
            while(j>=0&&arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=temp;
        }
    }
    
}
