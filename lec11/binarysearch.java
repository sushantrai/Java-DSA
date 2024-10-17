package lec11;

public class binarysearch {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 9, 10, 11, 13, 15 };
        int item = 2;
        System.out.println(binarysear(arr, item));
    }

    public static int binarysear(int[] arr, int item) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + hi / 2;
            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] > item) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;

    }
}
