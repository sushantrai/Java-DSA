import java.util.Scanner;

public class strptrnq28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int space=n-1;
        int star=1;
        while(row<=n)
        {
            int val=row;
            
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star)
            {
                System.out.print(val+" ");
                j++;
                if(j<=row)
                {
                    val++;
                }
                else{
                    val--;
                }
            }
            System.out.println();
            space--;
            star=star+2;
            row++;

        }
    }
}
