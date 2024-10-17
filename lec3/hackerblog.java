package lec3;
import java.util.Scanner;
public class hackerblog {
    public static void main(String[] args) {
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
            int val=1;
            int j=1 ;
			while (j <= star) {
                if(j<=star/2){
                }
                else{
                    val--;
                }
				System.out.print(+val+ "  ");
				val++;
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
