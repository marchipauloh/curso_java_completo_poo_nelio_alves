package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exerc02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		
		System.out.print("Which porcentage to increase salary? ");
		double porcent = sc.nextDouble();
		employee.increaseSalary(porcent);
		
		System.out.println("Update data: " +employee);
		
		sc.close();

	}

}
