package UT5_Arrays1;

import java.util.Random;
import java.util.Scanner;

public class Clase10 {

	/* EJERCICIO 10
	No hay que hacerlo [Largo]
	
	Crea el juego hundir la flota para luchar contra la maquina.
	*/

	
	// Crear la clase Barco; Clase10Barco
	
	NO EJECUTAR, hace bucle infinito
	
	    // Constantes para el tamaño del tablero y el número de barcos
	    private static final int TAMANO_TABLERO = 10;
	    private static final int NUMERO_BARCOS = 5;

	    // Constantes para los símbolos del tablero
	    private static final char AGUA = '-';
	    private static final char BARCO = 'B';
	    private static final char TOCADO = 'X';
	    private static final char HUNDIDO = '*';

	    // Tableros para el usuario y la máquina
	    private static char[][] tableroUsuario = new char[TAMANO_TABLERO][TAMANO_TABLERO];
	    private static char[][] tableroMaquina = new char[TAMANO_TABLERO][TAMANO_TABLERO];

	    // Variables para el número de barcos hundidos
	    private static int barcosUsuarioHundidos = 0;
	    private static int barcosMaquinaHundidos = 0;

	    public static void main(String[] args) {
	        // Inicializar los tableros
	        inicializarTableros();

	        // Colocar los barcos de la máquina
	        colocarBarcosMaquina();

	        // Jugar hasta que todos los barcos estén hundidos
	        while (barcosUsuarioHundidos < NUMERO_BARCOS && barcosMaquinaHundidos < NUMERO_BARCOS) {
	            // Mostrar los tableros
	            mostrarTableros();

	            // Turno del usuario
	            turnoUsuario();

	            // Turno de la máquina
	            turnoMaquina();
	        }

	        // Mostrar el resultado del juego
	        if (barcosUsuarioHundidos == NUMERO_BARCOS) {
	            System.out.println("¡Has ganado!");
	        } else {
	            System.out.println("¡Has perdido!");
	        }
	    }

	    // Inicializar los tableros con agua
	    private static void inicializarTableros() {
	        for (int i = 0; i < TAMANO_TABLERO; i++) {
	            for (int j = 0; j < TAMANO_TABLERO; j++) {
	                tableroUsuario[i][j] = AGUA;
	                tableroMaquina[i][j] = AGUA;
	            }
	        }
	    }

	    // Colocar los barcos de la máquina aleatoriamente
	    private static void colocarBarcosMaquina() {
	        Random rand = new Random();
	        int barcosColocados = 0;

	        while (barcosColocados < NUMERO_BARCOS) {
	            int x = rand.nextInt(TAMANO_TABLERO);
	            int y = rand.nextInt(TAMANO_TABLERO);

	            if (tableroMaquina[x][y] == AGUA) {
	                tableroMaquina[x][y] = BARCO;
	                barcosColocados++;
	            }
	        }
	    }

	    // Mostrar los tableros
	    private static void mostrarTableros() {
	        System.out.println("Tablero del usuario:");
	        mostrarTablero(tableroUsuario);

	        System.out.println("Tablero de la máquina:");
	        mostrarTablero(tableroMaquina);
	    }

	    // Mostrar un tablero
	    private static void mostrarTablero(char[][] tablero) {
	        for (int i = 0; i < TAMANO_TABLERO; i++) {
	           

	        }
	    }
	
}
