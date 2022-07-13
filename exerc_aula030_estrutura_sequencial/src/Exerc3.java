import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		int num1, num2, num3, num4, dif;
		
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
		dif = (num1 * num2) - (num3 * num4);
		
		System.out.println("DIFERENCA = " + dif);
		
		sc.close();
		

	}

}
