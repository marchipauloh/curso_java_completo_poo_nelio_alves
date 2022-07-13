package entities;

public class CurrencyConverter {

	public static final double IOF = 6.00;
	
	public static double priceQuote(double priceDollar, double amountDollar) {
		return (priceDollar * amountDollar) + (((priceDollar * amountDollar ) *IOF)/ 100);
	}
}
