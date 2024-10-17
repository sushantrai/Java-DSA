package lec39;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class levelorder {
    public  class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x)
        {
            val=x;
        }
    }
    private TreeNode root;
    public levelorder()
    {
        this.root=createTree();
    }
    public TreeNode createTree()
    {
        Queue<TreeNode>ll=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int item=sc.nextInt();
        TreeNode nn=new TreeNode(item);
        this.root=nn;
        ll.add(nn);
        while(!ll.isEmpty())
        {
            TreeNode rn=ll.remove();
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            if(c1!=-1)
            {
                TreeNode node=new TreeNode(c1);
                rn.left=node;
                ll.add(node);
            }
            if(c2!=-1)
            {
                TreeNode node=new TreeNode(c2);
                rn.left=node;
                ll.add(node);
            }
        }
        return root;
    }
}
