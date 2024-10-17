package Hackcb;
import java.util.Scanner;
public class PatternwithZeros {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int stars=1;
    int row=1;
    while(row<=n)
    {
        int i=row;
        
        int j=1;
        while(j<=stars)
        {
            if(j==1 || j==i)
            {
                System.out.print(row+" ");
            }
            else
            {
                System.out.print("0 ");
            }
        j++;
        }
    row++;
    stars++;
    System.out.println();
    }
    }
}
