package Hackcb;
import java.util.*;
public class PatternInvertedHourGlass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
		int space=2*n-1;
		int star2=1;
		int row=1;
		while(row<=2*n+2)
		{
			int val=n;
			int val2=n+1;
			int i=1;
			while(i<=star)
			{
				System.out.print(val+" ");
				i++;
				val--;
			}
			int j=1;
			while(j<=space)
			{
				System.out.print("  ");
				j++;
			}
			int k=1;
			if(row==n+1 ||row==n+2)
			{
				star2=n;
			}
			while(k<=star2)
			{
				System.out.print(val2-star2+" ");
				val2++;
				k++;
			}
			if(row>n)
			{
				star--;
				star2--;
				space=space+2;
			}
			else{
				star++;
				star2++;
				space=space-2;
			}
			System.out.println();
			row++;
		}
    }
}
