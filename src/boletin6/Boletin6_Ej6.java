package boletin6;
import java.util.Scanner;
public class Boletin6_Ej6 {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		System.out.println("Introduzca un numero :");
		long numeroDado=sc.nextLong();
		
		
		System.out.println("Introduzca la posicion en la que quiera insertar el numero");
		int posicion=sc.nextInt();
		
		System.out.println("Introduzca el numero que quiere introducir");
		int numeroIntroducido=sc.nextInt();
		System.out.println(insertadorNumeros(numeroDado,posicion,numeroIntroducido));
		sc.close();

	}
	public static String insertadorNumeros(long numero,int posicion,int numeroInsertado) {
		String numeroCadena=String.valueOf(numero);
		String primeraCadena=numeroCadena.substring(0,posicion-1);
		String segundaCadena=numeroCadena.substring(posicion-1);
		String cadenaCompleta=primeraCadena+numeroInsertado+segundaCadena;
		return cadenaCompleta;
	}
}
