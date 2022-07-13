import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		int num1, num2, resul1, resul2;

		Scanner sc = new Scanner(System.in);

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		resul1 = (num1 % num2);
		resul2 = (num2 % num1);

		if ((resul1 == 0) || (resul2 == 0)) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		sc.close();

	}

}
