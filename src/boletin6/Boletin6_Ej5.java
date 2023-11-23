package boletin6;
import java.util.Scanner;
public class Boletin6_Ej5 {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		System.out.println("Introduzca el numero a partir :");
		int numeroIntroducido=sc.nextInt();
		String conversionCadena=String.valueOf(numeroIntroducido);
		
		System.out.println("Introduzca a partir de que posicion quiere que se parta el numero");
		int posicion=sc.nextInt();
		sc.close();
		
		String parte1=conversionCadena.substring(0,posicion-1);
		String parte2=conversionCadena.substring(posicion-1);
		
		System.out.println("El numero se ha dividido en dos partes,primera :"+ parte1+", segunda parte : "+parte2);
		

	}

}
