package boletin6;
import java.util.Scanner;
public class Boletin6_Ej1 {

	public static void main(String[] args) {
		//esto es un lector en java
		var sc=new Scanner(System.in);
		System.out.println("Introduzca la primera palabra :");
		String primeraPalabra=sc.nextLine();
		System.out.println("Introduzca la segunda palabra :");
		String segundaPalabra=sc.nextLine();
		sc.close();
		
		//esto es una condicion
		if(primeraPalabra.length()<segundaPalabra.length()) {
			System.out.println(primeraPalabra + "  es la palabra mas corta");
		}else if(primeraPalabra.length()>segundaPalabra.length()) {
			System.out.println(segundaPalabra+ "  es la palabra mas corta");
		}else {
			System.out.println("Ambas palabaras tienen el mismo numero de caracteres");
		}
		
		
		

	}
	
}
