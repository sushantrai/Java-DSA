package Lec44;
public class checkbit {
    public static void main(String[] args) {
        int n=89;
        int pos=4;
        if(setbit(n, pos))
        {
            System.out.println("set");
        }
        else{
            System.out.println("Not set");
        }
    }
    
    public static boolean setbit(int n,int pos)
    {
        int mask=1<<pos;
        if((n & mask)!=0){
            return true;
        }
        else{
            return false;
        }


    }
}
