package Hackcb;
import java.util.Scanner;
public class problem1743 {
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    
		int n = sc.nextInt();
        int x=sc.nextInt();
        int rem;
        rem=n%x;
        System.out.print(+rem);
    }
}
