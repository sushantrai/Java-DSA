package Lec44;
public class count_bit2 {
    public static void main(String[] args) {
        int n=57;
        System.out.println(fastcountset(n));
    }
    public static int fastcountset(int n)
    {
        int ans=0;
        while(n>0)
        {
            ans++;
            n=(n&(n-1));
        }
        return ans;
    }
}
