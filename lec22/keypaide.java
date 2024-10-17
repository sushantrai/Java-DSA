package lec22;

public class keypaide {
    static String[] arr = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

	public static void main(String[] args) {
		String str = "189";//
		KeyPaid(str, "");

	}
	public static void KeyPaid(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = ques.charAt(0);//yha character value 1 hain int ascii value ke form me hain jo li hamne input diya hain String str = "189" me 
		int idx = ch - '0';//yha hm isme se char 0 substract kr rhe hain jiska value 48 hain means hmne char at 0 pe 1 store karaya hain to 49-48 int me. 
		String key = arr[idx];
		for (int i = 0; i < key.length(); i++) {
			KeyPaid(ques.substring(1), ans + key.charAt(i));

		}

	}
}