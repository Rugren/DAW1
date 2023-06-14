import java.util.Scanner;

public class E2_A5_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Ejercicio 2: Crea un programa donde se pida al usuario dos números y diga cuál es mayor.
		
		System.out.println("Introduce dos numero y te diremos cual es mayor de los 2");
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		
		int numIntroducido1 = num1.nextInt();
		System.out.println("Tu primer numero elegido es: " + numIntroducido1);
		int numIntroducido2 = num2.nextInt();
		System.out.println("Tu segundo numero elegido es: " + numIntroducido2);
		
		
		if (numIntroducido1 == numIntroducido2) {
			System.out.println("Los 2 numeros introducidos son iguales");
		}
		else if (numIntroducido1 > numIntroducido2) {
			System.out.println("El primer numero introducido es mayor");
		}
		
		else if (numIntroducido2 > numIntroducido1) {
			System.out.println("El segundo numero introducido es mayor");
		}

		
		num1.close();
		num2.close();

	
		
		
	}

}
