package dataStructures.algorithms;

public class BinarySearch {

	public static int binarySearch(int[] arr, int target) {

		int s = 0, e = arr.length - 1;
		while (s < e) {
			int m = s + (e - s) / 2;

			if (arr[m] == target) {
				return m;
			} else if (arr[m] > target) {
				e = m - 1;
			} else {
				s = m + 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int index = binarySearch(arr, 12);

		System.out.println("Value at index : " + index);

	}

}
