import java.util.Scanner;

public class strptrnq10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=2*n-1;
        int space=0;
        int row=1;
        while(row<=n)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print(" ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            space=space+2;
            star=star-2;
            row++;
        }
    }
    
}
