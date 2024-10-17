package lec35;

import java.rmi.server.RemoteStub;
import java.util.List;

public class intersection {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x)
        {
            val=x;
            next=null;
        }   
    }
    public class Solution{
        public ListNode ListgetIntersectionNode(ListNode headA,ListNode headB){
            ListNode A=headA;
            ListNode B=headB;
            while(A!=B)
            {
                if(A==null)
                {
                    A=headB;
                }
                else{
                    A=A.next;
                }
                if(B==null)
                {
                    B=headA;
                }
                else{
                    B=B.next;
                }
            }
            return A;
        }
    }
}
