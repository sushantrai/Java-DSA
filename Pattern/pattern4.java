package Pattern;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n-1;
        int star=1;
        while(row<=n)
        {
            int i=0;
            while(i<space)
            {
                System.out.print("  ");
                i++;
            }
            int j=0;
            while(j<star)
            {
                System.out.print("* ");
                j++;
            }
            space--;
            star++;
            row++;
            System.out.println();
        }
    }
}
