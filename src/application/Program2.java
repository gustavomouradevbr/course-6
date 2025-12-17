package application;

import java.util.Scanner;

import entites.Product;

public class Program2 {
	public static void main(String[]args) {
		
		//Vectors with classes and objects
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i<n; i++) {  // O n pode ser trocado pelo vect.lenght
			sc.nextLine();
			
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product (name, price);
			
		}
		
		double sum = 0.0;
		for (int i = 0; i<3; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
	    System.out.printf("Avarage Height %.2f%n ", avg);

		
		
		
		
		
		
		
		
		
		
	sc.close();	
	}

}
