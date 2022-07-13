import java.util.Locale;
import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		double valor1, valor2;
		valor1 = sc.nextDouble();
		valor2 = sc.nextDouble();

		if ((valor1 == 0.0) && (valor2 == 0.0)) {
			System.out.println("Origem");
		} 
		else if (valor1 == 0.0) {
			System.out.println("Eixo X");
		} 
		else if (valor2 == 0.0) {
			System.out.println("Eixo y");
		} 
		else if ((valor1 > 0.0) && (valor2 > 0.0)) {
			System.out.println("Q1");
		} 
		else if ((valor1 < 0.0) && (valor2 > 0.0)) {
			System.out.println("Q2");
		}
		else if ((valor1 > 0.0) && (valor2 < 0.0)) {
			System.out.println("Q4");
		}
		else {
			System.out.println("Q3");
		}

		sc.close();

	}

}
