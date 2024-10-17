package lec3;
import java.util.Scanner;
public class series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int i=1;
        int start=x+1;
        System.out.println(x+1);
        while(i<n)
        {
            if(i==1 || i==4||i==7 ||i==10 ||i==13 ||i==16 ||i==19 ||i==22 ||i==25
            ||i==28 ||i==31 ||i==34 ||i==37 ||i==40 ||i==43 ||i==46 ||i==48 ||i==51 ||i==54 ||i==57 ||i==60
            ||i==63 ||i==66  ||i==68  ||i==71 ||i==74  ||i==77  ||i==80  ||i==83  ||i==86 ||i==89 ||i==92 ||i==95 ||i==98  ||i==101)
            {
                start=start+6;
            }
            else{
                start=start+3;
            }
            System.out.println(start);
            start=start+0;
            i++;
        }
    }    
}
