import java.util.Locale;
import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		double vlr1, vlr2, vlr3, pi;
		double triangulo, circulo, trapezio, quadrado, retangulo;
		pi = 3.14159;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		vlr1 = sc.nextDouble();
		vlr2 = sc.nextDouble();
		vlr3 = sc.nextDouble();
		
		triangulo = ((vlr1 * vlr3) /2 );
		circulo = (pi * Math.pow(vlr3, 2.0));
		trapezio = (((vlr1 + vlr2) * vlr3) / 2);
		quadrado = Math.pow(vlr2, 2.0);
		retangulo = vlr1 * vlr2;
		

		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		sc.close();

	}

}
