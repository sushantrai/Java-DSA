package Hackcb;
import java.util.Scanner;
public class HollowRhombusPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int star=1;
        int space2=n-2;
        int star2=1;
        int row=1;
        while(row<=n)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star)
            {
                if(row==1 || row==n)
                {
                    int m=1;                
                while(m<=n)
                {
                System.out.print("* ");
                m++;
                }
            }
            else{
                System.out.print("* ");
            }
            
                j++;
            }
            int k=1;
            while (k<=space2) 
            {
                if(row==1||row==n){

                }
                else{
                    System.out.print("  ");
                }
                
                k++;
                
            }
            int l=1;
            while(l<=star2)
            {
                if(row==1 || row==n)
                {

                }
            else
            {    
            System.out.print("* ");
            }
            l++;
            }
            System.out.println();
            row++;
            space--;
        }
    }
}
