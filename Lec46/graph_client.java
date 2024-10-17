package Lec46;
import java.util.HashSet;
public class graph_client {
    public static void main(String[] args) {
        graph g=new graph(7);
        g.addedge(1, 4, 6);
		g.addedge(1, 2, 10);
		g.addedge(2, 3, 7);
		g.addedge(3, 4, 5);
		g.addedge(4, 5, 1);
		g.addedge(5, 6, 4);
		g.addedge(7, 5, 2);
		g.addedge(6, 7, 3);
        g.display();
        System.out.println(g.haspath(1, 6, new HashSet<>()));
    }
}
