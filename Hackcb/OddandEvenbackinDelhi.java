package Hackcb;
import java.util.Scanner;
public class OddandEvenbackinDelhi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
        int vechno=sc.nextInt();
        int even=0;
        int odd=0;
        while(vechno>0){
            int rem=vechno%10;
            if (rem%2==0){
                even=even+rem;
            }
            else
            {
                odd=odd+rem;
            }
            vechno=vechno/10;
        }
        int z=odd;
        if(even%4==0 ||z%3==0)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        t--;
    }
}
}
