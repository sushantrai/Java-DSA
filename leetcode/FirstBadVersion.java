package leetcode;

public class FirstBadVersion {
    public static void main(String[] args) {
		int n = 7811;

	}

	public static int firstBadVersion(int n) {
		int lo = 1;
		int hi = n;
		int ans = 0;
		while (lo <= hi) {
			int mid =lo+ ( hi-lo) / 2;

			if (isBadVersion(mid) == true) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;

	}

	public static boolean isBadVersion(int version) {
		return false;
	}
}
