/* Guilherme Policarpo de Carvalho */
import java.util.Scanner;
public class Exc13 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String frase = "";
		int contador = 0;
		
		System.out.printf("Entre com uma frase: ");
		frase = ler.nextLine();
		
		for(int i = 0; i < frase.length(); i++){
			char c = frase.charAt(i);
			
			if(c == 97 | c == 101 | c == 105 | c == 111 | c == 117){
				continue;     
			}
			if(c >= 98 && c <= 122){ 
				contador++;	
			}
		}
		
		System.out.print("\nLetras consoantes aparecem : " + contador + " vez/vezes");
	}
}

