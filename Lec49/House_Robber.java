package Lec49;

public class House_Robber {
    public static void main(String[] args) {
         int []arr={2,7,9,3,1};
         System.out.println(Robber(arr, 0));
         int[] dp=new int [arr.length];
         RobberBU(arr);
    }
    public static int Robber(int []arr,int i)
    {
        if(i>=arr.length)
        {
            return 0;
        }
        int rob=Robber(arr, i+2);
        int dontrob=Robber(arr, i+1);
        return Math.max(arr[i]+rob, dontrob);
    }
    public static int RobberTD(int []arr,int i,int[] dp)
    {
        if(i>=arr.length)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        int rob=RobberTD(arr, i+2,dp);
        int dontrob=RobberTD(arr, i+1,dp);
        return Math.max(arr[i]+rob, dontrob);
    }
    public static int RobberBU(int[] arr)
    {
        int[] dp= new int [arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0], arr[1]);
        for(int i=2;i<dp.length;i++){
            int rob=dp[i-2];
            int dontrob=dp[i-1];
            dp[i]=Math.max(arr[i]+rob, dontrob);
        }
        return dp[arr.length-1];
    }
}
