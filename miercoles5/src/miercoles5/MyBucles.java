package miercoles5;

import java.util.Scanner;

public class MyBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ESTRUCTURAS DE REPETICI�N: BUCLES
		
		/*no ejecutar* 
		while (true) {
			System.out.println("Hola mundo");
		}
		*/
		
		int a = 1;
		while(a <= 5) {
			System.out.println(a);
			a++; // a = a + 1 
		}
		
		// Bucles controlados por Centinela: "while"
		
		// no ejecutar, es un bucle infinito, ya que cero siempre va a ser menor de 10.
		/* int aa = 0;
		while (aa < 10) {
			System.out.println(aa);
		} 
		*/
		
		
		//ejercicio en el que ejecute infinitos que sean pares
		//IMPRIME TODOS LOS N�MEROS (sean par o impar)
		int b = 0;
		
		while (b <= 300) {
			//Otra manera: if (b <= 300 && b %2 == 0) //el % es que el m�dulo sea 0 para que sea par, para saberlo.
			if (b % 2 == 0) { // el % es el resto, es divisible por 2 (en este caso). Si ponemos %5 es m�ltipo de 5 y divisible de 5.
				System.out.println(b + ": Es par");
				b++;
			}
			else {
				System.out.println(b + ": Es impar");
				b++;
			}	
			

		}
		
//////////////////
		
		//IMPRIME LOS N�MEROS (solo par)
		int bb = 0;
			
		while (bb <= 100) {
				
			if (bb % 2 == 0){
				System.out.println(bb + " solo par");
			}
				
			bb++;
		}

//////////////////
		int x = 0;
		
		do {
			if (x % 5 == 0)
				System.out.println("Divisible por 5: " + x);
			x++;
			
		} while (x <= 100);
		
//////////////////
		
		int opcion = 0;
		int numero = -1;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Mi aplicaci�n chorra: ");
			System.out.println("1. Calcula si el n�mero es par");
			System.out.println("2. Calcula si el n�mero es divisible por 5");
			System.out.println("3. Sal de la aplicaci�n");
			opcion = scanner.nextInt();
			
			if (opcion == 1 || opcion == 2) {
			System.out.println("Introduce el n�mero a comprobar: ");
			numero = scanner.nextInt();
			
			switch (opcion) {
				case 1:
					if (numero % 2 == 0) {
					System.out.println("El numero: " + numero + ", es par");
					}
					else if (numero % 2 != 0) {
						System.out.println("El numero: " + numero + ", no es par");
					}
					break;
					
				case 2:
					if (numero % 5 == 0) {
					System.out.println("El numero: " + numero + ", es divisible por 5");
					}
					else if (numero % 5 != 0) {
						System.out.println("El numero: " + numero + ", no es divisible por 5");
					}			
					break;
					
				default:
					break;
			}
			
			} else if (opcion <1 || opcion > 3)
				System.err.println("Introduce una opci�n v�lida");
			
		} while (opcion != 3);
		System.out.println("Aplicaci�n terminada");
		//Mejorado, el que esta sin mejorar es el de abajo, siguientes lineas.
		
//////////////////

		
////////////////// Es el ejercicio de antes sin mejorar(lo mejore yo en casa, le puse:
				// ... los sysout: "El numero: " + numero + ", es par" de (numero + " es par") 
				// los if y else if
				// y demas.

/*		
int opcion = 0;
int numero = -1;

Scanner scanner = new Scanner(System.in);

do {
	System.out.println("Mi aplicaci�n chorra: ");
	System.out.println("1. Calcula si el n�mero es par");
	System.out.println("2. Calcula si el n�mero es divisible por 5");
	System.out.println("3. Sal de la aplicaci�n");
	opcion = scanner.nextInt();
	
	if (opcion == 1 || opcion == 2) {
	System.out.println("Introduce el n�mero a comprobar: ");
	numero = scanner.nextInt();
	
	switch (opcion) {
		case 1:
			System.out.println(numero % 2 == 0);
			break;
		case 2:
			System.out.println(numero % 5 == 0);
			break;
		default:
			break;
	}
	
	} else if (opcion <1 || opcion > 3)
		System.err.println("Introduce una opci�n v�lida");
	
} while (opcion != 3);
System.out.println("Aplicaci�n terminada");
//se puede mejorar
*/
		
//////////////////

	}

}
