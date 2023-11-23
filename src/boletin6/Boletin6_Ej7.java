package boletin6;
import java.util.Scanner;
public class Boletin6_Ej7 {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		System.out.println("Introduzca la frase a invertir");
		String frase=sc.nextLine();
		sc.close();
		System.out.println(fraseInvertida(frase));
		
	}
	public static String fraseInvertida(String frase) {
		String fraseInvertida="";
		for(int i=frase.length()-1;i>=0;i--) {
			fraseInvertida+=frase.charAt(i);
			
			
			
			
		}
		return fraseInvertida;
		
		
	}
}
