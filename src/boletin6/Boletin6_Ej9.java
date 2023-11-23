package boletin6;
import java.util.Scanner;
public class Boletin6_Ej9 {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		System.out.println("Introduzca su nombre y apellidos :");
		String nombreApellidos=sc.nextLine();
		System.out.println(eliminarVocales(nombreApellidos));
		sc.close();
	}
	  public static String eliminarVocales(String cadena) {
	     
	        return cadena.replaceAll("[aeiouAEIOU]", "");
	    
	}
}
