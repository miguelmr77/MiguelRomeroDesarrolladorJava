package clase1;

import java.util.Scanner;

public class ejercicio1c {

	public static void main (String args []) {
		int numeroInicio = 5;
		int numeroFin = 14;
		int i=5;
		int num;
		
		
		
		try (Scanner leer = new Scanner (System.in)) {
			System.out.println ("Introduzca 1 para ver los numeros pares");
			System.out.println ("Introduzca 2 para ver los numeros impares");
			num = leer.nextInt();
		} 
		if (num==1) {
		System.out.println("Numeros Pares:");
		while (i >= numeroInicio & i <= numeroFin) {
			
			  if(i%2==0){
		      System.out.println(i);
		      }
			  
		      i++;
		}
		}
		
		else {
		System.out.println("Numeros impares:");
		i=5;
		while (i >= numeroInicio & i <= numeroFin) {
			
			  if(i%2!=0){
		      System.out.println(i);
		      }
			  
		      i++;
		}
		}
		
	}
		
}