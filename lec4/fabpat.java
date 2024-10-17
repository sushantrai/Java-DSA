package lec4;
import java.util.Scanner;
public class fabpat {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int star = 1;
		int row = 1;
        int a =0;
        int b=1;
		while (row <= n)
        {
			int i = 1;
			while (i <= star) {
                int c=a+b;
				System.out.print(a+"\t");
                a=b;
                b=c;
				i++;
			}
			star++;
			row++;
			System.out.println();
    }
    }
}
