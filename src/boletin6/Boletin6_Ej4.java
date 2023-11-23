package boletin6;
import java.util.Scanner;
public class Boletin6_Ej4 {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String fraseIntroducida=sc.nextLine();
		sc.close();
		int mitadCadena=fraseIntroducida.length()/2;
		if(fraseIntroducida.length()%2==0) {
			String nuevaCadena=fraseIntroducida.substring(0,mitadCadena)+ "<>"+fraseIntroducida.substring(mitadCadena);
			System.out.println("La nueva cadena es :"+ nuevaCadena);
		}else {
			System.out.println("No se pueden introducid los caracteres en medio de la cadena ya que el valor de la longitud de la cadena es impar");
		}

	}

}
