import java.util.Locale;
import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		int item, qtde; 
		double valor = 0;
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		item = sc.nextInt();
		qtde = sc.nextInt();
		
		if (item == 1) {
			valor = qtde * 4.00;
		} else if (item == 2){
			valor = qtde * 4.50;
		}else if (item == 3){
			valor = qtde * 5.00;
		}else if (item == 4){
			valor = qtde * 2.00;
		}else if (item == 5){
			valor = qtde * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f%n", valor);

		sc.close();

	}

}
