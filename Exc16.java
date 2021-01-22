/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;
public class Exc16 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String letrasMaiusculas = "";
		int contador = 0;
		
		System.out.printf("Escreva uma frase: ");
		letrasMaiusculas = ler.nextLine();
		
		for(int i = 0; i < letrasMaiusculas.length(); i++){
			if(letrasMaiusculas.charAt(i) >= 65 && letrasMaiusculas.charAt(i) <= 90){
				contador++;
			}
		}
		
		if(contador == letrasMaiusculas.length()){
			System.out.println("\n\nTODAS SÃO MAIUSCULAS!!");
		}
		else{
			System.out.println("\n\nNem todas são maiusculas.");
		}
		

	}
}

