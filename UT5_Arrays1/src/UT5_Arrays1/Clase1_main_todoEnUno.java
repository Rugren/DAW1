package UT5_Arrays1;

import java.util.Scanner;

public class Clase1_main_todoEnUno {
	
	/* EJERCIO 1
	Crea un array de números y otro de String de 10 posiciones cada uno. El primero lo
	rellenaremos con la nota de un examen(entre 0 y 10, debemos controlar que inserte una
	nota válida), pudiendo ser decimal la nota en el array de números, en el de Strings se
	insertarán los nombres de los alumnos.

	Después, crearemos un array de Enumerados donde insertaremos los siguientes valores
	dependiendo la nota:
	- Si la nota está entre 0 y 4,99 , será un SUSPENSO.
	- Si está entre 5 y 6,99 , será un BIEN.
	- Si está entre 7 y 8,99 será un NOTABLE.
	- Si está entre 9 y 10 será un SOBRESALIENTE.

	Muestra por pantalla, el alumno su nota y su resultado en palabras. Crea los métodos que
	creas conveniente.
	*/

	
	/* dentro del public class Clase1_main se puede hacer todo:
	 Hemos metido: 
	 el enum
	 el public static Resultado calcularResultado
	 el public static String resultadoToString
	 y el MAIN = public static void main(String[] args) {
	*/
	
	enum Resultado {
		SUSPENSO, BIEN, NOTABLE, SOBRESALIENTE
	}

	
	public static Resultado calcularResultado(float nota) {
		if (nota >= 0 && nota < 4.99) {
			return Resultado.SUSPENSO;
		} 
		else if (nota >= 5 && nota < 6.99) {
			return Resultado.BIEN;	// El ejercicio pone que si sacamos un 5 tenemos un BIEN, por lo que esta bien redactado.
		} 
		else if (nota >= 7 && nota < 8.99) {
			return Resultado.NOTABLE;
		}
		else {
			return Resultado.SOBRESALIENTE;
		}
	}

	public static String lasNotas (Resultado resultadoNotas) {
		switch (resultadoNotas) {
		case SUSPENSO:
			return "SUSPENSO";
		case BIEN:
			return "BIEN";
		case NOTABLE:
			return "NOTABLE";
		case SOBRESALIENTE:
			return "SOBRESALIENTE";
		default:
			return "";
		}
	}

	
	// AQUI HECHO EL MAIN, se puede hacer todo en uno.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[] notas = new float[10];
		String[] alumnos = new String[10];
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe la nota y nombre del alumno, escribe 99 para finalizar. ");
		

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
			float ValorNota = scanner.nextFloat();
			
			if (ValorNota < 0 || ValorNota > 10) {
				System.out.println("Nota no valida, introduce una nota entre 0 y 10.");
				i--; // Repetimos la iteración
				
			}
			else {
				notas[i] = ValorNota; // si la nota es entre 0 y 10, como es valida, que nos de el nombre del alumno.
				System.out.print("Introduce el nombre del alumno " + (i + 1) + ": ");
				scanner.nextLine(); // Limpiamos el buffer de entrada, para poder poner el nombre del alumno.
				String alumno = scanner.nextLine();
				alumnos[i] = alumno;
				
			}
			
			System.out.println("Escribe cualquier numero para seguir poniendo notas, o 99 si ya has acabado");
			
			if (scanner.nextFloat() == 99) {
				
				System.out.println("RESULTADOS:");
				for (int r = 0; r < notas.length; r++) {
					System.out.println(
							alumnos[r] + ": " + notas[r] + " - " + lasNotas(calcularResultado(notas[r])));
				
					break;
				}

//				ESTO PARA CORTAR EL BUCLE // pero cuando empezamos de nuevo pone alumno 1 otra vez.
				System.out.println("Has terminado de poner notas.");
				return;
				
			
				// hacer un while o un do while, para que mientras no escriba 99 no corte la aplicacion.
				//while (scanner.hasNext()) {
				//	}
			}

			
		} // Fin de bucle for de Nota y Nombre del alumno.
		
		
/* +++
		System.out.println("RESULTADOS:");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(
					alumnos[i] + ": " + notas[i] + " - " + resultadoToString(calcularResultado(notas[i]))); // y en el contructor "public static String lasNotas" cambiar a resultadoToString por "lasNotas".
		}
*/
	
	
	}
	
	


}
