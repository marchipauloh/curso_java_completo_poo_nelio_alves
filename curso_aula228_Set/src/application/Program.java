package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		System.out.println("HashSet______________________________________________");
		// #Não garante a ordem que foi adicionado
		Set<String> set = new HashSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}

		System.out.println();
		System.out.println("TreeSet______________________________________________");
		// _______________________________________________________

		// #TreeSet ordena os dados, mais demorado
		Set<String> set1 = new TreeSet<>();

		set1.add("TV");
		set1.add("Notebook");
		set1.add("Tablet");

		System.out.println(set1.contains("Notebook"));

		for (String p1 : set1) {
			System.out.println(p1);
		}

		System.out.println();
		System.out.println("LinkedHashSet____________________________________________");
		// _______________________________________________________

		// #LinkedHashSet mantem a ordem que foi inserido
		Set<String> set2 = new LinkedHashSet<>();

		set2.add("TV");
		set2.add("Notebook");
		set2.add("Tablet");

		System.out.println(set2.contains("Notebook"));

		for (String p2 : set2) {
			System.out.println(p2);
		}

		System.out.println();
		System.out.println("Remove____________________________________________");
		// _______________________________________________________

		// #LinkedHashSet mantem a ordem que foi inserido
		Set<String> set3 = new LinkedHashSet<>();

		set3.add("TV");
		set3.add("Notebook");
		set3.add("Tablet");

		set3.remove("Tablet");

		for (String p3 : set3) {
			System.out.println(p3);
		}

		System.out.println();
		System.out.println("RemoveIF____________________________________________");
		// _______________________________________________________

		// #LinkedHashSet mantem a ordem que foi inserido
		Set<String> set4 = new LinkedHashSet<>();

		set4.add("TV");
		set4.add("Notebook");
		set4.add("Tablet");

		set4.removeIf(x -> x.length() >= 3);

		for (String p4 : set4) {
			System.out.println(p4);
		}

		System.out.println();
		System.out.println("RemoveIF____________________________________________");
		// _______________________________________________________

		// #LinkedHashSet mantem a ordem que foi inserido
		Set<String> set5 = new LinkedHashSet<>();

		set5.add("TV");
		set5.add("Notebook");
		set5.add("Tablet");

		set5.removeIf(x -> x.charAt(0) == 'T');

		for (String p5 : set5) {
			System.out.println(p5);
		}
		
		System.out.println();
		System.out.println("____________________________________________");
		// _______________________________________________________


		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		// union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		// intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}

}
