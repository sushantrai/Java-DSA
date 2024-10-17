package lec33;
import java.util.*;;
public class stockspan {
    public static void main(String[] args) {
        int[] arr = { 91, 11, 13, 15, 38, 42, 37 };
		SPan_Cal(arr);
	}
	public static void SPan_Cal(int[] arr) {
		int[] span = new int[arr.length];
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			// Span

			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				st.pop();
			}

			if (st.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - st.peek();
			}
			st.push(i);

		}
		for (int i = 0; i < span.length; i++) {
			System.out.println(arr[i] + " " + span[i]);
		}
    }
}
