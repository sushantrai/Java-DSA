package Pattern;
import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=0;
        
        while(row<=n)
        {
            if(row==1||row==n)
        {
            star=n;
        }
        else{
            star=1;
        }
        int star2=0;
        if(row==1||row==n)
        {
            star2=0;
        }
        else{
            star2=1;
        }
        int space=0;
        if(row==1||row==n)
        {
            space=0;
        }
        else{
            space=n-2;
        }
            int i=0;
            while(i<star)
            {
                System.out.print("* ");
                i++;
            }
            int j=0;
            while(j<space)
            {
                System.out.print("  ");
                j++;
            }
            int k=0;
            while(k<star2)
            {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            row++;
        }
    }
}
