import java.util.Scanner;
public class primenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int prime=sc.nextInt();
        int i=2;
        int f=0;
        while(i<prime)
        {
            if(prime%i==0){
                f=f+1;
                break;
            }
            i=i+1;
        }
        if(f>=1){
            System.out.println(" Not prime number");
        }
        else{
            System.out.println(" Prime number ");
        }
    }
}
