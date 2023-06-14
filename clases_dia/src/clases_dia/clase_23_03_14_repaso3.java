package clases_dia;

import java.util.ArrayList;
import java.util.Random;

public class clase_23_03_14_repaso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EJERCICIO INVENTADO 3, con LinkedList y ArrayList
		
		ArrayList<Integer> misEnteros = new ArrayList<>();
		Random rnd = new Random();
		
		for (int i = 0; i < 3; i++) {
			misEnteros.add(rnd.nextInt(10)+1);
		}
		
		//int numero = misEnteros.get(0);
		int numero = -1; // puesto el -1 para no hacer el get de 0.
		boolean ordenada = true;
		
		for (int i = 1; i < misEnteros.size(); i++) {
			if (misEnteros.get(i) <= numero) {
			ordenada = false;
			break;
			}
			numero = misEnteros.get(i);
		}
		
		System.out.println(misEnteros);
		System.out.println(ordenada);
	}

}
