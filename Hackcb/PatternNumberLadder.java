package Hackcb;
import java.util.*;
public class PatternNumberLadder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int val=1;
        while(row<=n)
        {
            int i=1;
            while(i<=star)
            {
                
                    System.out.print(val+" ");
                    val=val+1;
                    i++;
            }
            System.out.println();
            row++;
            star++;
        }
    }
    
}
