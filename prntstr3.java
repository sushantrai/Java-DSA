import java.util.Scanner;
public class prntstr3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int str=n;
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=str)
            {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row++;
            str=n-row+1;
        }
    }
}
