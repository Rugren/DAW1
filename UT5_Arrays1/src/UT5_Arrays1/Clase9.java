package UT5_Arrays1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Clase9 {
	
	/* EJERCICIO 9
	Crea dos arrays de numeros con un tamano pasado por teclado.
	Uno de ellos estara rellenado con numeros aleatorios y el otro sera copia del anterior,
	despues crea un nuevo array con el tamano pasado por teclado.
	Despues, crea un metodo que tenga como parametros, los dos arrays y devuelva uno nuevo
	con la multiplicacion de la posicion 0 del array1 con el del array2 y asi sucesivamente,
	quedara almacenado en el tercer array. Por ultimo, muestra el contenido de cada array.
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Aqui pedimos que el usuario escriba el tamano de los arrays
		System.out.print("Introduce el tamano de los arrays: ");
		Scanner sc = new Scanner(System.in);
		int tamanoDelArray = sc.nextInt();

		// El primer array hay que crearlo con numeros aleatorios
		Random random = new Random();
		int[] array1 = new int[tamanoDelArray];
		for (int i = 0; i < tamanoDelArray; i++) {
			array1[i] = random.nextInt(100) + 1; 
			//1.1 Aunque no lo pida el ejercicio hemos puesto que se generen numeros aleatorios entre 0 y 100,
			//1.2 El +1 al final es para que tambien cuente el 100.
		}

		
		// El segundo array es la copia del primero 
        int[] array2 = new int[tamanoDelArray];
        for (int i = 0; i < tamanoDelArray; i++) {
            array2[i] = array1[i];
        }
//	+++	// El segundo array es la copia del primero (Se puede hacer con .copyOf, que es mas facil) +++
//		int[] array2 = Arrays.copyOf(array1, tamanoDelArray);
        
        
        
		// El tercer array es para almacenar la multiplicación solo
		int[] array3 = new int[tamanoDelArray];

		// Llamamos al metodo(2.0) para que multiplique los arrays(array1 y array2) y almacene el resultado en el array3
		multiplicarArrays(array1, array2, array3);

		// Como ya esta hecho el array3 ya su pueden imprimir todos,
		// si no hubiese hecho el metodo "multiplicarArrays" al imprimir el Array3 daba 0 todo.
		System.out.println("Array1: " + Arrays.toString(array1));
		System.out.println("Array2: " + Arrays.toString(array2));
		System.out.println("Array3 (resultado de la multiplicacion Array1*Array2): " + Arrays.toString(array3));
	}

	
	// 2.0
	// 2.1 El metodo que hemos creado que multiplique los valores de los 2 arrays 
	// 2.2 y que quede almacenado en el tercer array
	public static int[] multiplicarArrays(int[] array1, int[] array2, int[] array3) {

		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i] * array2[i];
		}
		return array3;
		// 3.1 Este "return" es para que devuelva solo el tercer array, que es ya con el resultado de la multiplicación
		// 3.2 el resultado va a ser el mismo numero multiplicado por el mismo numero random que salgan de los 2 arrrays(array1[i] * array2[i])
		// 3.3 pero con esto se pueden hacer muchas cosas, en plan crear el array2 que sea otro y no sea una copia del array1 y sumas, o cosas asi.

	}

}
