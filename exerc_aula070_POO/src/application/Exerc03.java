package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exerc03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.printf(student.situation());
		
		sc.close();

	}

}
