package Hackcb;
import java.util.Scanner;
public class nobita {
    public static void main (String args[]) 
    {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int i=1;
        int[] rem=new int[10];
        while(i<=n)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            rem[i]=x%y;
            i++;
            
        }
        int j=1;
        while(j<=n)
        {
                System.out.println(+rem[j]);
                j++;
        }
    }
}
