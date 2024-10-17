import java.util.Scanner;
public class hcf {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=x;
        int b=y;
        while(a!=b)
    {
        if(a<b)
            a=a+x;
        else
            b=b+y;
    }
    System.out.println("LCM is "+a);
    a=x; b=y;
    while(a!=b )
    {
        if(a>b)
            a=a-b;
        else
            b=b-a;
    }
    System.out.println("HCF is "+a);
    }
    
}
