package optimization;

public class StrengthReduction {
	
//	public static int calcSum(int[] arr) {
//		int sum = 0;
//		for(int i=0; i<arr.length; i++) {
////			int val = arr[i];
////			int sqaure = val*val;
//			sum += arr[i];
//		}
//		
//		return sum*sum;
//	}
	
	public static int calcTotal(int n) {
		int sum = 0;
		for(int i=0; i<n; i++) {
//			sum+= i*5;
			sum+= i+i+i+i+i;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
//		System.out.println(calcSum(new int[] {1, 2, 3, 4, 5}));
	}

}
