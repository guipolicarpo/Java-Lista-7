/* Guilherme Policarpo de Carvalho */
public class Exc02 {
	
	public static void main (String[] args) {
		String letrasMaiusculas = "";
		
		for(int i = 65; i <= 90; i++){
			letrasMaiusculas += (char)i;
			
			System.out.print(i + " - " + (char)i + "\t");
		}
		
		System.out.println("\n\n" + letrasMaiusculas);
	}
}

