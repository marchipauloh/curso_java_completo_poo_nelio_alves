import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		int hora1, hora2, duracao;

		Scanner sc = new Scanner(System.in);

		hora1 = sc.nextInt();
		hora2 = sc.nextInt();
		
		if (hora1 < hora2) {
			duracao = hora2 - hora1;
		}
		else {
			duracao = 24 - hora1 + hora2;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();

	}

}
