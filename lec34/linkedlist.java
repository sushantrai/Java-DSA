package lec34;
public class linkedlist {
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
    public node getnode(int k) throws Exception
    {
        if(k<0||k>=this.size)
        {
            throw new Exception("value of k must be in range ");
        }
        node temp=head;
        for(int i=1;i<=k;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
    public void display()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
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
    public void addatindex(int k,int item) throws Exception 
    {
        if(k==0)
        {
            addfirst(item);
        }
        else if(k==size)
        {
            addlast(item);
        }
        else{
            node k_1th=getnode(k-1);
            node nn=new node();
            nn.data=item;
            nn.next=k_1th.next;
            k_1th.next=nn;
            this.size++;
        }
    }
    public int getfirst() throws Exception
    {
        if(this.size==0)
        {
            throw new Exception("Linkedlist is Eampty");
        }
        return head.data;
    }
    public int getlast() throws Exception
    {
        if(this.size==0)
        {
            throw new Exception("Linkedlist is Eampty");
        }
        return tail.data;
    }
    public int getatindex(int k) throws Exception
    {
        if(this.size==0)
        {
            throw new Exception("Linkedlist is Eampty");
        }
        return getnode(k).data;
    }
    public int removefirst() throws Exception
    {
        if(this.size==0)
        {
            throw new Exception("linkedlist is Eampty");
        }
        if(this.size==1)
        {
            int rv=head.data;
            head=null;
            tail=null;
            this.size--;
            return rv;
        }
        else
        {
            node temp=this.head;
            this.head=this.head.next;
            temp.next=null;
            this.size--;
            return temp.data;
        }
    }
    public int removelast() throws Exception
    {
        if(this.size==0)
        {
            throw new Exception("Linkedlist is Eampty");
        }
        else
        {
            node sl=getnode(this.size-2);
            int temp=tail.data;
            this.tail=sl;
            this.tail.next=null;
            this.size--;
            return temp;
        }
    }
    public int removeatindex(int k) throws Exception
    {
        if(this.size==0)
        {
            throw new Exception("Linkedlist is Eampty");
        }
        if(k==0)
        {
            return removefirst();
        }
        else if(k==size-1){
            return removelast();
        }
        else{
            node k_1th=getnode(k-1);
            node kth=k_1th.next;
            k_1th.next=kth.next;
            kth.next=null;
            this.size--;
            return kth.data;
        }
    }
}