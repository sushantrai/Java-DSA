package lec34;
import java.util.List;
public class linklit_client {
    public static void main(String[] args) throws Exception {
        linkedlist list=new linkedlist();
        list.addfirst(10);
		list.addfirst(20);
		list.addfirst(30);
		list.addlast(40);
//		list.Display();
		list.addatindex(2, -90);
		list.display();
//		System.out.println(list.getfirst());
//		System.out.println(list.getlast());
//		System.out.println(list.getatindex(2));
		// System.out.println(list.removefirst());
//		System.out.println(list.removelast());
		System.out.println(list.removeatindex(2));
		list.display();
    }
}
