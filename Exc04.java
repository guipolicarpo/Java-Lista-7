/* Guilherme Policarpo de Carvalho */
public class Exc04 {
	
	public static void main (String[] args) {
		String numericos = "";
		
		for(char i = '0'; i <= '9'; i++){
			numericos += i;
			
			System.out.print((int)i + " - " + i + "\t");
		}
		
		System.out.print("\n\n" + numericos);
	}
}

