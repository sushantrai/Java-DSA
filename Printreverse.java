import java.util.Scanner;
public class Printreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();
        int reverse=1;
        int cal=0;
        int i=0;
        while(i<=digit*10)
        {
            reverse=digit%10;
            digit=digit/10;
            i++;
            cal=cal*10+reverse;
        }
        System.out.print(cal);
    }
}
