package pk_ejercicio2;

import java.util.Scanner;

public class Ejercicio2b {
	
	public static void main(String[] args) {
		
		
		System.out.println("clase 3 ejercicio 2b");
		
		
		
		
			try (Scanner word = new Scanner(System.in)) {
				System.out.println("ingrese palabra");
				String Palabra = word.nextLine();
				
				
				
				System.out.println ("ingrese el desplazamiento");
				try (Scanner Desplazar = new Scanner (System.in)) {
					Integer Desplaza = Integer.parseInt (Desplazar.nextLine());


					char abecedario[]= new char [] {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
					char Vaux[] = new char[] {};
 						System.out.println("Palabra Original: " + Palabra );
					
						for(int indice =0; indice<Palabra.length(); indice++)
							
						{	
							
							char Caracter =Palabra.charAt(indice);

							for(int i =0; i<abecedario.length; i++)
							{
								
								if(Caracter==abecedario[i] && ((i + Desplaza)<27))
								{
									Vaux[i] = abecedario[i+Desplaza];
								}
							}
							
						}
						 String codificada = String.copyValueOf(Vaux);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				 
			
			}
			}
}		





