package examen;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lista de números. Los que tiene que acertar el usuario cuando escriba por el
		// escaner:

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		// para que el usuario que adivine el numero o los numeros de nuestra lista, poner los que queramos, el ejercicio no especifica.		
		numeros.add(9);
		numeros.add(6);
		numeros.add(7);

		// por si quiero meter mas y hacerlo mas entretenido
//		numeros.add(2);
//		numeros.add(5);
//		numeros.add(3);
// tambien se podria hacer un array, rollo [4, 5, 9], pero como lo he hecho mejor, porque anado numeros a la lista directamente.

		
		Scanner usuarioEligiendoNumero = new Scanner(System.in);

// luego hacer que termine cuando adivine todos los numeros y se hayan borrado al ir acertando.

// mientras no esten todos los numeros acertados, es decir, mientras "numeros" sea distinto de vacio que siga recorriendo.
		while (!numeros.isEmpty()) { 
			// --numeros.isEmpty(2) probando, no hacer caso a esta linea

			System.out.print("Adivina un numero de los 3 a acertar (del 1 al 10): ");

			int numero = usuarioEligiendoNumero.nextInt();

			if (numeros.contains(numero)) {
				System.out.println("+ES CORRECTO. El numero " + numero + " esta en la lista de numeros a acertar.");

				while (numeros.contains(numero)) {
					numeros.remove((Integer) numero);
				}
			}
			
			else {
				System.out.println("-FALLASTE. El numero " + numero + " no esta en la lista de numeros a acertar.");
			}

		}

		System.out.println("ENHORABUENA! Has acertado todos los numeros.");

	}

}
