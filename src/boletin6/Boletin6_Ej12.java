package boletin6;
import java.util.Scanner;
public class Boletin6_Ej12 {

	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		System.out.println("Introduzca la contraseña :");
		String contraseñaReal=sc.nextLine();
		boolean condicion=false;
		
		System.out.println("PISTAS");
		System.out.println("La longitud de la contraseña es de :"+ contraseñaReal.length());
		System.out.println("El primer caracter de la contraseña es :"+contraseñaReal.charAt(0));
		System.out.println("El ultimo caracter de la contraseña es :"+contraseñaReal.charAt(contraseñaReal.length()-1));
		while(condicion==false) {
			System.out.println("Introduzca para la contraseña adivinar la original");
		String contraseñaAdivinar=sc.nextLine();
		if(contraseñaReal.equals(contraseñaAdivinar)) {
			System.out.println("Acertaste");
			condicion=true;
		}else {
			System.out.println("No has acertado introduzca otra contraseña ");
		}
		}
		sc.close();
	}

}
