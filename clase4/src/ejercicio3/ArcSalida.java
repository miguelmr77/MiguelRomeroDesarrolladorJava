package ejercicio3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ArcSalida {
//Bloque Atributos
	String Txt;
	String Path;
	
//Bloque Constructores	
public  ArcSalida(String Texto, String Ruta) {
	this.Txt=Texto;
	this.Path=Ruta;
}	
public  ArcSalida() {}
	
//Bloque Metodos
	public void EscribirArchivos()
	{
		try {
			Files.writeString(Paths.get(Path), Txt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}