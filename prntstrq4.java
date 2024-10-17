import java.util.Scanner;
public class prntstrq4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space=n-1;
		int row=0;
		while(row<=n)
		{
			int j=1;
			while(j<=space)
			{
				System.out.print("  ");
				j++;
			}
			int i=1;
			while(i<=star)
			{
				System.out.print("* ");
				i++;
			}
			space--;
			star++;
			row++;
			System.out.println();
		}
	}
}