import java.util.Scanner;

public class printstar {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=n;
        int row=1,i=1;
        while(row<=n)
        {
            System.out.print("* ");
            i++;
            while(i<=star) {
            	row++;
            	System.out.println();
            }
        }

    }

    
}
