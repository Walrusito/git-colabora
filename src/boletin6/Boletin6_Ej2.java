package boletin6;
import java.util.Scanner;
public class Boletin6_Ej2 {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String fraseIntroducida=sc.nextLine();
		sc.close();
		int numeroEspacios=contadorEspacios(fraseIntroducida);
		System.out.println("El numero de espacios en la frase es de : "+numeroEspacios);
		

	}
	public static int contadorEspacios (String frase) {
		int contadorEspacios=0;
		for(int i=0;i<=frase.length();i++) {
			if (Character.isWhitespace(frase.charAt(i))) {
                contadorEspacios++;
		}
	}
		return contadorEspacios;
	}
}
