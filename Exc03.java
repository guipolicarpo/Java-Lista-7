/* Guilherme Policarpo de Carvalho */
public class Exc03 {
	
	public static void main (String[] args) {
		String letrasMinusculas = "";
		
		for(char i = 'A'; i <= 'Z'; i++){
			letrasMinusculas += i;
			
			System.out.print((int)i + " - " + i + "\t");
		}
		
		System.out.print("\n\n" + letrasMinusculas);
	}
}

