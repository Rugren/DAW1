package UT5_Arrays1;

import java.util.Scanner;

public class Clase1_segundoIntento {
	

	    public enum Resultado {
	        SUSPENSO, BIEN, NOTABLE, SOBRESALIENTE;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double[] notas = new double[10];
	        String[] nombres = new String[10];

	        // Rellenar el array de notas y nombres
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Introduce el nombre del alumno " + (i + 1) + ": ");
	            nombres[i] = scanner.nextLine();

	            double nota;
	            do {
	                System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
	                nota = scanner.nextDouble();
	                scanner.nextLine(); // Consumir la línea vacía después de la nota
	            } while (nota < 0 || nota > 10);
	            notas[i] = nota;
	        }

	        // Crear el array de resultados
	        Resultado[] resultados = new Resultado[10];
	        for (int i = 0; i < 10; i++) {
	            double nota = notas[i];
	            if (nota < 5) {
	                resultados[i] = Resultado.SUSPENSO;
	            } else if (nota < 7) {
	                resultados[i] = Resultado.BIEN;
	            } else if (nota < 9) {
	                resultados[i] = Resultado.NOTABLE;
	            } else {
	                resultados[i] = Resultado.SOBRESALIENTE;
	            }
	        }

	        // Mostrar los resultados
	        for (int i = 0; i < 10; i++) {
	            System.out.println(nombres[i] + " ha sacado un " + notas[i] + " (" + resultados[i] + ")");
	        }
	    }

}
