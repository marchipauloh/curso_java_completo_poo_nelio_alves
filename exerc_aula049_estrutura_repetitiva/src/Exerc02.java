import java.util.Locale;
import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			
			if ((x > 0.0) && (y > 0.0)) {
				System.out.println("primeiro");
			} 
			else if ((x < 0.0) && (y > 0.0)) {
				System.out.println("segundo");
			}
			else if ((x > 0.0) && (y < 0.0)) {
				System.out.println("quarto");
			}
			else {
				System.out.println("terceiro");
			}			
			x = sc.nextInt();
			y = sc.nextInt();
		}

		
		sc.close();

	}

}
