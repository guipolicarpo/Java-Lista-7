/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;

public class Exc19 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String palavra = "";
		
		System.out.printf("Entre com uma palavra: ");
		palavra = ler.nextLine();
		
		int f = palavra.length() - 1, contador = 0;
		
		for(int i = 0; i < palavra.length(); i++){
			if(palavra.charAt(i) == palavra.charAt(f)){
				contador++;
			}
			f--;
		}
		
		if(palavra.length() == contador){
			System.out.println("\nÉ um palindromo!\n");
		}
		else{
			System.out.println("\nNão é um palindromo!\n");
		}
	}
}

