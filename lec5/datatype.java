package lec5;
//import java.util.*;
public class datatype {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // int n=sc.nextInt();
        byte b=19;
        int x=300;
        System.out.println(b);
        System.out.println(x);
        b=(byte)(x);
        System.out.println(b);
        //integer
        byte bb=78;
        int ii=7871;
        ii=bb;
        System.out.println(ii);
        long ll=3888889990l;
        //decimal
        float f=7671.89f;
        double d=7671.89;
        //boolean
        boolean b1=true;
        boolean b2=false;
        //character
        //a=97---z=122,A=65---Z=90
        char ch='a';
        System.out.println(ch);
        System.out.println((int)(ch));
        ch++;
        System.out.println(ch);     
    }   
}