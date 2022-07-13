package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();

		System.out.println("REMOVE_______________________________________________");
		
		//remover do Map
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");

		cookies.remove("email");

		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
		System.out.println("");
		System.out.println("PUT_______________________________________________");
		
		Map<String, String> cookies1 = new TreeMap<>();
		
		//inserir no Map com chaves repetidas (ele sopreponhe o valor)
		cookies1.put("username", "maria");
		cookies1.put("email", "maria@gmail.com");
		cookies1.put("phone", "99771122");
		
		cookies1.put("phone", "99771133");
		
		System.out.println("ALL COOKIES:");
		for (String key : cookies1.keySet()) {
			System.out.println(key + ": " + cookies1.get(key));
		}
		
		
		System.out.println("");
		System.out.println("Funções_______________________________________________");
		
		Map<String, String> cookies2 = new TreeMap<>();
		
		cookies2.put("username", "maria");
		cookies2.put("email", "maria@gmail.com");
		cookies2.put("phone", "99771122");
		
		cookies2.put("phone", "99771133");
		cookies2.remove("email");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES:");
		for (String key : cookies2.keySet()) {
			System.out.println(key + ": " + cookies2.get(key));
		}
	}

}
