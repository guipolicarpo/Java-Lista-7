/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;
public class Exc06 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String frase = "";
		int contador = 0;
		char car;
		
		System.out.printf("Entre com um caractere: ");
		car = ler.nextLine().charAt(0);
		
		System.out.printf("Entre com uma frase: ");
		frase = ler.nextLine().toLowerCase();
		
		for(int i = 0; i < frase.length(); i++){
			
			if(frase.charAt(i) == car){
				contador++;
			}
		}
		
		System.out.print("\nO caractere '" + car + "' apareceu: " + contador + " vezes");
	}
}
