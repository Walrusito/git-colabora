package boletin6;
import java.util.Scanner;
public class Boletin6_Ej8 {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String fraseIntroducida=sc.nextLine();
		System.out.println("Introduzca la palabra a buscar");
		String palabraBuscar=sc.nextLine();
		System.out.println(contarPalabras(fraseIntroducida,palabraBuscar));
		sc.close();
		

	}
	public static int contarPalabras(String s,String palabra) {
	    int contador = 0, posicion=s.indexOf(palabra);                          

	    while (posicion != -1) {   
	    contador++;   
	    posicion = s.indexOf(palabra, posicion + 1);                      
	            }                                    
	    
	    return contador;
	
	}
}
