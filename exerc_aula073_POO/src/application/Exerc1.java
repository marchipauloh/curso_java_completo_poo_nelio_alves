package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Exerc1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double priceDollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amountDollar = sc.nextDouble();
		
		double value = CurrencyConverter.priceQuote(priceDollar, amountDollar);
		
		System.out.printf("Amount to be paid in reais = R$ %.2f%n", value);
		

		sc.close();
	}

}
