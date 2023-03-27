package ejercicio1;

public class Ejercicio1_a {
		public static void main(String [] args) {
			int n1 = 100;
			int n2 = 300;
			int n3 = 254;
			String let1 = "a";
			String let2 = "d";
			
			ordenar ord = new ordenar();
			ord.oAscendente(n1, n2, n3, let1);
			System.out.println();
			ord.oDesscendente(n1, n2, n3, let2);
		}		
}
