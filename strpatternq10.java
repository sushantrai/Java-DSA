public class strpatternq10 {
    public static void main(String[] args) {
		int n = 9;
		int row = 1;
		int space = n;
		int star = 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= star) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			while (j <= space) {
				System.out.print("*" + " ");
				j++;
			}
			// next row
			space = space-2;
			star++;
			row++;
			System.out.println();

		}

	}

}
