package dataStructures.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		arr[3] = 25;
		
		System.out.println(Arrays.toString(arr));
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
		
	}

}
