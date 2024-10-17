package lec42;
import java.util.PriorityQueue;
import lec35.intersection.ListNode;
public class MergekSortedLists {
}
class solution
{
    public ListNode mergeklists(ListNode[] list)
    {
        PriorityQueue<ListNode>pq=new PriorityQueue<>(new Comapataor());
        for(int i=0;i<list.length;i++)
        {
            if(list[i]!=null)
            {
                pq.add(list[i]);
            }
        }
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        while(!pq.is)

    }
}
