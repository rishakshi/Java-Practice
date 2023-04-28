package patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {
	
	public static void main(String[] args) {
		
//		String re = "...";
//		String re = "\\w\\w\\w\\W."; //(a-z A-z 0-9 _)
//		String re = "\\S\\s";
		String re = "\\d\\d\\D";
		String text = "99&";
		
		Pattern pattern = Pattern.compile(re);
		Matcher matcher = pattern.matcher(text);
		
		boolean res = matcher.matches();
		System.out.println(res);
	}

}
