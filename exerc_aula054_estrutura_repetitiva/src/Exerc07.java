import java.util.Locale;
import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int quad = (int) Math.pow(i, 2.0);
			int cubo = (int) Math.pow(i, 3.0);

			System.out.println(i + " " + quad + " " + cubo);
		}

		sc.close();

	}

}
