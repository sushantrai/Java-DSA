package lec3;

public class q27 {
    public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int space = n - 1;
		int star = 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			// star
			int val=row;
			int j = 1;
			while (j <= star) {				
				System.out.print(val + "\t");
				if (j <= star / 2) {
					val++;
				} 
				else {
					val--;
				}
				j++;

			}
			// next row
			space--;
			star += 2;// star = star +2;
			row++;
			System.out.println();

		}

	}
}