package clases_dia;

import java.util.Arrays;
import java.util.Random;

public class clase_23_02_01_Arrays_random {

	public static void main(String[] args) {
	

		// Poner notas del 1 al 10 aleatorias a 29 alumnos.
		
		int [] notasClase =  new int[29];
		
		Random notasAleatorias = new Random();
		
		// Son lo mismo uno que otro, poner de esa manera para que cogan numeros del 1 al 10;
		//notasAleatorias.nextInt(10)+1;
		//notasAleatorias.nextInt(11);
		
		for (int nota = 0; nota < notasClase.length; nota++) {
			notasClase[nota] = notasAleatorias.nextInt(10)+1;
		}
		System.out.println(Arrays.toString(notasClase));
		
		// Otro for igual que el anterior, solo que hecho con la i.
/*
		for (int i = 0; i < notasClase.length; i++) {
			notasClase[i] = notasAleatorias.nextInt(10)+1;
		}
		System.out.println(Arrays.toString(notasClase));
*/
		
		int suspensos = 0;
		
		for (int nota: notasClase) {
			if (nota < 5)
				suspensos++;
		}
		System.out.println("Hay " + suspensos + " suspensos");
		
/*		// Otro for igual que el anterior, solo que hecho con la i.
		for (int i: notasClase) {
			if (i < 5)
				suspensos++;
		}
		System.out.println("Hay " + suspensos + " suspensos");
*/
		

/*		+++
 VER EL ARCHIVO alumnos y MainAlumnos del PROFESOR
 Es "package profesor.notas;" - archivo: "public class MainAlumnos"

		Alumno[] misAlumnos = new Alumno[29];
		String[] nombres = {"Pepe", "Maria", "Juan"}
		
		Random alumnosAleatorios = new Random();
		for (int i = 0; i < misAlumnos.lenght; i++) {
			int posicionNombres = alumnosAleatorios.nextInt();
			misAlumnos[i] = new Alumno(nombres[posicionNombres])
		}
		
		for (Alumno alumno: misAlumnos) {
			System.out.println(alumnos.getNombre);
		}
*/		
		
	}

}
