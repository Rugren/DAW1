package miercoles5;

import java.util.Scanner;

public class ejercicios24octubre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ejercicio 1: Asigna 1 a una variable "x" si otra variable "y" es positiva, si no, asignale 0... (Ver vídeo 4_condicionales min 25, diapositiva 16, no resubida al PDF)
		int xx = 1;
		int yy = 5;
		int valorXX = (yy >= 0) ? (xx=1) : (xx=0);
		System.out.println(valorXX);
		
		// Otra manera de hacerlo; Mejor manera de hacerlo: (aunque parezca más sencilla la primera, hacer de esta, porque usaremos el if y el else más a menudo
		int y = -1;
		int x;
		if (y >= 0 ) {
			x = 1;
		}
		
		else {
			x = 0;
		}
		
		System.out.println(x);
		
		// Otra manera de hacerlo, igual que la anterior 
		/*int yyy = -1;
		int xxx;
		if (yyy = 0 ) {
			xxx = 1;
		}
		else if ( yyy == 0) {
			xxx = -1;
		}
		else {
			xxx = 0;
		}
				
				System.out.println(xxx);
		FALLABA ALGO del yyy, pero se hace as� tambi�n.
				*/
		
		// MEJOR MANERA DE HACER EL EJERCICIO 1.
		int y2 = 0;
		int x2 = (y2 >= 0) ? 1 : 0;
		System.out.println(x2);
		
		
		
		// Ejercicio 2: 
		
		double score = 81;
		if (score >= 80 && score <=90) {
			score = score +5;
		
			//se puede poner sin el "else", porque no hace nada.
		}
		else { 
			score = score + 0;
		}
		System.out.println(score);

		
		// Ejercicio 3: 
		int variableValor = 4;
		String queSera = (variableValor %2 == 0 && variableValor >=0 ) ? "Es positivo y Par" : "No es positivo, ni par";
		System.out.println(queSera);
		
		// Ejercicio 4: Calcula el valor absoluto de un número
		int calcularAbsoluto = -5;
		if (calcularAbsoluto < 0) {
			calcularAbsoluto = calcularAbsoluto * -1;
			System.out.println("El valor absoluto es: " + calcularAbsoluto);
		}
		else {
			calcularAbsoluto = calcularAbsoluto;
			System.out.println("El valor absoluto es el mismo");
		}
			
		
		//int valorAbsoluto = (calcularAbsoluto  <= 0 ) ? : calcularAbsoluto *-1;
		//System.out.println(valorAbsoluto);
		
		
		// Ejercicio 5:  Comprueba que el valor de dos variables "x" e "y" se diferencie en menos de 10
		// por no repetir x e y, hemos puesto d 32 y f 45. El profesor acaba haciendo "distanciaEntrePersonajes".
	/*	int d = 32;
		int f = 45;
		int distanciaEntreDyF = (d - f);
		
		if (distanciaEntreDyF <= 10 ) {
			System.out.println("se tocan, menos de 10");
		}
		else {
			System.out.println("no se tocan, más de 10");
			
		}
	*/
		int miPosicion = 20;
		int posicion = 45;
		int distanciaEntrePersonajes = (miPosicion - posicion);
		
		if (distanciaEntrePersonajes <= 10 ) {
			System.out.println("Pum! Pum!");
		}
		else {
			System.out.println("Todo está tranquilo");
		}
		
		
		
		// Ejercicio 6: Escribe un programa que pida al usuario un número entre 1 y 7 y, según dicho número nos diga qué día de la semana corresponde a dicho número
		
		System.out.println("Introduce un n�mero entre 1 y 7: ");
		
		Scanner scanner = new Scanner(System.in);
		int miNumero = scanner.nextInt();
		
		switch (miNumero) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Mi�rcoles");
				break;
			default:
				System.out.println("Qu� rollo, no nos toca programación!");
				break;
		}
		
		scanner.close();
		
		
	}

}
