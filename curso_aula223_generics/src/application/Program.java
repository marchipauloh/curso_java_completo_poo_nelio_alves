package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		PrintService<Integer> psInt = new PrintService<>();
		PrintService<String> psString = new PrintService<>();
		
		System.out.print("How many values Integer? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			psInt.addValue(value);
		}

		psInt.print();
		Integer x = psInt.first();
		System.out.println("First: " + x);
		
		System.out.print("How many values String? ");
		n = sc.nextInt();
		
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String value = sc.nextLine();
			psString.addValue(value);
		}

		psString.print();
		String x1 = psString.first();
		System.out.println("First: " + x1);
		
		sc.close();

	}

}
