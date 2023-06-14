package clases_dia;

import java.util.Scanner;

public class A7_ActividadClase_E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ejercicio 1 (clase d�a 15/11/22)
		// Posici�n par, fila impar (11). A1 con for.
// Ejercicio: Utiliza dos contadores para almacenar en uno de ellos la suma de todos
//	los n�meros pares y en el otro de los n�meros impares desde el n�mero 1 hasta
//	un n�mero introducido por el usuario. Imprime el mayor de ambos.



		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
	
		int numUsuario = sc.nextInt();
		int limite = sc.nextInt();
		
		int sumaPares = 0;
		int sumaImpares = 0;
		
		for (int numero = 1; numero <= limite; numero++) { // se pone 1 porque el ejercicio nos dice que va desde el 1 hasta un numero introducido por el usuario.
		// int i o int numero, da igual, es algo que se nombra por poner;
			// for (int i = 1; i <= limite; i++);
			if(numero % 2 == 0) //dentro del BUCLE FOR, preguntamos, if...
				sumaPares = sumaPares + numero;
			else
				sumaImpares = sumaImpares + numero;
		}
		if (sumaPares > sumaImpares) 
			System.out.println(sumaPares);
		else
				System.out.println(sumaImpares);


		
		// MISMO EJERCICIO CON WHILE:
/* Sale mal.		
		Scanner sc = new Scanner(System.in);
		
		int numUsuario = sc.nextInt();
		System.out.println("Introduce un numero: ");
		int limite = sc.nextInt();
		
		int sumaPares = 0;
		int sumaImpares = 0;
		
		while (numero <= limite) {
			if(numero % 2 == 0)
				sumaPares = sumaPares + numero;
			else
				sumaImpares = SumaImpares + numero;
			numero++;
		}
		if (sumaPares > sumaImpares); 
			System.out.println(SumaPares);
		else
				System.out.println(sumaImpares);
*/
		

	}

}
