package dataStructures.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortAlgo {
	
	static int swaps = 0, compare = 0;
	
	public static void swap(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		swaps++;
		
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if(low > high) {
			return;
		}
		int pivot = partition(arr, low, high);
		
		quickSort(arr, low, pivot-1);
		quickSort(arr, pivot+1, high);	
	}
	
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		
		int i = low - 1;
		
		for(int j=low; j<high; j++) {
			compare++;
			if(arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, high);
		
		return i+1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Not Sorted : " + Arrays.toString(arr));
		
		quickSort(arr, 0, 9);
		
		System.out.println("Sorted : " + Arrays.toString(arr));
		System.out.println("Swap : " + swaps);
		System.out.println("Compare : " + compare);
		
		sc.close();
		
	}

}
