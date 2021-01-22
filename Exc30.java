/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;

public class Exc30 {
	
	public static void main (String[] args) {
		
		Scanner leia    = new Scanner ( System.in );
		Scanner leiaStr = new Scanner ( System.in );
		
		int opcao = 0;
		
		char letra = ' ';
		
		String frase = "", resposta = "";
		
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
						
						letra = frase.charAt(i);
						
						if ( ( letra >= 'a' &&  letra <= 'm' ) ||
							 ( letra >= 'A' &&  letra <= 'M' ) ) {
							
							resposta += (char)( letra + 13 );
							
						} else {
							
							if ( ( letra >= 'n' &&  letra <= 'z' ) ||
								 ( letra >= 'N' &&  letra <= 'Z' ) ) {
								
								resposta += (char)( letra - 13 );
								
							} else {
															
								resposta += (char)letra;
								
							}
						}
					}

					System.out.println("Resposta: " + resposta + "\n");
					
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
