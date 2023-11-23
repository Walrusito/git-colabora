package boletin6;
import java.util.Scanner;
public class Boletin6_Ej3 {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String fraseIntroducida=sc.nextLine();
		sc.close();
		System.out.println(hayEspacio(fraseIntroducida));
	}
	public static boolean hayEspacio(String frase) {
		int numeroCaracteres=frase.length();
		if(frase.length()%2==0) {	
			return Character.isWhitespace(frase.charAt(numeroCaracteres/2)-1);
			}
		else{
			return Character.isWhitespace(frase.charAt(numeroCaracteres/2));
		}
		
		
	
	}
}
