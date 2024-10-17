import java.util.Scanner;
public class strptrnq8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            int n=sc.nextInt();
            int i=1;
            while(i<=n)
            {
            int j=1;
            while(j<=n)
            {
                if(i==j ||i+j==n+1){
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("   ");
                }
                j++;
            }
            System.out.println();
            i++;
		}

    }
}
}