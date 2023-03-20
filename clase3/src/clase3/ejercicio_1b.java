package clase3;
import java.util.Arrays;
import java.util.Collections;
public class ejercicio_1b {
public static void main(String[] ar) {
		
		int[] numeros = {100,10,25};
		
		System.out.println ("Numeros ordenados de forma ascendente");
		Arrays.sort(numeros);
		for (int numero:numeros) {
			System.out.println (numero);
		}
		
		System.out.println ();
		System.out.println ("Numeros ordenados de forma descendente");	
		Integer [] numeros2 = {100,10,25};
		Arrays.sort(numeros2, Collections.reverseOrder());
		for (int numero2:numeros2) {
			System.out.println (numero2);
		}
 
	
	}
}

