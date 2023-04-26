package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeClass {
	
	public static void main(String[] args) {
		
		// Current Date
		LocalDate myDate = LocalDate.now();
		System.out.println(myDate);
		
		// Current Time
		LocalTime myTime = LocalTime.now();
		System.out.println(myTime);
		
		// Current Date and Time
		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println("Before Format : " + myDateTime);
		
		DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy hh:mm:ss");
		String modDateTime = myDateTime.format(myDateFormat);
		System.out.println("After format : " + modDateTime);
		
		myDateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		modDateTime = myDateTime.format(myDateFormat);
		System.out.println("After format : " + modDateTime);
		
		myDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		modDateTime = myDateTime.format(myDateFormat);
		System.out.println("After format : " + modDateTime);
		
		myDateFormat = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss");
		System.out.println("After format : " + myDateTime.format(myDateFormat));
		
		DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		/*
		 * yyyy-MM-dd
		 * dd/MM/yyyy
		 * dd-MMM-yyyy
		 * E, MMM dd yyyy
		 * 
		 * */
		
		String dateStr = "26/01/2023"; 
		LocalDate date = LocalDate.parse(dateStr, Format);
		System.out.println(date);
		
	}

}
