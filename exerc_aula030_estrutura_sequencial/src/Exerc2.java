import java.util.Locale;
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double raio = 0,pi = 3.14159, area;
		
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		area = (pi * Math.pow(raio, 2.0));
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}

}
