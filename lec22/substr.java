package lec22;

public class substr {
    public static void main(String[] args) {
        String str="abc";
        prntssub(str, "");
    }
    public static void prntssub(String ques,String ans) 
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        prntssub(ques.substring(1), ans);
        prntssub(ques.substring(1), ans+ch);
        
    }
    
}
