import java.util.Scanner;

public class ptrnstrq21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int n=5;
        int outerSpace = 0;
		int innerSpace = 2 * n - 3;
		int star = 1;
		int row = 1;

		while (row <= n) {

			int i = 1;
			while (i <= outerSpace) {
				System.out.print(" ");
				i++;
			}

			int j = 1;
			while (j <= star) {
				System.out.print("*"+" ");
				j++;
			}
			// inner space

			int k = 1;
			while (k <= innerSpace) {
				System.out.print("  ");
				k++;

			}

			int m = 1;
            if(row==n)star=n-1;
			while (m <= star) {
				System.out.print("*"+" ");
				m++;
			}

			// next row Preparation
			innerSpace -= 2;
			star++;
			row++;
			System.out.println();
		}

    }
    
}
