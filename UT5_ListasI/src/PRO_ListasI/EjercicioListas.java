package PRO_ListasI;

import java.util.ArrayList;
import java.util.LinkedList;
// import java.util.Arrays; // lo importee, pero no utilizado.
import java.util.List;
import java.util.Random;


public class EjercicioListas {

	// Ejercicio PRO_ListasI: 1 (HECHO con LinkedList)
	public static LinkedList<Integer> paresHasta(int numero) {
		LinkedList<Integer> listaPares = new LinkedList<>();
		for (int i = 0; i <= numero; i=i+2) { 	// El i=i+2 tambien se puede poner: i += 2
			listaPares.add(i);
		}
		return listaPares;
	}
/*	// Ejercicio PRO_ListasI: 1 (HECHO con List de array, tambien funciona).
	public static List<Integer> paresHasta(int numero) {
		List<Integer> listaPares = new ArrayList<>();
		for (int i = 0; i <= numero; i=i+2) { 	// El i=i+2 tambien se puede poner: i += 2
			listaPares.add(i);
		}
		return listaPares;
	}
*/
	
	// Ejercicio PRO_ListasI: 2
	public static List<Integer> sumarTres(int[] array) {
		List<Integer> listaSumarTres = new ArrayList<>();
		for (int elemento : array) {
			listaSumarTres.add(elemento + 3);
		}
		return listaSumarTres;
	}
/*	// Ejercicio PRO_ListasI: 2.1 (En vez de sumar 3, que multiplique por tres)
	public static List<Integer> porTres(int[] array) {
		List<Integer> porTres = new ArrayList<>();
		for (int elemento : array) {
			porTres.add(elemento + 3);
		}
		return porTres;
	}
*/
	
	
	// Ejercicio PRO_ListasI: 3
	public static List<Integer> imparesArray(int[] array) {
		List<Integer> listaImpares = new ArrayList<>();
		for (int i = 1; i < array.length; i=i+2) {
			listaImpares.add(array[i]);
		}
		return listaImpares;
	}

	// Ejercicio PRO_ListasI: 4
	public static int[] listaAArray(List<Integer> lista) {
		int[] array = new int[lista.size()];
		for (int i = 0; i < lista.size(); i++) {
			array[i] = lista.get(i);
		}
		return array;
	}

	// Ejercicio PRO_ListasI: 5
	public static boolean buscarNumeroEnArray(int[] array, int numero) {
		for (int elemento : array) {
			if (elemento == numero) {
				return true;
			}
		}
		return false;
	}

	// Ejercicio PRO_ListasI: 6
	public static boolean buscarStringEnLista(List<String> lista, String string) {
		return lista.contains(string);
	}

	// Ejercicio PRO_ListasI: 7
	public static int mayor(List<Integer> lista) {
		int mayor = lista.get(0);
		for (int i = 1; i < lista.size(); i++) {
			if (lista.get(i) > mayor) {
				mayor = lista.get(i);
			}
		}
		return mayor;
	}

	// Ejercicio PRO_ListasI: 8
	public static int posicionMayorDelArray(int[] array) {
		int mayor = array[0];
		int posicion = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > mayor) {
				mayor = array[i];
				posicion = i;
			}
		}
		return posicion;
	}
/* NO hace falta este creado (array4), con el "public static int posicionMayorDelArray(int[] array) {" es valido.
	public static int posicionMayorDelArray(int[] array4) {
		return 0;
	} 
*/
	
	
	// ++++++++++++++++++++++++++++
	// Ejercicio PRO_ListasI: 9 +++
	public static int mayorDeLosNumerosAleatorios(List<Integer> lista) {
		int mayorDeLosNumerosAleatorios = lista.get(0);
		for (int i = 1; i < lista.size(); i++) {
			if (lista.get(i) > mayorDeLosNumerosAleatorios) {
				mayorDeLosNumerosAleatorios = lista.get(i);
			}
		}
		return mayorDeLosNumerosAleatorios;
	}

	public static List<Integer> numerosAleatoriosYValorMaximo(int cantidad, int valorMaximo) {
		List<Integer> listaAleatorios = new ArrayList<>();
		Random numerosRandom = new Random();
		for (int i = 0; i < cantidad; i++) {
			listaAleatorios.add(numerosRandom.nextInt(valorMaximo) + 1);
		}
		return listaAleatorios;
	}
	
	// fin ejercicio PRO_ListasI: 9
	// ++++++++++++++++++++++++++++
	
/*	
	// Ejercicio PRO_ListasI: 9.1 método cantidadDeNumerosAleatorios / crearListaAleatoriaYMaximo
	 * Esta manera sale bien, pero la otra("Ejercicio PRO_ListasI: 9 +++") nos permite definir cuantos numeros queremos que nos de, meterlo en listas y mostrarlos.

	public static int mayorDeLosNumerosAleatorios(List<Integer> lista) {
		int mayorDeLosNumerosAleatorios = lista.get(0);
		for (int i = 1; i < lista.size(); i++) {
			if (lista.get(i) > mayorDeLosNumerosAleatorios) {
				mayorDeLosNumerosAleatorios = lista.get(i);
			}
		}
		return mayorDeLosNumerosAleatorios;
	}

	public static int numerosAleatorios(int numero) {
		List<Integer> listaAleatorios = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < numero; i++) {
			listaAleatorios.add(random.nextInt(100) + 1); //puesto 100 como numero maximo. el +1 es para que coja 100 y no 99.
		}
		return mayorDeLosNumerosAleatorios(listaAleatorios);
	}
	// el return "return mayorDeLosNumerosAleatorios(listaAleatorios);" devuelve el metodo "public static int mayorDeLosNumerosAleatorios".
	// fin ejercicio PRO_ListasI: 9.1
*/	
	
	
	// Ejercicio PRO_ListasI: 10
	public static boolean esPrimo(int numero) {
		if (numero < 2) {
			return false;
		}
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static List<Integer> numerosPrimosHasta(int numero) {
		List<Integer> listaPrimos = new ArrayList<>();
		for (int i = 1; i <= numero; i++) {
			if (esPrimo(i)) {
				listaPrimos.add(i);
			}
		}
		return listaPrimos;
	}
	// Fin del ejercicio PRO_ListasI: 10.

	
	


}
