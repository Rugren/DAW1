import java.util.Scanner;

public class E1_A5_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ejercicio 1 de A5_CondicionalesII
		// Crea un programa donde se pida al usuario dos números y muestre la media aritmética.
		
		System.out.println("Introduce dos numero y te diremos su media aritmetica");
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		
		int numIntroducido1 = num1.nextInt();
		System.out.println("Tu primer numero elegido es: " + numIntroducido1);
		int numIntroducido2 = num2.nextInt();
		System.out.println("Tu segundo numero elegido es: " + numIntroducido2);
		
		int resultado = (numIntroducido1 + numIntroducido2) /2 ;
		System.out.println("La media aritmetica de tus 2 numeros escogidos es: " + resultado);
		

		
		
	}

}
