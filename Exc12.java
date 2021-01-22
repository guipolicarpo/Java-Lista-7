/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;
public class Exc12 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String frase = "";
		int contadora = 0, contadore = 0, contadori = 0, contadoro = 0, contadoru = 0;
		
		System.out.printf("Entre com uma frase: ");
		frase = ler.nextLine();
		
		for(int i = 0; i < frase.length(); i++){
			
			if(frase.charAt(i) == 'A' || frase.charAt(i) == 'a'){
				contadora++;
			}
			
			if(frase.charAt(i) == 'E' || frase.charAt(i) == 'e'){
				contadore++;
			}
			
			if(frase.charAt(i) == 'I' || frase.charAt(i) == 'i'){
				contadori++;
			}
			
			if(frase.charAt(i) == 'O' || frase.charAt(i) == 'o'){
				contadoro++;
			}
			
			if(frase.charAt(i) == 'U' || frase.charAt(i) == 'u'){
				contadoru++;
			}
		}
		
		System.out.print("\nA Vogal 'A' aparece : " + contadora + " vez/vezes");
		System.out.print("\nA Vogal 'E' aparece : " + contadore + " vez/vezes");
		System.out.print("\nA Vogal 'I' aparece : " + contadori + " vez/vezes");
		System.out.print("\nA Vogal 'O' aparece : " + contadoro + " vez/vezes");
		System.out.print("\nA Vogal 'U' aparece : " + contadoru + " vez/vezes");
	}
}

