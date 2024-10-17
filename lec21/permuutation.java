package lec21;
import java.util.Scanner;
public class permuutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
		printPermutation(str, "");
	}
	public static void printPermutation(String ques, String ans) {
		if (ques.length() == 0) {
			//System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			printPermutation(ros, ans + ch);
		}
        
    }
}
