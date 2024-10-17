package leetcode;
import java.util.ArrayList;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(twosu(nums, target));
    }
    public static int twosu(int[]nums,int target) 
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                int num=target-nums[i];
                if(nums[i]==num)
                {
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalAccessException()
    }
    
}
