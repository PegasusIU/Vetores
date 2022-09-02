package vetores;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 10;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int soma = 0;
		float media = 0;
		int aprov = 0;
		
		int[] aluno = new int[TAM];
		
		for (int x = 0; x < TAM; x++) {
			System.out.print("Informe o sua primeira nota : ");
			n1 = entrada.nextInt();
			System.out.print("Informe o sua segunda nota : ");
			n2 = entrada.nextInt();
			System.out.print("Informe o sua terceira nota : ");
			n3 = entrada.nextInt();
			System.out.print("Informe o sua quarta nota : ");
			n4 = entrada.nextInt();
			
			soma = n1 + n2 + n3 + n4;
			media = soma / 4;
			
			if (media > 6) {
				aprov = aprov +1 ;
			}
			
			System.out.println("------------------------- ");
		}
		
		for (int x = 0; x < TAM; x++) 
			System.out.print(aluno[x] + " | ");
		
		System.out.println("\nSoma: " + soma);
		
		media = soma / (float)TAM;
		System.out.println("Média: " + media);
		
		entrada.close();

	}

}