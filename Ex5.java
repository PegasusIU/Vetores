package vetores;
import java.util.Scanner;

public class Ex5 {

	public class Exe5 {

		public static void main(String[] args) {
			Scanner oInput = new Scanner(System.in);

			final int TAM = 20;

			int[] aNumeros = new int[TAM];
			int[] aPares   = new int[TAM];
			int[] aImpares = new int[TAM];

			for(int i = 0; i< TAM; i++) {
				aNumeros[i] = oInput.nextInt();
				if(aNumeros[i] % 2 == 0) {
					aPares[i] = aNumeros[i];
				}
				else {
					aImpares[i] = aNumeros[i];
				}
			}

			for(int i = 0; i< TAM; i++) {
				System.out.println("Todos");
				System.out.println(aNumeros[i]);
				
			}
			for(int i = 0; i< TAM; i++) {
				System.out.println("Pares");
				System.out.println(aPares[i]);
				
			}
			for(int i = 0; i< TAM; i++) {
				System.out.println("Impares");
				System.out.println(aImpares[i]);
				
			}

			oInput.close();
		}

	}
}