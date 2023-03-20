package clase3;
import java.util.Scanner;
public class ejercicio1a {
	

	public static void main (String args []) {
		String frase;
		char letra = 0;
		int contLetra = 0;
		
		
	try (Scanner leer = new Scanner (System.in)) {
		System.out.print ("Ingrese una frase: ");
		frase = leer.nextLine();
		System.out.print ("Ingresoe letra a buscar: " );
		letra = leer.next().charAt(0);
	
	
		}
	

		for (int i=0; i < frase.length(); i++) {
				if (letra == frase.charAt(i)) {
			         contLetra++;
					}
				}
		if (contLetra == 1) {
			System.out.println("La letra " + letra + " se encuentra " + contLetra + " vez en la frase");
			
		}
		else {			
		System.out.println("La letra " + letra + " se encuentra " + contLetra + " veces en la frase");
		}

		}
				
				
				
	
}
