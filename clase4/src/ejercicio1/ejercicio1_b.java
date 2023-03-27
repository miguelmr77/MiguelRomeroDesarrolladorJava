package ejercicio1;

import javax.swing.JOptionPane;


public class ejercicio1_b {
	public static void main(String [] args) {
		int n1 =  Integer.parseInt(JOptionPane.showInputDialog("introduce primer numero"));
		int n2 =  Integer.parseInt(JOptionPane.showInputDialog("introduce segundo numero"));
		int n3 =  Integer.parseInt(JOptionPane.showInputDialog("introduce tercero numero"));
		String let1 = (JOptionPane.showInputDialog("ingrese una letra para representar ascendente"));
		String let2 = (JOptionPane.showInputDialog("ingrese una letra para representar descendente"));
		
		ordenar ord = new ordenar();
		ord.oAscendente(n1, n2, n3, let1);
		System.out.println();
		ord.oDesscendente(n1, n2, n3, let2);
	}		
}
