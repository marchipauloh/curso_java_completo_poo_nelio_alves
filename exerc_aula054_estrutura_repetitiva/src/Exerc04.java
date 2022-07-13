import java.util.Locale;
import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double num1 = sc.nextInt();
			double num2 = sc.nextInt();
			double divisao;
			if (num2 == 0) {
				System.out.println("divisao impossivel");
			} else {
				divisao = num1 / num2;
				System.out.printf("%.1f%n", divisao);
			}

		}

		sc.close();

	}

}
