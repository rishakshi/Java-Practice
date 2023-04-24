package Exception;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		System.out.println("First Statement");
		
		int arr[] = {1, 2, 3, 4};
		
		try {
			System.out.println(arr[1]);
			System.out.println(arr[3]);
			
			System.out.println("Statement 2");
			
			String name = "Krishna";
			
			System.out.println(name.charAt(2));
			
			System.out.println(12/0);
			
			System.out.println("Simple statement");
			System.out.println("Simple statement");
			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Catch block 2");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Catch block 3");
			e.printStackTrace();
		}
		
		System.out.println("Another statement");
	}
	
}
