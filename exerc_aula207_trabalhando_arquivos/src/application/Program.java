package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();

		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();

		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		if(!success) {
			System.out.println(sourceFolderStr + " EXISTS OR NOT CREATED");
		}

		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

			String line = br.readLine();

			while (line != null) {

				String[] vect = line.split(",");
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				int qtde = Integer.parseInt(vect[2]);

				list.add(new Product(name, price, qtde));

				line = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				for (Product item : list) {
					bw.write(item.toString());
					bw.newLine();
				}

				System.out.println(targetFileStr + " CREATED!");
			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		
		sc.close();
	}
}
