import java.util.Locale;
import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int resul = 0;

		for (int i = 0; i <= n; i++) {
			resul = i % 2;
			if (resul == 1) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
