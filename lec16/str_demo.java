package lec16;

public class str_demo {
    public static void main(String[] args) {
        String str="Hello";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        str=str.concat(" Bye");
        System.out.println(str);
        System.out.println(str.contains("By"));
    }
}
