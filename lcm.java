import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i;
        int gcd=0;
        for(i=1; i <= n && i <= m; ++i)
    {
        if(n%i==0 && m%i==0)
            gcd = i;
    }
    int lcm=(n*m)/gcd;
    System.out.println(lcm);
    }
    
}
