import java.util.Locale;
import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int prod = sc.nextInt();
		int somaA = 0, somaG = 0, somaD = 0;

		while (prod != 4) {
			switch (prod) {
			case 1:
				somaA += 1;
				break;
			case 2:
				somaG += 1;
				break;
			case 3:
				somaD += 1;
				break;
			default:
				break;
			}
			prod = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + somaA);
		System.out.println("Gasolina: " + somaG);
		System.out.println("Diesel: " + somaD);
		sc.close();

	}

}
