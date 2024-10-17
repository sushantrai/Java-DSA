package Hackcb;
import java.util.Scanner;
public class SimpleInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n[]=new int[100];
        int sum=1;
        int i=1;
        while(sum>=1)
        {
            n[i]=nextInt();
            sum=sum+n[i];
            i++;
        }
        int j=1;
        while(j<i-1)
        {sc.
            System.out.println(n[j]);
            j++;
        }
    }
}
