package lec24;
import java.util.Scanner;
public class perfectnonperfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(i%2==0 && str.charAt(i)=='0' || i%2!=0 && str.charAt(i)=='1')
            {
                count++;
            }
        }
        if(str.length()==count)
        {
            System.out.println("Perfect");
        }
        else{
            System.out.println("Not Perfect");
        }
    }
}
