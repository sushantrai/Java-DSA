package lec17;
import java.util.Scanner;
public class is_vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(gdstr(str));

    }
    public static int gdstr(String str) {
        int ans=0;
        for(int i=0;i<str.length();i++)
        {
            if(isvowel(str.charAt(i))==true)
            {
                int count=0;
                while(i<str.length()&&isvowel(str.charAt(i))==true)
                {
                    count++;
                    i++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
    public static boolean isvowel(char ch) 
    {
     if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')
     {
        return true;
     }
     else{
        return false;
     }
    }
}
