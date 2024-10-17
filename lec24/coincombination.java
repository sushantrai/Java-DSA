package lec24;

public class coincombination {
    public static void main(String[] args) {
        int[] coin={2,3,8,5};
        int amount =10;
        coinx(coin, amount,"",0);
    }
    public static void coinx(int[]coin,int amount, String ans,int idx) 
    {
        if(amount==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<coin.length;i++)
        {
            if(amount>=coin[i])
            {
                coinx(coin, amount-coin[i], ans+coin[i],i);
            }
        }
    }
    
}
