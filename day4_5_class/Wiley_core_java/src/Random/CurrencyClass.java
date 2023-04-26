package Random;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyClass {
	
	public static void main(String[] args) {
		
		Currency usd = Currency.getInstance("USD");
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		String formattedVal = format.format(108);
		
		System.out.println(formattedVal);
		
//		format = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
//		formattedVal = format.format(108);
//		System.out.println(formattedVal);
		
		double price = 2600.25;
		Locale local = new Locale("en", "IN");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(local);
		String finalPrice = currencyFormatter.format(price);
		System.out.println(finalPrice);
		
		DecimalFormat decimalFormatter = new DecimalFormat("#,##0.00");
		decimalFormatter.setPositivePrefix("₹");
		String resVal = decimalFormatter.format(price);
		System.out.println("Custom format : " + resVal);
		
		Currency cur = Currency.getInstance("USD");
		String symbol = cur.getSymbol();
		String code = cur.getCurrencyCode();
		
		System.out.println(symbol);
		System.out.println(code);
		
	}

}
