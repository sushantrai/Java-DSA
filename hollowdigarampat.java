import java.util.*;
public class hollowdigarampat {
    public static void main(String[] args) {
        scanner sc=new scanner(System.in);
        int n=sc.nextInt();
		//n=(2*n)-1;
		int row = 1;
		int star = n / 2 + 1;
		int space = -1;
		while (row <= n) {
			// star
			int i = 1;
			while (i <= star) {
				System.out.print("*\t");
				i++;
			}
			// space
			int j = 1;
			while (j <= space) {
				System.out.print("\t");
				j++;
			}
			// star

			int k = 1;
			if(row==1 || row==n) {
				k++;
			}
			while (k <= star) {
				System.out.print("*\t");
				k++;
			}

			// mirror n/2 +1
			if (row <= n / 2) {
				star--;
				space += 2;
			}
			else {
				star++;
				space -= 2;
			}
			row++;
			System.out.println();
		}
    }
    
}