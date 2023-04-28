package clase5;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
  
   String ruta="C:\\Users\\MiGuEl\\Desktop\\desarrollador java\\clase5\\src\\clase5\\Entrada.txt";
    	
	
ScannerClass(ruta);
}     
 
public static void ScannerClass(String ruta)
{ 
	int Id=1;
	String DescProducto;
   Double Cantidad;
   Double Precio;
   File file = new File(ruta);
   Carrito_Compras Carrito= new Carrito_Compras();   
   try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8))
   {
   	System.out.println("cant	precioUnitario	producto	\n");
   	
       while (sc.hasNextLine()) 
       {
       	
    	   String[] VectorString= (sc.nextLine()).split(",");
    
    	   DescProducto=VectorString[2];
    	   Cantidad=Double.parseDouble(VectorString[0]);
    	   Precio=Double.parseDouble(VectorString[1]);
    	
    	   Producto obj= new Producto();
    	   obj.Descripcion=DescProducto;
    	   obj.idProducto=Id;
    	   obj.PrecioUnitario=Precio;
    	   Id+=1;
    	  
    	  Item_Carrito obj2= new Item_Carrito();
    	   obj2.Leer_Cargar(obj, Cantidad);
    	   
    	   Carrito.precio(obj2);
    	   	System.out.println(obj2.Cantidad + "	" + obj.PrecioUnitario + "		" + obj.Descripcion);
    	   //System.out.println("\n "+ obj.idProducto + " - " + obj.Descripcion + " x " + obj2.Cantidad);
    	   //System.out.println("Precio unitario: $" + obj.PrecioUnitario + " Precio x " + obj2.Cantidad + ": $" + (obj.PrecioUnitario*obj2.Cantidad));
       }
       System.out.println("	carrito.precio()=="+ Carrito.Total);
     //System.out.println("\nTotalCarrito:                         $"+ Carrito.Total);
   }
   catch (IOException e) {
       e.printStackTrace();
   }
}
	
}