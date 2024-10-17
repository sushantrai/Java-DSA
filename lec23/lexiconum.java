package lec23;
import java.util.Scanner;
public class lexiconum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        printret(0, n);

    }
    public static void printret (int curr,int end) 
    {
        if (curr > end) {
			return;
		}
		System.out.println(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}

		for (; i <= 9; i++) {
			printret(curr * 10 + i, end);
		}
    }
}
