/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;
public class Exc15 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String frase = "";
		int contador = 0;
		
		System.out.printf("Entre com uma frase: ");
		frase = ler.nextLine();
		
		for(int i = 0; i < frase.length(); i++){
			char c = frase.charAt(i);
			
			if(c >= 48 && c <= 57){
				contador++;
			}
		}
		
		System.out.print("\nCaracteres numericos apareceram : " + contador + " vez/vezes");
	}
}

