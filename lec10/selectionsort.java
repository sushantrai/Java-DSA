// selection sort algorithm is better than bubble and insertion
package lec10;
public class selectionsort 
{
    public static void main(String[] args) {
        int[] arr={4,5,2,7,8};
        sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int []arr) 
    {
     for(int i=0;i<arr.length;i++)
     {
        int mini=i;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]<arr[mini])
            {
            mini=j;
            }
        }
        int t=arr[i];
        arr[i]=arr[mini];
        arr[mini]=t;
     }   
    }
}
