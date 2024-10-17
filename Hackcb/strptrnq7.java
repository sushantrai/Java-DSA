package Hackcb;
import java.util.*;
public class strptrnq7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        while(row<=n)
        {
            if(row==1 || row==n )
            {
                int i=1;
                while(i<=n){
                    System.out.print("* ");
                    i++;
                }
            }
            else
            {
                System.out.print("* ");
                int j=1;
                while(j<=n-2)
                {
                    System.out.print("  ");
                    j++;
                }
                System.out.print("* ");
            }
            row++;
            System.out.println();
        }
    }
}
