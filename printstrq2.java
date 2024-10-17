import java.util.Scanner;

public class printstrq2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        while(row<=n){
            int i=1;
            while(i<=row){
                System.out.print("* "); 
                i++;   
            }
            System.out.println();
            row++;
        }
    }
    
}
