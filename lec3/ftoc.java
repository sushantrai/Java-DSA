package lec3;

import java.util.Scanner;

public class ftoc 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=sc.nextInt();
        int jump=sc.nextInt();
        for(int i=n;i<=max;i=i+jump)
        {
            int c = (int)((5.0/9.0)*(i- 32));
            System.out.println(i+"\t"+c);
        }
        
    }
}
