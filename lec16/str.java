package lec16;
public class str {
    public static void main(String[] args) {
        String str="hello";
        String str1="hello";
        //string stored in pool
        //in pool duplicate doen't allowed new string point towards original one
        System.out.println(str);
        String str2=new String("Hello");
        String str3=new String("Hello");
        //string stored in heap memory   
        //duplicate allowed in heap memory     
        System.out.println(str2);
        System.out.println(str==str1);
        System.out.println(str2==str3);
        //double equal to compares address not value.
        //in string .=compares value
        System.out.println(str2.equals(str3));
    }
}
