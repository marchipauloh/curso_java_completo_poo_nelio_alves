package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {			
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			
			System.out.print("Initial balance: ");
			double inicialBalance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, withdrawLimit, 0.0);
			account.deposit(inicialBalance);
			
			System.out.println();
			
			System.out.print("Enter amount for withdraw: ");
			double amountWithdraw = sc.nextDouble();
			
			account.withdraw(amountWithdraw);
			System.out.println(account);
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid caracter");
		}
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
//		catch (RuntimeException e) {
//			System.out.println("Unexpected error!");
//		}
		
		
		
		sc.close();

	}

}
