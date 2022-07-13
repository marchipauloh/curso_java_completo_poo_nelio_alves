import java.util.Locale;
import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		int num, num_horas;
		double salario_hora, salario;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();
		num_horas = sc.nextInt();
		salario_hora = sc.nextDouble();
		

		salario = (num_horas * salario_hora);

		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		sc.close();

	}

}
