package clase1;

import java.util.Scanner;

public class ejercicio2d {
	
	
	public static void main (String args []) {
		double IMT_min = 489083.00;
		int cantAutosMin = 3;
		int cantInnmueblesMin = 3;
		String BarcoNaveAcciones;
		
		
		String NomPersona;
		double IngMenTotal;
		int autos;
		int inmuebles;
		

		try (Scanner leer = new Scanner (System.in)) {
			System.out.print ("Ingrese Nombre: ");
			NomPersona = leer.nextLine();
			System.out.print ("Ingreso Mensual Total: ");
			IngMenTotal = leer.nextInt();
			System.out.print ("Ingrese cantidad de autos: ");
			autos = leer.nextInt();
			System.out.print ("Ingrese cantidad de inmuebles: ");
			inmuebles = leer.nextInt();
			System.out.print ("posee barcos, aviones o acciones? SI / NO: ");
			BarcoNaveAcciones = leer.next();
		
	}
	

		if (IngMenTotal >= IMT_min) {
			
			System.out.println("Categoria: Persona con Altos Ingresos: " + NomPersona);
			
		}
		else {
				if (autos >= cantAutosMin) {
				
					System.out.println("Categoria: Persona con Altos Ingresos: " + NomPersona);
				
				}
				else {
						if (inmuebles >= cantInnmueblesMin) {
					
							System.out.println("Categoria: Persona con Altos Ingresos: " + NomPersona);
					
					
						}
						else {
								if ( BarcoNaveAcciones.equals ("SI") || BarcoNaveAcciones.equals ("si") || BarcoNaveAcciones.equals ("Si")) {
									
									System.out.println("Categoria: Persona con Altos Ingresos: " + NomPersona);
								}
								else {
									System.out.println("Categoria: Persona no tiene Ingresos Altos: " + NomPersona);
								}
								
							
							
						}
				
			}
		}
				
		
}
	
}
