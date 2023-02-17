import java.util.Scanner;

public class frase {

	public static void main(String[] args) {
		System.out.println("Introdueix una frase i tot seguit un caracter per substituirlo per un '*'");
		Scanner sc= new Scanner(System.in);
		
		String frase=sc.nextLine();
		CharSequence caracter=sc.next();
		
		if(caracter.length()>1) {
			System.out.println("La longitud del carácter ha de ser 1");
		}else {
			checkAndSubstituteChar(frase, caracter);
		}
		sc.close();
	}

	private static void checkAndSubstituteChar(String frase, CharSequence caracter) {
		int cont=0;
		String dato = frase.replace(caracter, "*");
		
		for(int i=0; i<dato.length();i++) {
			if(dato.charAt(i) == '*') {
				cont++;
			}
		}
		
		if(cont==0) {
			System.out.println("El caràcter no existeix");
		}else {
			System.out.println(dato);
		}
	}

}
