package Hackcb;
import java.util.*;
public class realdis 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int D=((b*b)-4*a*c);
        if(D>0)
        {
        realAndDist(a,b,c);
        }
       
         else if(D==0)
        {
           realAndEq(a,b,c);
        }
        else
        {
            System.out.println("Imaginary");

        }
    }
    static void realAndDist(int a,int b,int c){

           int root1=0,root2=0;
            System.out.println("Real and Distinct");
            root1=(int)(((-b)+Math.sqrt((b*b)-4*a*c))/(2*a));
            root2=(int)(((-b)-Math.sqrt((b*b)-4*a*c))/(2*a));
            if(root1>root2)
            System.out.println(root2 + " "+ root1);
            else
            System.out.println(root1 + " " + root2);
    }
        static void realAndEq(int a ,int b, int c)
        {
        int root1=0,root2=0;
         System.out.println("Real and Equal");
            root1=(int)(((-b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a));
             root2=(int)(((-b)-(Math.sqrt((b*b)-(4*a*c))))/(2*a));
            System.out.println(root1 + " "+ root2);
    }
}