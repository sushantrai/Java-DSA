package lec3;

import java.util.Scanner;

public class pascaltri 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=0;
        int star=1;
        while(row<=n-1)
        {
            int i=0;
            int val=1;
            while(i<star)
            {
                System.out.print(val+" ");
                val=((row-i)*val)/(i+1);
                i++;
            }
            row++;
            System.out.println();
            star++;
        }
    }
    
}
