package Lec44;

class unique_number{
    public static void main(String[] args) {
        int []arr={2,3,4,5,3,4,2};
        System.out.println(firstnumber(arr));
    }
    public static int firstnumber(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans=ans^arr[i];
        }
        return ans;
    }
}