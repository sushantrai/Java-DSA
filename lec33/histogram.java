package lec33;
import java.util.*;;
public class histogram {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println(Area(arr));
        }
        public static int Area(int[] arr) {
    
            int ans = 0;
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < arr.length; i++) {
                while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                    int h = arr[st.pop()];
                    int r = i;
                    if (!st.isEmpty()) {
                        int l = st.peek();
                        ans = Math.max(ans, h * (r - l - 1));
                    } else {
                        ans = Math.max(ans, h * r);
                    }
                }
                st.push(i);
            }
            int r = arr.length;
            while (!st.isEmpty()) {
                int h = arr[st.pop()];
    
                if (!st.isEmpty()) {
                    int l = st.peek();
                    ans = Math.max(ans, h * (r - l - 1));
                } else {
                    ans = Math.max(ans, h * r);
                }
            }
            return ans;
    
    }
}
