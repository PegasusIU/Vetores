package vetores;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 1;
		
		int ver = 0;
		int dia = 0;
		int mes = 0;
		int ano = 0;		 
		
		while (dia == 0) {
			System.out.print("Informe o dia : ");
			ver = entrada.nextInt();
			if (ver < 32 && ver > 0) {
				dia = ver;
			}
		}
		
		while (mes == 0) {
			System.out.print("Informe o mês : ");
			ver = entrada.nextInt();
			if (ver < 13 && ver > 0) {
				mes = ver;
			}
		}
		
		while (ano == 0) {
			System.out.print("Informe o ano : ");
			ver = entrada.nextInt();
			if (ver < 9999 && ver > 0) {
				ano = ver;
			}
		}
	
		
		
		for (int x = 0; x < TAM; x++) 
			System.out.print(dia + " / " + mes + " / " + ano);
		
		entrada.close();

	}

}