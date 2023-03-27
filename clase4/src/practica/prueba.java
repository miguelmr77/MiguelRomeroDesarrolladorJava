package practica;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (String linea : Files.readAllLines(Paths.get(archivo))){

			if(linea.startswith(“*”)){

			System.out.println(linea);

			}

			}
	}

}
