package Pattern;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n;
        int space=0;
        while(row<=n)
        {
            int j=0;
            while(j<space)
            {
                System.out.print("  ");
                j++;
            }
            int i=0;
            while(i<star)
            {
                System.out.print("* ");
                i++;
            }
            star--;
            row++;
            space++;
            System.out.println();
        }
    }
}