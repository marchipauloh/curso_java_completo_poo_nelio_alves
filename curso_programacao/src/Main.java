import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;

		// sem pular linha
		System.out.print("Olá Mundo!");

		// pulando a linha
		System.out.println("Bom dia!");

		// escrevendo variaveis
		System.out.println(y);
		System.out.println(x);

		// escrever com duas casas decimais
		System.out.printf("%.2f%n", x);

		// escrever com quatro casas decimais
		System.out.printf("%.4f%n", x);

		// alterando a saida de dados para EUA
		Locale.setDefault(Locale.US);

		// escrever com quatro casas decimais (com ponto)
		System.out.printf("%.4f%n", x);

		// concatenar variaveis
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f Metros%n", x);

		// concatenando palavras e numeros
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

		// leitura de dados de entrada
		Scanner sc = new Scanner(System.in);
		// string
		String var1;
		System.out.println("Digite seu nome: ");
		var1 = sc.next();
		System.out.println("Você digitou: " + var1);

		// int
		int var2;
		System.out.println("Digite sua Idade: ");
		var2 = sc.nextInt();
		System.out.println("Você digitou: " + var2);

		// double
		double var3;
		System.out.println("Digite sua altura: ");
		var3 = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", var3);

		// primeira string
		char var4;
		System.out.println("Digite uma letra: ");
		var4 = sc.next().charAt(0);
		System.out.println("Você digitou: " + var4);

		// muitos campos
		System.out.println("Digite seu nome: ");
		System.out.println("Digite sua Idade: ");
		System.out.println("Digite sua altura: ");
		var1 = sc.next();
		var2 = sc.nextInt();
		var3 = sc.nextDouble();
		System.out.printf("Você digitou: " + var1 + "%n" + var2 + "%n" + var3 + "%n");

		// muitos campos
		String var5, var6, var7;
		System.out.println("Digite 3 linhas: ");
		var5 = sc.nextLine();
		var6 = sc.nextLine();
		var7 = sc.nextLine();
		System.out.println("Você digitou: " + var5);
		System.out.println("Você digitou: " + var6);
		System.out.println("Você digitou: " + var7);

		// Expressão condicional Ternaria ( condição ) ? valor_se_verdadeiro :
		// valor_se_falso
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println("Preço " + desconto);

		// switch case

		int dias = sc.nextInt();
		String dia;
		switch (dias) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		System.out.println("Dia da semana: " + dia);

		sc.close();

	}

}
