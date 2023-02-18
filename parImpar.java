import java.util.Scanner;

public class parImpar {
	
	public static void main(String[] args) {
		System.out.println("Introdueix 3 nombres per saber si la seva suma es parell o imparell");
		System.out.println("ES IMPORTANT COLOCARLOS SEPARATS PER COMES I JUNTS (p.ex: 4,5,6)");
		Scanner sc = new Scanner (System.in);
		String num1 = sc.next(); 
		sc.close();
		resolve(num1);
		
	}
	
	private static void resolve(String num1) {
		int resultat=0;
		int varPont;
		String[]arr=num1.split(",");
		
		for(int i=0;i<arr.length;i++) {
			varPont=Integer.parseInt(arr[i]);
			resultat=resultat+varPont;
		}
		
		if(resultat%2==0) {
			System.out.println(resultat + " és parell");
		}else {
			System.out.println(resultat + " és imparell");
		}
		
	}

}
