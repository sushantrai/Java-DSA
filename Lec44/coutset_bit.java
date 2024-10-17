package Lec44;

public class coutset_bit {
    public static void main(String[] args) {
        int n=57;
        System.out.println(countset(n));
    }
    
    public static int countset(int n)
    {
        int ans=0;
        while(n>0)
        {
            if((n&1)!=0)
            {
                ans++;
            }
            n>>=1;
        }
        return ans;
    }
}
