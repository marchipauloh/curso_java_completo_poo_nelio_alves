import java.util.Locale;
import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		int cod1, num1;
		int cod2, num2;
		double vlr1, vlr2, vlr_tot;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		cod1 = sc.nextInt();
		num1 = sc.nextInt();		
		vlr1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		num2 = sc.nextInt();		
		vlr2 = sc.nextDouble();
		

		vlr_tot = (num1 * vlr1) + (num2 * vlr2);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", vlr_tot);

		sc.close();

	}

}
