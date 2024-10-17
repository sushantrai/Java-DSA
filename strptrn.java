import java.util.Scanner;
public class strptrn 
{
    public static void main(String[] args)
    { 
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while (row <= n) {
            if (row == 1 || row == n) {
                int i = 1;
                while (i <= n) {
                    System.out.print("*" + " ");
                    i++;
                }
            } else {
                System.out.print("*" + " ");
                int i = 1;
                while (i <= n-2) {
                    System.out.print("  ");
                    i++;
                }
                System.out.print("*"+" ");
            }
            row++;
            System.out.println();
       }
}
}