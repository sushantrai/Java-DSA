package lec4;
import java.util.Scanner;
public class fab {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n1=0,n2=1,n3=0,i;
        int n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            n3=n1+n2; 
            System.out.print(n3);
            System.out.print(" ");
            n1=n2;    
            n2=n3; 

        }
    }
}
