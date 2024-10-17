package Hackcb;
import java.util.Scanner;
public class PainterPartitionProblem {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        // int[] page={10,20,30,40};
        // int nos=2;
        int nos=sc.nextInt();
        int brd=sc.nextInt();
        int[] page=new int[brd];
        for(int i=0;i<brd;i++)
        {
            page[i]=sc.nextInt();
        }
        System.out.println(mainpage(page, nos));
    }
   public static int mainpage(int [] page,int nos) 
   {
    int hi=0;
    for(int i=0;i<page.length;i++)
    {
        hi=hi+page[i];
    }
    int lo=0;
    int ans=0;
    while(lo<=hi)
    {
        int mid=(lo+hi)/2;
        if(isitpossible(page,mid,nos)==true)
        {
            ans=mid;
            hi=mid-1;
        }
        else{
            lo=mid+1;
        }
    }
    return ans;
   }
   public static boolean isitpossible(int[] page, int mid,int nos) {
    int student=1;
    int readpage=0;
    for(int i=0;i<page.length;)
    {
        if(readpage+page[i]<=mid)
        {
            readpage+=page[i];
            i++;
        }
        else
        {
            student++;
            readpage=0;
        }
         if(student>nos)
         {
            return false;
         }
   }
   return true;
}
}
