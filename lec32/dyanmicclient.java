package lec32;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import lec31.stack;
import lec4.reverse;
public class dyanmicclient {
    public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue dq = new DynamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.Enqueue(60);
		dq.Display();
		

	}
}