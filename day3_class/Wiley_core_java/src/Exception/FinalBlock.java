package Exception;

public class FinalBlock {
	public static void main(String[] args) {
		
		try {
			System.out.println("1111");
			System.out.println("Wiley");
			System.out.println(10/0);
			
//			try {
//				System.out.println(10/0);
//			}
//			catch (Exception e) {
//				e.printStackTrace();
//			}
//			finally {
//				System.out.println("Nested close connection");
//			}
			
//			System.exit(0);
			System.out.println("edge");
		}
		catch (Exception e) {
			System.out.println("Catch block");
			
			try {
				System.out.println("try catch inside catch block");
				System.out.println(10/0);
			}
			catch (Exception e1){
				e1.printStackTrace();
			}
			finally {
				System.out.println("Nested close connection");
			}
			
//			System.exit(0);
//			System.out.println(10/0);
			e.printStackTrace();
		}
		finally {
			try {
				System.out.println(10/0);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("Nested close connection");
			}
			System.out.println("Close Connection");
		}
		
	}
}
