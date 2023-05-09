package dataStructures.arrays;

import java.util.*;

public class ArrayClass {
	public static void main (String[] args) {
	    int[] arr= new int[10];
	    
	    Scanner in=new Scanner(System.in);
	    
	    for(int i=0;i<arr.length;i++)
	    	arr[i]=in.nextInt();

	    for(int i=0;i<arr.length;i++)
		    System.out.print(arr[i]+" ");
	    
	    in.close();
	}
}
