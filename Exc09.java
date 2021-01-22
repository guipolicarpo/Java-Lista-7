/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;
public class Exc09 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String frase = "";
		int contador = 0;
		
		System.out.printf("Entre com uma frase: ");
		frase = ler.nextLine();
		
		for(int i = 0; i < frase.length(); i++){
			
			if(frase.charAt(i) == ' '){
				contador++;
			}
		}
		
		System.out.print("\nO Espaço apareceu na frrase : " + contador + " vez/vezes");
	}
}
