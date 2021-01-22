/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;
public class Exc10 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String frase = "";
		int contador = 0;
		
		System.out.printf("Entre com uma frase: ");
		frase = ler.nextLine();
		
		for(int i = 0; i < frase.length(); i++){
			
			if((char)frase.charAt(i) >= 'A' && (char)frase.charAt(i) <= 'Z'){
				contador++;
			}
		}
		
		System.out.print("\nLetras maiusculas apareceram : " + contador + " vez/vezes");
	}
}

