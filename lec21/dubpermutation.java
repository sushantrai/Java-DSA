package lec21;
import java.util.Scanner;
public class dubpermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        dubper(str,"");
    }
    public static void dubper(String ques,String ans)
    {
        if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {

			char ch = ques.charAt(i);
			boolean flag = true;
			for (int j = i + 1; j < ques.length(); j++) {
				if (ques.charAt(j) == ch) {
					flag = false;
					break;
				}
			}
			// flag---False
			if (flag == true) {
				String ros = ques.substring(0, i) + ques.substring(i + 1);

				dubper(ros, ans + ch);

			}
		}
    }
}
