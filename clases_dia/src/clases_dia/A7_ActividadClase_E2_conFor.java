package clases_dia;


import java.util.Scanner;

public class A7_ActividadClase_E2_conFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ejercicio 2 (clase d�a 15/11/22)
//		Pide al usuario por teclado que introduzca dos n�meros, imprime todos los
//		n�meros entre ambos (imprimiendo ambos tambi�n). Haz este proceso usando
//		un bucle que pida n�meros hasta que alguno de los dos sea �1.

		// Hecho con For. Est� bien.
	
		System.out.println("Introduce dos numeros: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int mayor;
		int menor;
		
		if (x >= y) {
			mayor = x; //esto es un intercambio simple de variables.
			menor = y;
		}
		else {
			mayor = y;
			menor = x;
		}
		
		//ahora hacer un bucle que recorra del menor al mayor, con un for:
		for (int num = menor; num <= mayor; num++) {
			System.out.println(num);
		}

	
		
		
	}

}
