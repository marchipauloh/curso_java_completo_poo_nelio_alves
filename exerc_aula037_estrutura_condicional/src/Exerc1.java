import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();

		if (num < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}

		sc.close();


	}

}
