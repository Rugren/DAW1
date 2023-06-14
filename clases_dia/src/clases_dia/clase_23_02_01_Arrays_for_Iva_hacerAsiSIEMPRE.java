package clases_dia;

import java.util.Arrays;

public class clase_23_02_01_Arrays_for_Iva_hacerAsiSIEMPRE {

	public static void main(String[] args) {
	
		
		//int [] numACalcular = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			// asi no poner, puesto que si son 200 numeros, no vas a poner del 1 al 200,
			// poner todos de golpe como el siguiente hecho: el del "int [] numACalcular = new int [10];" y luego el for "for (int i = 0; i <..." ESTA PERFECTO.
		
		// +++ ASI PERFECTO, HACER SIEMPRE ASI, COMO ESTE EJEMPLO 
			// para hacer Arrays y con el For de manera perfecta.
		//	coge numeros del 1 al 10 y luego el for para que los recorra.+++
		int [] numACalcular = new int [10];
		for (int i = 0; i < numACalcular.length; i++) 
			numACalcular[i] = i +1;
	

		float [] numerosMasIva = new float [10];
		
		for (int i = 0; i < numACalcular.length; i++) {
			numerosMasIva[i] = numACalcular[i] + numACalcular[i] * 0.21f;
		//	numerosMasIva[i] = numACalcular[i] * 1.21f; // es lo mismo que el anterior, lo multiplicas por 1,21 ; en lugar de sumarlo al anterior.
		}

		System.out.println("Estos son los numACalcular + IVA: " + Arrays.toString(numerosMasIva));

	}

}
