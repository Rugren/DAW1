import java.util.Scanner;

public class E4_A5_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Ejercicio 4: Realiza un programa que solicite una edad válida al usuario. 
		Esta edad estará comprendida entre 18 y 67 años.
		En caso de no estar comprendida entre ambas edades debemos mostrar un
		mensaje de error por pantalla del tipo: “ERROR: No cumple las condiciones
		para entrar en el sistema”.
		En caso contrario, podemos solicitar su nombre y almacenarlo para mostrarlo
		por pantalla en un mensaje de bienvenida con su nombre y su edad.
		*/
		
		System.out.println("Escriba su edad");
		Scanner edadQueTiene = new Scanner(System.in);
		
		int edad = edadQueTiene.nextInt();
		System.out.println("Su edad es: " + edad + " años");

		if (edad >=18 && edad <= 67 ) {
			System.out.println("Enhorabuena, cumple con los rangos de edad");
		}
		
		else {
			System.out.println("ERROR: No cumple las condiciones de edad para entrar en el sistema");
		}

		
		System.out.println("Ahora, escriba su nombre para acceder al sistema");
		Scanner nombreAceptado = new Scanner(System.in);
		String nombre = nombreAceptado.next();
		System.out.println("Bienvenido: " + nombre + " de " + edad + " años de edad");
	
		
		
		edadQueTiene.close();
		nombreAceptado.close();
		
	}

}
