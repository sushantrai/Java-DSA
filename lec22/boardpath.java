package lec22;

import java.util.Scanner;

public class boardpath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int end=sc.nextInt();
        int no=sc.nextInt();
        System.out.print("\n"+path(end, 0, ""));
    }
    public static int path(int end,int curr,String ans) {
        if(curr==end)
        {
            System.out.print(ans+" ");
            return 1;
        }
        if(curr>end)
        {
            return 0;
        }
        int fs=path(end, curr+1, ans+1);
        int sp=path(end, curr+2, ans+2);
        int tp=path(end, curr+3, ans+3);
        return fs+sp+tp;
    }
}
