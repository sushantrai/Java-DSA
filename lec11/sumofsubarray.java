package lec11;
public class sumofsubarray {
    public static void main(String[] args) {
        int []arr={2,3,-4,-1,3,-9};
        System.out.println(subarraysum(arr));
    }
    public static int subarraysum(int[] arr) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}