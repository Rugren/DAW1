package clases_dia;

import java.util.Arrays;
import java.util.LinkedList;

public class clase_23_01_25_Array_Arrays_Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*mal
		// a [0]
		
		int a = 14579;
		boolean hayPar = false;
		
		for (int i = 0; i  < a.length; i++) 
			if (a [i]) % 2 == 0 )
			hayPar = true;
*/
		
/*mal		
		a [i] = false;
		boolean[] mapaTesoro = new boolean[5]
*/		
		
/*		
		boolean b = false;
		System.out.println(b);
*/
		
		
		// Una manera de hacerlo
		int [] miArrayEnteros = new int[5];
		
		// Otra forma de hacerlo
		int [] miArrayEnteros2 = {1, 2, 3, 4, 5};
		int [] miArrayEnteros3 = {2, 4, 3, 4, 5};
		
		System.out.println(miArrayEnteros);
		System.out.println(Arrays.toString(miArrayEnteros));
		System.out.println(Arrays.toString(miArrayEnteros2));
		
		
		LinkedList<String> listaStrings = new LinkedList<>();
		
		System.out.println(listaStrings);
		listaStrings.add("Paco");
		listaStrings.add("Gallego");
		System.out.println(listaStrings);
		listaStrings.add("48703997W");
		System.out.println(listaStrings);
		
		// Con el 1 en .remove quita "Gallego", ya que el 0 es Paco, el 1 es Gallego y el 2 es 48703997W.
		listaStrings.remove(1);
		System.out.println(listaStrings);
		
		// el .clear borra todo.
	//	listaStrings.clear();
	//	System.out.println(listaStrings);
		
		
		
		
		
		

	}

}
