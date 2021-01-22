/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;
public class Exc14 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		Scanner lers = new Scanner(System.in);
		
		char frase;
		char carac;
		
		System.out.printf("Entre com uma frase: ");
		frase = lers.nextLine().charAt(80);
		
		System.out.printf("Entre com o caractere: ");
		carac = ler.nextLine().charAt(0);
		
		for(int i = 0; i < frase.length(); i++){
			
			if(toUpperCase(frase) == toUpperCase(carac)){
				
			}
		}
		
		System.out.print("\n" + frase);
	}
}

