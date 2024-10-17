package Hackcb;
import java.util.Scanner;
public class PatternRhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int row=1;
        int space=n-1;
        int val=0;
        while(row<=2*n-1)
        {
            val=val+row;
            int i=1;
            while(i<=space)
            {
                System.out.print("\t");
                i++;
            }
            int j=1;
            while(j<=star)
            {
                System.out.print(val+"\t");
                j++;
                if(j<=(star+1)/2)
                {
                    val=val+1; 
                }
                else{
                    val=val-1;
                }
            }
            if(row<=(2*n-1)/2){
                star=star+2;
                space=space-1;
            }
            else{
                star=star-2;
                space=space+1;
                val=val-row-3;
            }
            row++;
            System.out.println();
        }
    }
    
}
