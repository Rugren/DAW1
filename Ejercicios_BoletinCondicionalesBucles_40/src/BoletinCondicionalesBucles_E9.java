import java.util.Scanner;

public class BoletinCondicionalesBucles_E9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0;
		int numero = 0;
		int numero1 = 0;
		
		final float numeroPi = 3.14f;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Elige una opcion:\n 1=Suma\n 2=Resta\n 3=Multiplicacion\n 4=Division\n 5=Potencia\n 6=Raiz Cuadrada\n 7=Calculo del area de un circulo\n 8=Calculo longitud de una circunferencia\n 9=Salir\n");

			opcion = scanner.nextInt();
			
			if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5 
				|| opcion == 6 || opcion == 7 || opcion == 8) {
				
		/*	Quitado esto:
		  	System.out.println("Introduce un numero para calcular: ");
			numero = scanner.nextInt();
			
			y metido dentro de cada uno, igualmente salia bien con los casos del 1 al case 4 si lo dejaba aqui y no los ponia dentro de cada case al principio las 2 lineas de codigo.
		 * 		
		 */
			
			switch (opcion) {
				case 1:
					System.out.println("Introduce un numero para calcular: ");
					numero = scanner.nextInt();
					
					System.out.println("Introduce un numero para sumar: ");
					numero1 = scanner.nextInt();
					int sumatorio = numero + numero1;
					System.out.println("Este es el sumatorio: " + sumatorio + "\n");
					break;
					
				case 2:
					System.out.println("Introduce un numero para calcular: ");
					numero = scanner.nextInt();
					
					System.out.println("Introduce un numero para restar: ");
					numero1 = scanner.nextInt();
					int resta = numero - numero1;
					System.out.println("Esta es la resta: " + resta + "\n");
					break;
					
				case 3:
					System.out.println("Introduce un numero para calcular: ");
					numero = scanner.nextInt();
					
					System.out.println("Introduce un numero para multiplicar: ");
					numero1 = scanner.nextInt();
					int multiplicacion = numero * numero1;
					System.out.println("Esta es la multiplicacion: " + multiplicacion + "\n");
					break;
					
				case 4:
					System.out.println("Introduce un numero para calcular: ");
					numero = scanner.nextInt();
					
					System.out.println("Introduce un numero para dividir: ");
					numero1 = scanner.nextInt();
					int division = numero / numero1;
					System.out.println("Esta es la division: " + division + "\n");
					break;
					
				case 5:
					System.out.println("Introduce una base para calcular: ");
					numero = scanner.nextInt();
					
					System.out.println("Introduce el exponente: ");
					numero1 = scanner.nextInt();

					int base = numero;
					int exponente = numero1; //el exponente es el "elevado a".
					int potencia = base; // 2^5 = 32 ( por poner un ejemplo )
					
					for (int i = 0; i < exponente-1; i++) { //importante poner el -1.
							potencia = potencia * base;
						}

					System.out.println("Este es el resultado de la potencia: " + potencia + "\n");
					//Otra manera de hacerlo es con el math.pow
					// System.out.println("Esta es el resultado de la potencia: " + Math.pow(base, exponente) + "\n");
					break;
					
				case 6:
					System.out.println("Introduce un numero para calcular su raiz cuadrada: ");
					numero = scanner.nextInt();
					
					System.out.println("La raiz cuadrada es: " + Math.sqrt(numero) + "\n");
					break;
		
				case 7: 					
					System.out.println("Introduce el radio del circulo: ");
					numero = scanner.nextInt();
					
					// el numero pi puesto al principio: numeroPi
					float radioAlCuadrado = numero * numero;
					
					float areaCirculo = numeroPi * radioAlCuadrado;
					System.out.println("Este es el area del circulo: " + areaCirculo + "\n");
					break;
							
				case 8:
					System.out.println("Introduce el diametro de la circunferencia: ");
					numero = scanner.nextInt();
					
					float diametroCirculo = numero;
					float longitudCircunferencia = numeroPi * diametroCirculo;
					System.out.println("Esta es la longitud de la circunferencia: " + longitudCircunferencia + "\n");
					break;
					
				default:
					break;
			}
			
			} else if (opcion <1 || opcion > 9)
				System.err.println("Introduce una opcion valida");
			
		} while (opcion != 9);
		System.out.println("Has salido de la aplicación");
		
	}

}
		
		


