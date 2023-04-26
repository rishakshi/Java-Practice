package Random;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Convertor {
	
	public static void main(String[] args) {
		
		double valueInDollar = 50.6;
		
		double valueInRupee= valueInDollar * 81.72;
		double valueInEuro= valueInDollar * 0.90;
		
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		String finalPrice = currencyFormatter.format(valueInRupee);
		System.out.println(finalPrice);
		
		DecimalFormat decimalFormatter = new DecimalFormat("#,##0.00");
		decimalFormatter.setPositivePrefix("€");
		String resVal = decimalFormatter.format(valueInEuro);
		System.out.println(resVal);
		
	}

}
