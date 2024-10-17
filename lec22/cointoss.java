package lec22;
public class cointoss {
    public static void main(String[] args) {
        int toss=3;
        toss(toss, "");

    }
    public static void toss(int n,String ans) {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        toss(n-1, ans+"H");
        toss(n-1,ans+ "T");
    }
    
}
