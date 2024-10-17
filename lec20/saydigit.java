package lec20;

import java.util.Scanner;

public class saydigit {
    public static void saydigi(int n,String[] str)
    {
        if(n==0)
        {
            return;
        }
        int digit=n%10;
        n=n/10;
        saydigi(n, str);
        System.out.print(str[digit]+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        saydigi(n, str);
    }
}
