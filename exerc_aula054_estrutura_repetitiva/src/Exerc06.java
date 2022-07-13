import java.util.Locale;
import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int resul = 0;

		for (int i = 1; i <= n; i++) {
			resul = n % i;
			if (resul == 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
