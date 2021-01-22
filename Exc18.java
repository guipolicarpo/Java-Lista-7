/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;
public class Exc18 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String cadeia = "";
		int contador = 0;
		
		System.out.printf("Escreva a cadeia: ");
		cadeia = ler.nextLine();
		
		for(int i = 0; i <= cadeia.length(); i++){
			if(cadeia.charAt(8) == ','){
				contador++;
			}
		}
		
		if(contador > 0){
			System.out.println("\n\nCadeia de 8 bits!");
		}
		else{
			System.out.println("\n\nNão é de 8 bits!!");
		}
		

	}
}

