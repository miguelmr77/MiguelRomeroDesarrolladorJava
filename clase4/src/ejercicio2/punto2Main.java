package ejercicio2;

public class punto2Main {
	public static void main (String[] args) {
		archivosnumeros a = new archivosnumeros();
		System.out.println("la suma de todos los numeros es: "+a.sumar("C:\\Users\\MiGuEl\\Desktop\\desarrollador java\\clase4\\src\\txt\\numeros.txt"));
		System.out.println();
		System.out.println("la multiplicacion de todos los numeros es: "+a.multiplicar("C:\\Users\\MiGuEl\\Desktop\\desarrollador java\\clase4\\src\\txt\\numeros.txt"));
	}
}
