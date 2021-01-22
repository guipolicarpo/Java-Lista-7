/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;

public class Exc29 {
	
	public static void main (String[] args) {
		
		Scanner leia    = new Scanner ( System.in );
		Scanner leiaStr = new Scanner ( System.in );
		
		int opcao = 0, onde = 0;
		
		boolean encontrei = false;
		
		String frase = "", resposta = "";
		String zenit = "zenitZENITpolarPolar", 
		       polar = "polarPOLARzenitZENIT";
		
		do {
			System.out.println("1) Cripto");
			System.out.println("2) Decripto");
			System.out.println("3) Sair");
			System.out.println("------------");
			System.out.print("Opcao: ");
			opcao = leia.nextInt();
			
			switch ( opcao ) {
				
				case 1:
					//Cripto
				case 2:
					//Decripto

					frase = "";
					resposta = "";
					
					System.out.print("Entre com uma frase: ");
					frase = leiaStr.nextLine();
				
					// zabcd => z
					for ( int i = 0 ; i < frase.length() ; i++ ) {			
					
						encontrei = false;
					
						//zenit => e
						for ( int z = 0 ; !encontrei && z < zenit.length() ; z++ ) {
							
							if ( frase.charAt(i) == zenit.charAt(z) ) {

								encontrei = true;
								onde = z;
							}
						}
						
						
						if ( encontrei ) {

							resposta += polar.charAt(onde);
							
						} else {

							resposta += frase.charAt(i);
							
						}
					}
					//System.out.println("Resposta: " + resposta + "\n");
					
					break;
					
				case 3:
					//Sair
					System.out.println("\n\tFim do programa!\n");
					break;
					
				default:
					//Opcao invalida
					System.out.println("\n\tOpcao Invalida!\n");
					opcao = 1;
			}
			
			
		} while ( opcao >= 1 && opcao < 3 );
		
	}
}
