//stores array in increasing order
package lec10;
public class bubblesort {
    public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
		}
	}
	public static void Sort(int[] arr){
		for (int trun = 1; trun < arr.length; trun++) {
			for (int i = 0; i < arr.length - trun; i++) {
				if (arr[i] > arr[i + 1]) {
					int t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
			}
			}
		}
   }
}