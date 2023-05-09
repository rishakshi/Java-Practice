package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UtilityClasses {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 2, 4, 6, 2, 6, 2, 6, 96, 7 };

		Arrays.sort(arr);

		ArrayList<Integer> al = new ArrayList<>();

		al.add(2);

		al.add(6);
		al.add(7);
		al.add(8);
		al.add(2);

		Collections.sort(al);
		System.out.println(al);

	}

}
