/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;
public class Exc20 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String frase = "";
		int contador = 1;
		
		System.out.printf("Escreva a cadeia: ");
		frase = ler.nextLine();
		
		for(int i = 0; i <= frase.length(); i++){
			if(frase.charAt(i) == ' ' ){
				contador++;
			}
		}
		
		System.out.println("\n\nQuantidade de palavras: " + contador);
		

	}
}


