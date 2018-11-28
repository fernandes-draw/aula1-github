package util;

public class CurrencyConverter {
	
	public static double price;
	public static double bought;
	
	public static double amount() {
		return price * bought * 1.06;
	}
}
