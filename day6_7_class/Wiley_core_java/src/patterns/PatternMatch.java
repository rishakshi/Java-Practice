package patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {
	
	public static void main(String[] args) {
		
//		Pattern pattern = Pattern.compile("agent \\d\\d\\d");
//		Pattern pattern = Pattern.compile("\\w*\\s\\d{3,5}");
		Pattern pattern = Pattern.compile("^[a|A]gent (\\d{3,4})$");
		
//		Matcher matcher = pattern.matcher("agent 0077");
//		Matcher matcher = pattern.matcher("00003agent 0077777");
//		Matcher matcher = pattern.matcher("agent 07");
//		Matcher matcher = pattern.matcher("agent 0077");
		Matcher matcher = pattern.matcher("agent 0007");
		
//		boolean found = matcher.find();
//		boolean match = matcher.matches();
//		System.out.println("found : " + found);
//		System.out.println("Match : " + match);
		
		if(matcher.find()) {
			System.out.println("Group : " + matcher.group());
			System.out.println("Group : " + matcher.group(1));
		}
		
	}

}
