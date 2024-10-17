import java.util.Scanner;

public class oddevenplacessum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num2=n*10;
        int i=1;
        int evensum=0;
        int oddsum=0;
        while(i<=n)
        {
            int num=num2%10;
            if(i%2==0)
            {
                evensum=evensum+num;
            }
            else
            {
                oddsum=oddsum+num;
            }
            num2=num2/10;
            i++;
        }
        System.out.println(evensum);
        System.out.println(oddsum);
        }

    
}
