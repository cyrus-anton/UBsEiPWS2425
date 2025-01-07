public class IsSortedArray {


	public static void main(String[] args) {

		int [] test = {3,2,1};
		System.out.println(isSorted(null));
	}

	public static boolean isSorted(int[] a) {

		if (a == null)
			return true;
		else {
			for (int i = 0; i < a.length-1; i++) {
				if (a[i] > a[i+1]) {
					return false;
				}
			}
			return true;
		}
	}
}