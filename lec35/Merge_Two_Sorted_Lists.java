package lec35;

public class Merge_Two_Sorted_Lists {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x)
        {
            val=x;
            next=null;
        }   
    }
    class Solution {
        public ListNode mergetwolists(ListNode list1,ListNode list2)
        {
            ListNode dummy=new ListNode(0);
            while(list1!=null &&list2!=null)
            {
                if(list1.val<list2.val)
                {
                    dummy.next=list1;
                    dummy=dummy.next;
                    list1=list1.next;
                }
                else{
                    dummy.next=list2;
                    dummy=dummy.next;
                    
                }
            }
        }
    }
}
