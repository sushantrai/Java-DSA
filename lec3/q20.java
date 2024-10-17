package lec3;
import java.util.Scanner;
public class q20 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int star=1;
        int val=1;
        int row=1;
        while(row<=n) {
        	int i=1;
        	while(i<=space)
        	{
        		System.out.print("\t");
        		i++;
        	}
        	int j=1;
        	while (j<=star) {
        		System.out.print(+val+"\t");
        		j++;
                val++;
        	}
        	star+=2;
        	space--;
        	row++;
        	System.out.println();
        }
    }
}
