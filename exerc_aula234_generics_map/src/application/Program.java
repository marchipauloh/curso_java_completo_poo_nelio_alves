package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> votocao = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();		

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				int totalVotos = 0;
				int votosDoc = Integer.parseInt(fields[1]);
				if(votocao.containsKey(fields[0])) {
					totalVotos = votosDoc + votocao.get(fields[0]);
				}else {
					totalVotos = votosDoc;
				}
				votocao.put(fields[0],totalVotos);
				line = br.readLine();
			}

			for (String key : votocao.keySet()) {
				System.out.println(key + ": " + votocao.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
