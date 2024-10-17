package Hackcb;
import java.util.Scanner;
public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr =new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
		System.out.println(Search(arr, target));
	}
	public static int Search(int[][] arr, int target) {
		int col = arr[0].length - 1;
		int row = 0;
		while (col >= 0 && row < arr.length) {

			if (arr[row][col] == target) {
				return 1;
			} else if (arr[row][col] < target) {
				row++;

			} else {
				col--;
			}

		}
		return 0;
    }
    
}
