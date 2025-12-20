package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program_3 {
	public static void main(String[]args) {
		
		
		List<String> list = new ArrayList<>();
		
		
		list.add("Maria");
		list.add("Bob");
		list.add("Alex");
		list.add("Anna");
		
		//list.add(2, "eee");
		
	    //list.remove(0);
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		
		System.out.println(list.indexOf("Bob"));
		System.out.println(list.indexOf("sla"));

		System.out.println("-------------------");
		
		List<String> result = list.stream()
                .filter(x -> x.charAt(0) == 'A')
                .collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");

		String name =  list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		
	}
	

}
