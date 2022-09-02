package vetores;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int soma = 0;
		float mult = 0; 
		
		int[] aluno = new int[TAM];
		
		for (int x = 0; x < TAM; x++) {
			System.out.print("Informe os números inteiros : ");
			aluno[x] = entrada.nextInt();
			
			soma = soma + aluno[x];
			
			if (x == 0) {
				mult = aluno[x];
			} else {
				mult = mult * aluno[x];
			}
		
		}
		
		for (int x = 0; x < TAM; x++) 
			System.out.print(aluno[x] + " | ");
		
		System.out.println("\nSoma: " + soma);
		
		System.out.println("Multiplicação: " + mult);
		
		
		entrada.close();

	}

}