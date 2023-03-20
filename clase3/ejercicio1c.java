package clase3;

public class ejercicio1c {
public static void main(String[] ar) {
		
		int[] numeros = {100,10,25,300,40};
		int  numeroX = 100;
		int  sumaN = 0;
		
		
		System.out.println ("resultado de la suma: ");
		
		for (int i=0; i < numeros.length; i++) {
			if (numeros[i] > numeroX ) {
		         sumaN = sumaN + numeros[i];
		         
				}
			
			
			}
		System.out.println (sumaN);
	
		}
		
		
	
}
