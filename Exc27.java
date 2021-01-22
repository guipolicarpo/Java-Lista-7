/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;

public class Exc27 {
	
	public static void main (String[] args) {
		
		Scanner leiaStr = new Scanner ( System.in );
		
		String palavra1 = "", palavra2 = "", saida = "";
		
		System.out.print("Entre com a primeira palavra: ");
		palavra1 = leiaStr.nextLine();
		
		System.out.print("Entre com a segunda palavra: ");
		palavra2 = leiaStr.nextLine();
		
		if ( palavra1.length() == palavra2.length() ) {
			
			for ( int i = 0 ; i < palavra1.length() ; i++ ) {
				saida += palavra1.charAt(i);
				saida += palavra2.charAt(i);
			}
			
			System.out.println("Saida: " + saida);
			
		} else {
			
			System.out.println("\n\tErro! Entradas de tamanhos diferentes.\n");
			
		}
		
	}
}
