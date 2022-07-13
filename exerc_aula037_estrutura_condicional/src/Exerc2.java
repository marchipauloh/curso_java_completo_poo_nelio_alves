

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		int num, resul;

		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();
		resul = (num % 2);

		if (resul == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		sc.close();

	}

}