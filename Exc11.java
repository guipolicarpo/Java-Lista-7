/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;
public class Exc11 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String frase = "";
		int contadorl = 0;
		int contadorn = 0;
		
		System.out.printf("Entre com uma frase: ");
		frase = ler.nextLine();
		
		for(int i = 0; i < frase.length(); i++){
			
			if((char)frase.charAt(i) >= 'A' && (char)frase.charAt(i) <= 'z'){
				contadorl++;
			}
			
			if((char)frase.charAt(i) >= '0' && (char)frase.charAt(i) <= '9'){
				contadorn++;
			}
		}
		
		System.out.print("\nLetras apareceram : " + contadorl + " vez/vezes");
		System.out.print("\nNumeros apareceram : " + contadorn + " vez/vezes");
	}
}

