package boletin6;
import java.util.Scanner;
public class Boletin6_Ej10 {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		System.out.println("Introduzca una frase para comprobar si es palindroma :");
		String frase=sc.nextLine();
		String fraseInvertida=fraseInvertida(frase);
		System.out.println(fraseInvertida);
		String fraseSinEspacios=quitadorEspacios(frase);
		String invertidaSinEspacios=quitadorEspacios(fraseInvertida);
		sc.close();
		System.out.println(fraseSinEspacios);

		if(fraseSinEspacios.equalsIgnoreCase(invertidaSinEspacios)) {
			System.out.println("Son frases palindromas.");
		}else {
			System.out.println("No son frases palindromas");
		}

	}
	public static String fraseInvertida(String frase) {
		String fraseInvertida="";
		for(int i=frase.length()-1;i>=0;i--) {
			fraseInvertida+=frase.charAt(i);
		}return fraseInvertida;
	}
	
	public static String quitadorEspacios(String frase) {
		return frase.replaceAll("\\s", "");
	}
}
