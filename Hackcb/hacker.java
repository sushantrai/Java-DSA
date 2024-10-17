package Hackcb;
import java.util.*;
public class hacker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> l = new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String str=sc.next();
            l.add(str);
        }
        getMaxStreaks(l);
        
    }
    
    public static List<Integer> getMaxStreaks(List<String> toss) {
        // Return an array of two integers containing the maximum streak of heads and
        // tails respectively
        List<Integer> listR = new ArrayList<>();
        int headCountM = 0;
        int tailCountM = 0;

        int headCount = 0;
        int tailCount = 0;

        for (String t : toss) {

            if (t.equals("Heads")) {
                tailCount = 0;

                headCount++;

                if (headCountM < headCount) {
                    headCountM = headCount;
                }

            } else {
                headCount = 0;

                tailCount++;

                if (tailCountM < tailCount) {
                    tailCountM = tailCount;
                }

            }

        }
        listR.add(headCountM);
        listR.add(tailCountM);
        
        System.out.print(headCountM+" ");
        System.out.print(tailCountM+" ");
        return listR;
    }
}
