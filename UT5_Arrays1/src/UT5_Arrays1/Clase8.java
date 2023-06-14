package UT5_Arrays1;

import java.util.Scanner;

public class Clase8 {
	
	/* EJERCICIO 8
Calcula la letra de un DNI, pediremos el DNI por teclado y nos devolvera el DNI completo.
Para calcular la letra, cogeremos el resto de dividir nuestro dni entre 23, el resultado debe
estar entre 0 y 22. 

Haz un metodo donde segun el resultado de la anterior formula busque
en un array de caracteres la posicion que corresponda a la letra. 

Esta es la tabla de
caracteres:

POSICION LETRA
0 T
1 R
2 W
3 A
4 G
5 M
6 Y
7 F
8 P
9 D
10 X
11 B
12 N
13 J
14 Z
15 S
16 Q
17 V
18 H
19 L
20 C
21 K
22 E

*Ejercicio Para calcular letra DNI / Calcular letra del DNI / CalcularLetraDNI
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce tu numero de DNI (sin la letra): \n");
// 1.1	el \n es como si pusieramos debajo un "System.out.println();" vacio, asi como este.
// 1.2	para poder escribir debajo en el Syso, y no al lado.		
		
		
		int dni = sc.nextInt();
		
		char letraDNI = calcularLetraDNI(dni);
		String dniCompleto = dni + "" + letraDNI; 	// 1.1 poniendo las 2 comillas juntas(+ "" +) 
													// 1.2 se puede convertir el int y el char en un String. +++
		
		System.out.println("- Tu letra del DNI es: " + letraDNI);
		System.out.println("- El DNI completo es: " + dniCompleto);
	}

	// El constructor de la letra DNI para averiguarla
	public static char calcularLetraDNI(int dni) {
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 
				'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E'};
		int resto = dni % 23; // El resto del DNI es que para calcularlo se divide entre 23.

		return letras[resto];
	}

}
