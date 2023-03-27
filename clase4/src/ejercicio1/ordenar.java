package ejercicio1;

import java.util.Arrays;
import java.util.Collections;

public class ordenar {
	//atributos
		int[] numero;	
		int[] numero2;
			
	// metodo ordenar ascendente
	
			
	public void oAscendente(int num1 ,int num2 ,int num3,String letra) {
		int[] numeros = {num1,num2,num3};
		System.out.println ("Numeros ordenados de forma ascendente");
		Arrays.sort(numeros);
		System.out.print (letra + " ");
		for (int numero:numeros) {
			System.out.print ( numero + " ");
		}
		}
	
	
	// metodo ordenar descendente
	public void oDesscendente(int num1 ,int num2 ,int num3, String letra) {
	Integer[] numeros2 = {num1,num2,num3};
	System.out.println ("Numeros ordenados de forma descendente");	
	Arrays.sort(numeros2, Collections.reverseOrder());
	System.out.print (letra + " ");
	for (int numero2:numeros2) {
		System.out.print (numero2 + " ");
	}
	}
	
}