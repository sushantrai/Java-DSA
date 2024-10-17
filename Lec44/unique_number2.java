package Lec44;

public class unique_number2 {
    public static void main(String[] args) {
        int []arr={2,3,4,5,3,4,2,6};
        firstnumber(arr);
    }
    
    public static void firstnumber(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans=ans^arr[i];
        }
        int a=0;
        int mask=ans&(~(ans-1));
        for(int i=0;i<arr.length;i++)
        {
            if((mask&arr[i])==0)
            {
                a=a^arr[i];
            }
        }
        int b=ans^a;
        System.out.println(a+" "+b);
    }
}
