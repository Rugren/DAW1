import java.util.Scanner;

public class E5_A6_Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Introduzca numeros, finaliza el programa cuando escribas -1");
		Scanner sc = new Scanner(System.in);
		
		int mayor = -99999; // +++(LEER para comprender)podriamos poner -99999, pero como el ejercicio dice -1, al poner -99999 es por si el usuario mete -50000 p.ejemplo, que no se nos salga del bucle.		
		int menor = 99999;
		int sumaPositivosYNegativos = 0;
		int sumaPositivos = 0;
		int sumaNegativos = 0;
		float media = 0;
		int contador = 0;
		
		int numero = 0;
		
		while (true) { //para que numero sea distinto de 0. "(numero != -1)".
			numero = sc.nextInt();
			
			if (numero == -1)
				break;
			
			else {
				
				if (numero > mayor) {
					mayor = numero;
					
			
					sumaPositivosYNegativos = sumaPositivos + sumaNegativos;
				}
				
				if (numero < menor) {
					menor = numero;
					sumaPositivosYNegativos = sumaPositivos + sumaNegativos;
				}
				
				if (numero * -1 >= 0) {
					sumaNegativos = sumaNegativos + numero;
					sumaPositivosYNegativos = sumaPositivos + sumaNegativos;
				}
				
				if (numero * -1 <= 0) {
					sumaPositivos = sumaPositivos + numero;
					sumaPositivosYNegativos = sumaPositivos + sumaNegativos;
				}
			}
					
			
			contador++;
			media = sumaPositivosYNegativos/contador;
			}
			
			System.out.println("Numero mayor: " + mayor);
			System.out.println("Numero menor: " + menor);
			System.out.println("Suma de positivos y negativos: " + sumaPositivosYNegativos);
			System.out.println("Suma de positivos: " + sumaPositivos);
			System.out.println("Suma de negativos: " + sumaNegativos);
			System.out.println("Media de todos los numeros: " + media);
			
			sc.close();
		

		
	}

}
