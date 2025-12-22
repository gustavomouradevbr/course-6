package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    	
    	//arrays sem POO
        
        // Configura o ponto como separador decimal (Padrão US)
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // Lê o tamanho do array definido pelo usuário
        int n = sc.nextInt();
        
        // Declaração do Array de Primitivos:
        // Diferente de objetos, um array de double já nasce preenchido com 0.0 em todas as posições.
        double[] vect = new double[n];
        
        // Loop de Entrada de Dados
        for (int i = 0; i < n; i++) {
            // Armazena o valor lido diretamente na posição 'i' do array
            vect[i] = sc.nextDouble();
        }
        
        double sum = 0.0;
        // Loop de Processamento (Soma)
        for (int i = 0; i < n; i++) {
            // Acessa o valor bruto armazenado em cada índice
            sum += vect[i];
        }
        
        // Cálculo da média aritmética
        double avg = sum / n;
        
        // Exibe o resultado com duas casas decimais
        System.out.printf("Average Height %.2f%n ", avg);
        
        sc.close();
    }
}