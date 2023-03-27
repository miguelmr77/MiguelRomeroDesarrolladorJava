package ejercicio3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ArcEntrada {
	//Bloque Atributos
		String Path;
		
	//Bloque Constructores	
	public  ArcEntrada(String Ruta) {
		this.Path=Ruta;
	}	
		
	//Bloque Metodos
	public String LeerArchivos() 
		{
			try {
				for (String linea : Files.readAllLines(Paths.get(Path)))
				{
					return linea;
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "";
		}
	}