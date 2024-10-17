package lec20;

import java.util.Scanner;

public class home {
    public static void reachhome(int dest,int src)
    {
        System.out.println("Source "+src+" Destination "+dest);
        if(src==dest)
        {
            System.out.println(" Reached Home ");
            return;
        }
        reachhome(dest, src+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dest=sc.nextInt();
        int src=1;
        reachhome(dest, src);
    }
}
