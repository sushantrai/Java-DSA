import java.util.Scanner;
public class primenumhack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=2;
            int flag=0;
            while(j<=i/2)
            {
                if(i%j==0)
                {
                    flag++;
                }
                j++;
            }
            if(flag==0 && i!=1)
            {
                System.out.println(i);
            }
            i++;
        }
    }
    
}
