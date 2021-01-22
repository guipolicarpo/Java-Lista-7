/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;
public class Exc07 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String frase = "";
		int contador;
		
		System.out.printf("Entre com uma frase: ");
		frase = ler.nextLine();
		
		for(int i = 0; i < frase.length(); i++){
			contador = 0;
			if(frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z'){
				contador++;
			}
			System.out.println("A letra '" + frase.charAt(i) + "' aparece: " + contador + " vezes");
		}
	}
}

