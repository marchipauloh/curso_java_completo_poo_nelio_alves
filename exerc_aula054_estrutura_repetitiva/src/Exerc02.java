import java.util.Locale;
import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int somaIN = 0, somaOut = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				somaIN++;
			} else {
				somaOut++;
			}
			
		}

		System.out.println(somaIN + " in");
		System.out.println(somaOut + " out");
		sc.close();

	}

}
