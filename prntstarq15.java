import java.util.Scanner;
public class prntstarq15  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		int space = n-5;
		while (row <= 2 * n - 1) {

			int i = 1;
			while (i <= space) {
				System.out.print("        ");
				i++;
			}

			// star
			int j = 1;
			while (j <= star) {
				System.out.print("* " + " ");
				j++;
			}
			if (row < n) {
				space++;
				star--;
			} else {
				space--;
				star++;
			}
			row++;
			System.out.println();

		}

	}
}