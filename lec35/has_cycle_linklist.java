package lec35;

import org.w3c.dom.Node;

public class has_cycle_linklist {
    public class node{
        int data;
        node next;
    }
    private node head;
    private int size=0;
    private node tail;
    public void addfirst(int item)
    {
        node nn=new node();
        nn.data=item;
        if(this.size==0)
        {
            this.head=nn;
            this.tail=nn;
            this.size++;
        }
        else{
            nn.next=head;
            head=nn;
            this.size++;
        }
    }
    public void addlast(int item)
    {
        if(this.size==0)
        {
            addfirst(item);
        }
        else{
            node nn=new node();
            nn.data=item;
            this.tail.next=nn;
            tail=nn;
            this.size++;
        }
    }
    public void CreatCycle()
    {
        this.tail.next=this.head.next;
    }
    public boolean hasCycle(Node head)
    {
        Node fast=head;
        Node slow=head;
        
    }
}
