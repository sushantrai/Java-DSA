package lec14;
public class twodarray {
    public static void main(String[] args) {
        int[][] arr=new int[3][4];
        System.out.println(arr[0]);
        System.out.println(arr);
        System.out.println(arr[2]);
        System.out.println(arr[1][3]);
        int[][] other=arr; 
        System.out.println(other);
    }
}