package lec3;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();
        int num=sc.nextInt();
        int i=1;
        int num2=0;
        while(i<=digit)
        {
            if(digit%10==num)
            {
                num2++;
            }
            i++;
            digit=digit/10;
        }
        System.out.println(num2);
    }
    
}
