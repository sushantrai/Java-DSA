package lec31;

import javax.sql.rowset.spi.SyncResolver;

public class stack_client {
    public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		stack s = new stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.Display();
		System.out.println(s.peek());
		s.push(40);
		s.push(50);
		s.Display();
	}
}
