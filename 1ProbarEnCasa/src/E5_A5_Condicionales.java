import java.util.Scanner;

public class E5_A5_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* Ejercicio 5: 
		Crea un menú con estas opciones:
		1. Cálculo del área de un rectángulo.
		2. Cálculo del área de un círculo.
		3. Cálculo del área de un triángulo.
		Debes crear todas las variables necesarias para almacenar cada uno de los
		cálculos disponibles, así como realizar las operaciones, dependiendo de la
		opción elegida. Puedes usar los valores que prefieras para realizar los
		cálculos.
		*/
		
		System.out.println("Introduce: 1-Calcular el area de un rectangulo, 2-Calcular el area de un circulo, 3-Calcular el area de un triangulo");
		Scanner usuarioQuiereCalcular = new Scanner(System.in);
		
		int opcionUsuario = usuarioQuiereCalcular.nextInt();
		System.out.println("Has elegido calcular: " + opcionUsuario);

		
		switch (opcionUsuario) {
		case 1:
			System.out.println("El usuario quiere calcular el area de un rectangulo");
			break;
		case 2:
			System.out.println("El usuario quiere calcular el area de un circulo");
			break;
		case 3:
			System.out.println("El usuario quiere calcular el area de un triangulo");
			break;
		default:
			System.out.println("Te has equivocado de numero. Vuelve a introducirlo para calcular tu opcion.");
			break;
		}
		

		// area del rectangulo, una variable largo y otra variable ancho.
		if (opcionUsuario == 1) {
		System.out.println("Indique el Largo para calcular el area del rectangulo");
		Scanner scLargo = new Scanner(System.in);	
		float largo = scLargo.nextInt();
		System.out.println("El Largo introducido es: " + largo);

		System.out.println("Indique el Ancho para calcular el area del rectangulo");
		Scanner scAncho = new Scanner(System.in);		
		float ancho = scAncho.nextInt();
		System.out.println("El Ancho introducido es: " + ancho);
		
		float areaRectangulo = largo * ancho;
		System.out.println("\nEl area del rectangulo es: " + areaRectangulo);
		}

		
		// area del circulo, una variable pi(que nunca cambia) y otra que es el radio.
		else if (opcionUsuario == 2) {
		System.out.println("Indique el radio para calcular el area del circulo");
		Scanner scRadioCirculo = new Scanner(System.in);
		
		float radio = scRadioCirculo.nextFloat();
		System.out.println("El radio introducido es: " + radio);
		
		float pi = 3.14f;
		
		float areaCirculo = pi * (radio * radio);
		System.out.println("\nEl area del circulo es: " + areaCirculo);
		}
		
		
		// area del triangulo, una variable 
		else if (opcionUsuario == 3) {
		System.out.println("Indique la base del triangulo para calcular el area del triangulo");
		Scanner scBaseTriangulo = new Scanner(System.in);

		float baseTriangulo = scBaseTriangulo.nextFloat();
		System.out.println("La base del triangulo introducida es: " + baseTriangulo);

		
		System.out.println("Indique la altura del triangulo para calcular el area del triangulo");
		Scanner scAlturaTriangulo = new Scanner(System.in);
		float alturaTriangulo = scAlturaTriangulo.nextFloat();
		System.out.println("La altura del triangulo introducida es: " + alturaTriangulo);
		
		float areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
		System.out.println("\nEl area del triangulo es: " + areaTriangulo);
		}
	
		
		else {
		System.out.println("\nNinguna opcion para calcular es valida, intentalo de nuevo");
		}
	
		
		
		usuarioQuiereCalcular.close();
		
		
		// DUDA: se puede hacer con un escaner para todo? Uno que lea area rectangulo, luego que lea area circulo, etc.?
		// Respuesta profesor: 

//DUDA.	Está bien, pero peta el FLOAT, por qué pasa esto? 


	}

}
