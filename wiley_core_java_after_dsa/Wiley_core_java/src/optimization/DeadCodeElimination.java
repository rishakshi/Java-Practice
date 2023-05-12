package optimization;

public class DeadCodeElimination {
	
	public void printOperation(int value) {
		if(value > 0) {
			System.out.print("Positive");
		}
		else{
			System.out.println("Negative");
		}
		
		System.out.println("Something");
	}
	
	public static void main(String[] args) {
		
	}

}
