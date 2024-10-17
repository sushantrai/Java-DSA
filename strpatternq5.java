import java.util.Scanner;

public class strpatternq5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int row=1;
		int star=n;
		int space=0;
		while(row<=n)
		{
			int i=1;
			while(i<=star)
			{
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=space)
			{
				System.out.print("  ");
				j++;
			}
			System.out.println();
			star--;
			space++;
			row++;

		}
	}

}