package Lec50;

public class coinchangeII {
    public static void main(String[] args) {
        int arr[]={2,1,3,4};
        int amount=10;

    }   
    public static int coinchange(int[] coin,int amount,int index)
    {
        if(amount==0)
        {
            return 1;
        }
        if(index==coin.length)
        {
            return 0;
        }
        int inc=0,exc=0;
        if(amount>=coin[index])
        {
            inc=coinchange(coin, amount-coin[idx], index)
        }
        exc=coinchange(coin, amount, index+1)
    } 
}
