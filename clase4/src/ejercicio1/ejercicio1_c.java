package ejercicio1;

import javax.swing.JOptionPane;

public class ejercicio1_c {
	public static void main(String [] args) {
		int n1 =  52;
		int n2 = 0;
		int n3 =  Integer.parseInt(JOptionPane.showInputDialog("introduce tercero numero"));
		String let1 = (JOptionPane.showInputDialog("ingrese una letra para representar ascendente"));
		String let2 = (JOptionPane.showInputDialog("ingrese una letra para representar descendente"));
		
		ordenar ord = new ordenar();
		ord.oAscendente(n1, n2, n3, let1);
		System.out.println();
		ord.oDesscendente(n1, n2, n3, let2);
	}		
}
