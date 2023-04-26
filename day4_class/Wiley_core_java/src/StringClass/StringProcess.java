package StringClass;

public class StringProcess {
	
	public static void main(String[] args) {
		
		String s1 = "Wiley";
		String s2 = "Wiley";		
		
		String s3 = new String("Wiley");
		String s4 = new String("Wiley");

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		
		String str = "I am a Java Developer";
		String str1 = "Python";
		
		String str2 = str.concat(str1);
		
		String fname = "A";
		String mname = "V";
		String lname = "S";
		
		String fullname = fname.concat(" ").concat(mname).concat(" ").concat(lname);
		System.out.println(fullname);
		
		System.out.println(str.length());
		System.out.println(str.charAt(10));
		System.out.println(str2);
		
		System.out.println(str.replace('D', 'd'));
		
		String st[] = str.split("");
		
		System.out.println(st);

		for(String string : st) {
			System.out.print(string);
		}
		System.out.println();
		
		String userInput = " Mobile ";
		System.out.println(userInput);
		System.out.println(userInput.trim());
		
		System.out.println(str.substring(0, 4));
		
		System.out.println(str.toUpperCase());
		
	}
	
}
