package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer> setCourseA = new HashSet<>();
		Set<Integer> setCourseB = new HashSet<>();
		Set<Integer> setCourseC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int courseA = sc.nextInt();		
		
		for(int i=1; i <=courseA; i++) {			
			int codStudent = sc.nextInt();
			setCourseA.add(codStudent);		
		}
		
		System.out.println();
		System.out.print("How many students for course B? ");
		int courseB = sc.nextInt();		
		
		for(int i=1; i <=courseB; i++) {			
			int codStudent = sc.nextInt();
			setCourseB.add(codStudent);		
		}
		
		System.out.println();
		System.out.print("How many students for course C? ");
		int courseC = sc.nextInt();		
		
		for(int i=1; i <=courseC; i++) {			
			int codStudent = sc.nextInt();
			setCourseC.add(codStudent);		
		}
		
		Set<Integer> setStudent = new HashSet<>(setCourseA);
		setStudent.addAll(setCourseB);
		setStudent.addAll(setCourseC);
		
		System.out.println();
		System.out.println("Total students: " + setStudent.size());
		
		sc.close();

	}

}
