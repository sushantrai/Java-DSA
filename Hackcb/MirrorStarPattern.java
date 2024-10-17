package Hackcb;
import java.util.Scanner;
public class MirrorStarPattern
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=((n+1)/2);
        int star=1;
        int row=1;
        if(n%2!=0)
        {
        while(row<=n)
        {
            int i=1;
            while(i<(space))
            {
                System.out.print("\t");
                i++;
            }
            int j=1;
            while(j<=star)
            {
                System.out.print("*\t");
                j++;
            }
            System.out.println();
            row++;
            if(row<=(n/2)+1)
            {
                star=star+2;
                space--;
            }
            else
            {
                space++;
                star=star-2;
            }
        }
    }
    }
            

}
