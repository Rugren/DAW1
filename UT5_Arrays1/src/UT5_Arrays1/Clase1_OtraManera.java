package UT5_Arrays1;

// import java.util.Scanner;

public class Clase1_OtraManera {

//	public Clase1_OtraManera() {
		// TODO Auto-generated constructor stub
//}		
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

	enum Resultado {
		SUSPENSO, SUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE
	}

	
	// Como el de Manu
	
		public static String Clase1 () {
			float[] arrayNumeros = new float[] {6.90f, 4.50f, 8.25f, 9.54f};
			String[] arrayStrings = new String[] {"Ruben", "Miguel", "Ramon", "Manu"};
			
			for (int i = 0; 1 <= arrayNumeros.length; i++) {
				if (arrayNumeros[i] < 5)
					return arrayStrings[i] + " ha sacado un " + arrayNumeros[i] + ", por lo que su nota es " + Resultado.SUSPENSO;
				if (arrayNumeros[i] < 6)
					return arrayStrings[i] + " ha sacado un " + arrayNumeros[i] + ", por lo que su nota es " + Resultado.SUFICIENTE;
				if (arrayNumeros[i] < 7)
					return arrayStrings[i] + " ha sacado un " + arrayNumeros[i] + ", por lo que su nota es " + Resultado.BIEN;
				if (arrayNumeros[i] < 9)
					return arrayStrings[i] + " ha sacado un " + arrayNumeros[i] + ", por lo que su nota es " + Resultado.NOTABLE;
				if (arrayNumeros[i] < 10)
					return arrayStrings[i] + " ha sacado un " + arrayNumeros[i] + ", por lo que su nota es " + Resultado.SOBRESALIENTE;
				

				// System.out.println("hola");
			}
			return "";
	
	}
		
		public static void main(String[] args) {
			
			System.out.println(arrayNumeros);
			// hacer un contructor que llame a esto para ponerlo aqui.
			
		}

		


}
