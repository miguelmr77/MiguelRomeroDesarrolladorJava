package clase3;

public class ejercicio_2 {
	public static void main(String[] args) {
		
		
		System.out.println("clase 3 ejercicio 2b");
		
		String Palabra = "hola que tal";
		int Desplaza = 1;
		String aux=null;
		String Vaux[] = new String[12] ;
		
				char abecedario[]= new char [] {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
				System.out.println("Palabra Original: " );
				System.out.println(Palabra );
				System.out.println();
						for(int indice =0; indice<Palabra.length(); indice++)
							
						{	
							char Caracter =Palabra.charAt(indice);
							

							for(int i =0; i<abecedario.length; i++)
							{
								
								if(Caracter==abecedario[i] && ((i + Desplaza)<27))
								{	
									aux = abecedario[i+Desplaza] + "";
									
										Vaux[indice] = aux;
									
									
								}
								
							}
							

							
						}
						System.out.println("Palabra Codificada: ");		
				for (int i=0; i<Vaux.length; i++) {
				System.out.print( Vaux[i]);
				}
				System.out.println();
				System.out.println();
				
				
				
				
				//decodificar palabra
				for(int indice =0; indice<Vaux.length; indice++)
					
				{	
					
					String Caracter = Vaux[indice];

					for(int i =0; i<abecedario.length; i++)
					{
						
						if(Caracter.equals(abecedario[i]+ "") && ((i + Desplaza)<27))
						{
							aux = abecedario[i-Desplaza] + "";
									
										Vaux[indice] = aux;
						}
					}
					
				}
				
				System.out.println("Palabra Decoodificada: ");
				for (int i=0; i<Vaux.length; i++) {
				System.out.print( Vaux[i]);
				}
				System.out.println(); 
			}
}	
