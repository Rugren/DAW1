package PRO_ListasI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainEjercicioListas {

	public static void main(String[] args) {
		
		// Ejercicio PRO_ListasI: 1 (uso del método paresHasta) (HECHO con LinkedList).
		LinkedList<Integer> listaPares = EjercicioListas.paresHasta(25);
		System.out.println("Ejercicio 1 - Lista de pares hasta 10: " + listaPares);

		/* // Ejercicio PRO_ListasI: 1 (uso del método paresHasta) (HECHO con List de array, tambien funciona). 
		 List<Integer> listaPares = EjercicioListas.paresHasta(10);
		 System.out.println("Lista de pares hasta 10: " + listaPares);
		*/
		
		// Ejercicio PRO_ListasI: 2 (método sumarTres)
		int[] array1 = { 1, 2, 3, 4, 5 };
		List<Integer> listaSumadosLos3 = EjercicioListas.sumarTres(array1);
		System.out.println("Ejercicio 2 - Lista sumada: " + listaSumadosLos3);

		// Ejercicio PRO_ListasI: 3 método imparesArray
		int[] array2 = { 1, 2, 3, 4, 5 };
		List<Integer> listaImpares = EjercicioListas.imparesArray(array2);
		System.out.println("Ejercicio 3 - Lista de impares: " + listaImpares);

		// Ejercicio PRO_ListasI: 4 listaAArray
		List<Integer> listaNumeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		int[] arrayNumeros = EjercicioListas.listaAArray(listaNumeros);
		System.out.println("Ejercicio 4 - Array de numeros: " + Arrays.toString(arrayNumeros));

		// ++ Ejercicio PRO_ListasI: 5 método buscarNumeroEnArray
		int[] array3 = { 1, 2, 3, 4, 5 };
		int numeroBuscado = 3;
		boolean encontrado = EjercicioListas.buscarNumeroEnArray(array3, numeroBuscado);
		System.out.println("Ejercicio 5 - El numero " + numeroBuscado + " se encuentra en el array? " + encontrado);

		// ++ Ejercicio PRO_ListasI: 6 método buscarStringEnLista
		List<String> listaPalabras = new ArrayList<>(Arrays.asList("Ruben", "Manu", "David", "Miguel", "Pablo", "Mikel"));
		String palabraBuscada = "Ruben";
		boolean encontrada = EjercicioListas.buscarStringEnLista(listaPalabras, palabraBuscada);
		System.out.println("Ejercicio 6.0 - La palabra " + palabraBuscada + " se encuentra en la lista? " + encontrada);
		
		System.out.println("Ejercicio 6.1 - Total de palabra en la lista a buscar: " + listaPalabras.size());
		// este syso de Ejercicio 6.1 no lo pide el ejercicio, pero anadido yo para probar.
		
		System.out.println("Ejercicio 6.2 - Esta la palabra en nuestra lista? " + listaPalabras.contains("Manu"));
		// 1.1 El syso "Ejercicio 6.2..." que contiene la funcion ".contains("Manu")" y entre parentesis lo que queramos buscar.
		// 1.2 .contains() hace lo mismo que un boolean.

		// Ejercicio PRO_ListasI: 7 método mayor
		List<Integer> listaNumeros2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		int numeroMaximo = EjercicioListas.mayor(listaNumeros2);
		System.out.println("Ejercicio 7 - El numero maximo de la lista es: " + numeroMaximo);

		// Ejercicio PRO_ListasI: 8 método posicionMayorDelArray
		int[] array4 = { 1, 3, 8, 2, 5 };
		int posicionMaxima = EjercicioListas.posicionMayorDelArray(array4);
		System.out.println("Ejercicio 8 - La posicion del numero maximo en el array es: " + posicionMaxima);
		// 1.1 La posicion maxima seria 2, porque contaria la poscion como numero 1
		// 1.2 0=1 / 1=3 / 2=8 / 3=2 /4=5 el 8 estaria en la posicion 2 y es el numero maximo...



		// Ejercicio PRO_ListasI: 9 método numerosAleatoriosYValorMaximo / antes llamado: numerosAleatorios
		int valorMaximoAleatorios = 100; // 100 numeros aleatorios, nosotros ponemos ahi los numeros que queramos aleatorios de maximo
		int cantidadDeNumerosAleatorios = 5;
		
		List<Integer> listaNumerosAleatorios = EjercicioListas.numerosAleatoriosYValorMaximo(cantidadDeNumerosAleatorios, valorMaximoAleatorios);
		
		int numeroMaximo2 = EjercicioListas.mayorDeLosNumerosAleatorios(listaNumerosAleatorios);
		
		System.out.println("Ejercicio 9.0  - Lista numeros aleatorios: " + listaNumerosAleatorios + ". (Cuyo valor maximo de numeros aleatorios es: " + valorMaximoAleatorios + ")");
		System.out.println("Ejercicio 9.1+ - El numero maximo de esta lista aleatoria de ( " + cantidadDeNumerosAleatorios + " ) numeros es: " + numeroMaximo2);
		
/*		// Ejercicio PRO_ListasI: 9.1 método cantidadDeNumerosAleatorios
 * 		Esta manera sale bien, pero la otra("Ejercicio PRO_ListasI: 9 +++") nos permite definir cuantos numeros queremos que nos de, meterlo en listas y mostrarlos.

		int cantidadDeNumerosAleatorios = 5;
		int numeroMaximo2 = EjercicioListas.numerosAleatorios(cantidadDeNumerosAleatorios);
		System.out.println("Ejercicio 9 - El numero maximo de la lista aleatoria es: " + numeroMaximo2);
*/

		
		// Ejercicio PRO_ListasI: 10 método numerosPrimosHasta
		List<Integer> listaPrimos = EjercicioListas.numerosPrimosHasta(20);
		System.out.println("Ejercicio 10 - Lista de numeros primos hasta: " + listaPrimos);

	}

}
