/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;
public class Exc17 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String frase1 = "";
		String frase2 = "";
		int contador = 0;
		
		System.out.printf("Escreva a 1 frase: ");
		frase1 = ler.nextLine();
		
		System.out.printf("Escreva a 2 frase: ");
		frase2 = ler.nextLine();
		
		for(int i = 0; i <= frase1.length(); i++){
			if(frase1.equals(frase2)){
				
			}
			else{
				contador++;
			}
		}
		
		if(contador == 0){
			System.out.println("\n\nFRASES IGUAIS!!");
		}
		else{
			System.out.println("\n\nNão são iguais!!");
		}
		

	}
}

