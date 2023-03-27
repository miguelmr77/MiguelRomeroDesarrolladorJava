package ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;

public class archivosnumeros {
	public int sumar (String direccion) {
		int sum=0;
		try {
			
			BufferedReader bf = new BufferedReader( new FileReader(direccion));
			String temp = "";
			String bfRead;
			
			while((bfRead = bf.readLine()) != null) {
				//haz el ciclo, mientras bfread tiene datos
				for(int x=0; x<bfRead.length(); x++){
                    if(String.valueOf(bfRead.charAt(x)).equals(" ")){
                        sum+=Integer.parseInt(temp);
                        temp="0";
                    }else{
                        temp+=bfRead.charAt(x);
                    }
                }
                sum+=Integer.parseInt(temp);
                temp="0";
			}
			
			
		}catch(Exception e) {System.err.println ("No se encontro archivo");
			
		}	
		
		return sum;
	
}





public int multiplicar (String direccion) {
	int mult=1;
	try {
		
		BufferedReader bf = new BufferedReader( new FileReader(direccion));
		String temp = "";
		String bfRead;
		
		while((bfRead = bf.readLine()) != null) {
			//haz el ciclo, mientras bfread tiene datos
			for(int x=0; x<bfRead.length(); x++){
                if(String.valueOf(bfRead.charAt(x)).equals(" ")){
                    mult*=Integer.parseInt(temp);
                    temp="0";
                }else{
                    temp+=bfRead.charAt(x);
                }
            }
            mult*=Integer.parseInt(temp);
            temp="0";
		}
		
		
	}catch(Exception e) {System.err.println ("No se encontro archivo");
		
	}	
	
	return mult;

}

}