package Hackcb;
import java.util.Scanner;
public class bookallocation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0)
        {
            int nop=sc.nextInt();
           int nos=sc.nextInt();
           int[] page=new int[nop];
           for(int i=0;i<nop;i++)
           {
            page[i]=sc.nextInt();
           }
        System.out.println(mainpage(page, nos));
        n--;
    }
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
