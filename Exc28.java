/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;

public class Exc28 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner ( System.in );
		
		int meio = 0, f = 0;
		
		String frase = "", direita = "", esquerda = "", impar = "", saida = "";
		
		System.out.print("Entre com uma frase: ");
		frase = leiaStr.nextLine();
		
		meio = frase.length() / 2;

		f = frase.length() - 1;
		
		for ( int i = 0 ; i < meio ; i++ ) {
			esquerda += frase.charAt(i); 
			direita  += frase.charAt(f);
			
			f--;
		}
		
		if ( frase.length() % 2 != 0 ) {
			impar += frase.charAt( meio );
		}
		
		System.out.println("E: " + esquerda );
		System.out.println("I: " + impar );
		System.out.println("D: " + direita );
		
		for ( int i = 0 ; i < esquerda.length() ; i++ ) {
			saida += esquerda.charAt(i);
			saida += direita.charAt(i);

		}
		saida += impar;
		
		System.out.println("Saida: " + saida);
	}
}
