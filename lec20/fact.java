package lec20;
import java.util.Scanner;
public class fact {
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int chhotiproblem=factorial(n-1);
        int baddiproblem=n*chhotiproblem;
        return baddiproblem;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
}
