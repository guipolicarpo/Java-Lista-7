/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;
public class Exc26 {
	
	public static void main (String[] args) {
		
		String texto = "", maiorLetra = "", vogais = "aeiou";
		
		int contador = 0, maior = 0;
				
		for ( int i = 1 ;  i <= 100 ; i++ ) {
			texto += (char)((int)(Math.random()*26)+'a');
		}
		texto += ".";
		System.out.println ( "Texto: " + texto );
		
		System.out.print ( "\n - letras do alfabeto que NÃO constam na sequência: " );
		for ( int letra = 'a' ; letra <= 'z' ; letra++ ) {	
			contador = 0;
			for ( int i = 0 ; i < texto.length() ; i++ ) {
				if ( letra == texto.charAt(i) ) {
					contador++;
				}
			}
			
			if ( contador == 0 ) {
				System.out.print ( (char)letra + " " );
			}
		}
		System.out.println();
		
		
				
		System.out.print ( "\n - maior sequência de letras repetidas: " );
		for ( int letra = 'a' ; letra <= 'z' ; letra++ ) {	
			contador = 0;
			for ( int i = 0 ; i < texto.length() ; i++ ) {
				if ( letra == texto.charAt(i) ) {
					contador++;
				} else {
					if ( contador > maior ) {
						maior = contador;
						maiorLetra = "" + (char)letra;
					}
					contador = 0;
				}
			}
		}
		System.out.println("\n> Maior ocorrencia: " + maior );
		System.out.println("> Letra: " + maiorLetra );
		
		System.out.println();		
		
				
				
				
				
		System.out.print ( "\n - maior sequência de vogais: " );
		for ( int letra = 0 ; letra < vogais.length() ; letra++ ) {	
			contador = 0;
			for ( int i = 0 ; i < texto.length() ; i++ ) {
				if ( letra == texto.charAt(i) ) {
					contador++;
				} else {
					if ( contador > maior ) {
						maior = contador;
						maiorLetra = "" + (char)letra;
					}
					contador = 0;
				}
			}
		}
		System.out.println("\n> Maior ocorrencia: " + maior );
		System.out.println("> Letra: " + maiorLetra );
		
		System.out.println();
	}
}
