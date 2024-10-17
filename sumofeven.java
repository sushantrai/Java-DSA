import java.util.Scanner;
public class sumofeven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n)
        {
            if(i%2==0)
            {
                System.out.println(+i);
                sum=sum+i;
            }
            i++;
        }
        System.out.println("Sum of even is "+sum);
    }
}
