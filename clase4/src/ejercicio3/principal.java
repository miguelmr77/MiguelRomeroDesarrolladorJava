package ejercicio3;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// Variables Rutas de Archivos
		String PathEntrada="C:\\Users\\MiGuEl\\Desktop\\desarrollador java\\clase4\\src\\ejercicio3\\txt\\entrada.txt";
		String PathCodificado="C:\\Users\\MiGuEl\\Desktop\\desarrollador java\\clase4\\src\\ejercicio3\\txt\\codificado.txt";
		String PathSalida="C:\\Users\\MiGuEl\\Desktop\\desarrollador java\\clase4\\src\\ejercicio3\\txt\\salida.txt";
		// Variables para toma de deciciones
	     String OpcCodificar;
	     // Variables para ingreso de datos
	     String IngresoTxt;
	     int IngresoDesp;
	     // Interactuo con el usuario y seteo la variable de OpcCodificador
        System.out.println("*********** Clase 4 - Ejecicio 3  *************");
        System.out.println("Ingrese: 1 para Codificar | 2 para Decodificar");
        Scanner Lectura1 = new Scanner(System.in); 
        OpcCodificar=Lectura1.nextLine();
        // Uso variable OpcCodificador para tomar decision a traves de un swith
     // Interactuo con el usuario y seteo la variable de IngresoDesp
		 System.out.println("Ingrese Desplazamiento:");
		 Scanner Lectura3 = new Scanner(System.in);
		 IngresoDesp=Integer.parseInt(Lectura3.nextLine());
		 
        switch(OpcCodificar) {
		case "1": 
			
			 System.out.println("Ingrese texto a codificar:");// Interactuo con el usuario y seteo la variable de IngresoTxt
			 Scanner Lectura2 = new Scanner(System.in);
			 IngresoTxt=Lectura2.nextLine();
			 ArcSalida EscriboArchivo=new ArcSalida(IngresoTxt,PathEntrada);// Instancio clase ArcSalida, por medio de uno de sus constructores 
             EscriboArchivo.EscribirArchivos(); // uso el objeto y su metodo para escribir en el archivo de entrada
			 Decodificador ClassCod=new Decodificador(IngresoTxt,IngresoDesp);// Instancio clase DeCodificador, por medio de uno de sus constructores 
			 ArcSalida EscriboArchCod=new ArcSalida(ClassCod.Codificar(),PathCodificado);/*uso el objeto ClassCod y escribo el parametro que devuelve */
			 EscriboArchCod.EscribirArchivos();/* en un Archivo Creo otro objeto ArcSalida para escribir en el Archivo Codificado */
			
			 break;
		case "2":
			try {
				ArcEntrada LeoArchivo=new ArcEntrada(PathCodificado);
				Decodificador ClassDeco=new Decodificador(LeoArchivo.LeerArchivos(),IngresoDesp);
				ArcSalida EscriboArcDeco=new ArcSalida(ClassDeco.Decodificar(),PathSalida);
				EscriboArcDeco.EscribirArchivos();
				System.out.println("Exito - Se ejecutó correctamente");
				}
			catch(Exception e){
				System.out.println("Error - Hubo problemas y no se ejecutó correctamente: " + e);
			}
			
				break;
				
		default:  System.out.println("No existe esa opción");
	}
        System.out.println ("el archivo se guardo correctamente");
	}

}