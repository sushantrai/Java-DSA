import java.util.Scanner;
public class isprimehack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=2;
        int prime=0;
        while(i<n)
        {
            if(n%i==0)
            {
                prime++;
                break;
            }
            i++;
        }
        if(prime>=1)
        {
            System.out.println("Not Prime");
        }
        else
        {
            System.out.println("Prime");
        }
    }
}
