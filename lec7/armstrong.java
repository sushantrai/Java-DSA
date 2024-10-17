package lec7;

import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		System.out.println(IsArmstrong(n));

	}

	public static boolean IsArmstrong(int n) {
		int d = counofdigit(n);
		int sum = 0;
		int x = n;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, d));
			n = n / 10;
		}

		if (sum == x) {
			return true;
		} else {
			return false;
		}

	}

	public static int counofdigit(int n) {
		int c = 0;
		while (n != 0) {
			c++;
			n = n / 10;

		}
		return c;

	}
}
