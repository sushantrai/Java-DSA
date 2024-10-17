package Pattern;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            int j=0;
            while(j<i)
            {
                System.out.print("*"+" ");
                j++;
            }
            System.out.println();
        }
    }
}
