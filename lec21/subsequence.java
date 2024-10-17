package lec21;
import java.util.Scanner;
public class subsequence {
	static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
		Print(str, "");
		System.out.println("\n"+count);
	}

	public static void Print(String ques, String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		char ch = ques.charAt(0);
		Print(ques.substring(1), ans);
		Print(ques.substring(1), ans+ch);
    }   
}
