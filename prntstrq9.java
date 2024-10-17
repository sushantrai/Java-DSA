public class prntstrq9 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int space = n;
		int star = 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print("* " + "  ");
				j++;
			}
			// next row
			space--;
			star ++;// star = star +2;
			row++;
			System.out.println();

		}

	}

}
