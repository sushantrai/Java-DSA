package lec31;

public class queue_client {
    public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		queue qq = new queue();

		qq.Enqueue(10);
		qq.Enqueue(20);
		qq.Enqueue(30);
		qq.Enqueue(40);
		qq.Enqueue(50);
		System.out.println(qq.Dequeue());
		System.out.println(qq.Dequeue());
		qq.Enqueue(60);
		qq.Enqueue(70);
		qq.Display();

	}
}
