package UT5_Arrays1;

import java.util.Scanner;

public class Clase5_Ahorcado1 {

	/* EJERCICIO 5
	 No hay que hacerlo [Largo]
	 
Vamos a crear el juego del ahorcado por consola.
Al inicio del programa, pedirá los nombres de los dos jugadores. El primer turno será para el
jugador 1.
Uno escribe una palabra y el otro la adivina, si este la adivina obtendrá un punto y escribirá
una palabra, sino lo acierta el jugador actual suma un punto y escribe de nuevo otra palabra.
Cuando el jugador inserte su palabra también deberá añadir una pequeña pista, por ejemplo
si la palabra es Madrid, la pista puede ser “Ciudad”.
El jugador que tenga que acertar la palabra tendrá seis oportunidades (cabeza, cuerpo,
brazos y piernas). No es necesario dibujar nada por pantalla, solo mostrar el número de
oportunidades restantes.
Deberá mostrarse los caracteres que el usuario inserta para esa palabra, para evitar que las
repita, en caso de que lo haga, avisarle y no contar como error.
Cada vez que acierte o no la palabra, deberá mostrar la puntuación de ambos. El primero
que llegue a 3 puntos gana.
Puedes usar todos los medios a tu alcance.
	 */

	
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("¡Bienvenido al juego del Ahorcado!");
		System.out.println("==================================");

		// Pedimos los nombres de los jugadores
		System.out.print("Jugador 1, introduce tu nombre: ");
		String jugador1 = scanner.nextLine();
		System.out.print("Jugador 2, introduce tu nombre: ");
		String jugador2 = scanner.nextLine();

		// Puntuaciones iniciales
		int puntuacionJugador1 = 0;
		int puntuacionJugador2 = 0;

		// Empezamos el juego
		boolean continuarJugando = true;
		while (continuarJugando) {
			// Turno del jugador 1
			System.out.println("==================================");
			System.out.println(jugador1 + ", es tu turno de escribir una palabra:");
			String palabra = scanner.nextLine().toLowerCase();

			// Pista de la palabra
			System.out.print("Introduce una pista para la palabra: ");
			String pista = scanner.nextLine();

			// Creamos un array con las letras de la palabra
			char[] letras = palabra.toCharArray();
			boolean[] letrasAdivinadas = new boolean[letras.length];

			// Turno del jugador 2
			System.out.println("==================================");
			System.out.println(jugador2 + ", es tu turno de adivinar la palabra.");
			int oportunidades = 6;
			boolean adivinada = false;
			String letrasAdivinadasStr = "";
			while (!adivinada && oportunidades > 0) {
				// Mostramos las letras adivinadas hasta ahora
				System.out.print("Palabra: ");
				for (int i = 0; i < letras.length; i++) {
					if (letrasAdivinadas[i]) {
						System.out.print(letras[i]);
						letrasAdivinadasStr += letras[i];
					} else {
						System.out.print("_ ");
					}
				}
				System.out.println();

				// Mostramos las letras que ya se han adivinado
				if (!letrasAdivinadasStr.equals("")) {
					System.out.print("Letras ya adivinadas: ");
					for (int i = 0; i < letrasAdivinadasStr.length(); i++) {
						System.out.print(letrasAdivinadasStr.charAt(i) + " ");
					}
					System.out.println();
				}

				// Mostramos las oportunidades restantes
				System.out.println("Oportunidades restantes: " + oportunidades);

				// Pedimos una letra al jugador 2
				System.out.print("Introduce una letra: ");
				char letra = scanner.nextLine().toLowerCase().charAt(0);

				// Comprobamos si la letra ya ha sido adivinada antes
				if (letrasAdivinadasStr.indexOf(letra) != -1) {
					System.out.println("¡Ya has adivinado esa letra antes!");
					continue;
				}

				// Comprobamos si la letra está en la palabra
				boolean letraAdivinada = false;
				for (int i = 0; i < letras.length; i++) {
					if (letras[i] == letra) {
						letraAdivinada = true;
						letrasAdivinadas[i] = true;
					}
				}

				// Actualizamos la cadena
// queda por hacer que resten los fallos y que diga cuando hemos ganado				
			}
		}
	}

}

// OTRO CODIGO:

/*
import java.util.*;

public class Ahorcado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenidos al juego del ahorcado!\n");
        
        // Pedimos los nombres de los jugadores
        System.out.print("Ingrese el nombre del jugador 1: ");
        String jugador1 = sc.nextLine();
        System.out.print("Ingrese el nombre del jugador 2: ");
        String jugador2 = sc.nextLine();
        System.out.println("\n¡Empecemos el juego!\n");
        
        int puntos1 = 0;
        int puntos2 = 0;
        String palabra;
        String pista;
        
        // El jugador 1 escribe la palabra y la pista
        System.out.print(jugador1 + ", escribe una palabra: ");
        palabra = sc.nextLine().toUpperCase();
        System.out.print("Escribe una pista para \"" + palabra + "\": ");
        pista = sc.nextLine();
        System.out.println("\n" + jugador2 + ", adivina la palabra: ");
        
        // Creamos una lista con las letras de la palabra
        List<Character> letras = new ArrayList<>();
        for (char c : palabra.toCharArray()) {
            letras.add(c);
        }
        
        // Creamos una lista para almacenar las letras adivinadas
        List<Character> adivinadas = new ArrayList<>();
        
        int intentos = 6;
        boolean acertado = false;
        
        while (intentos > 0 && !acertado) {
            // Mostramos las letras adivinadas y las que faltan por adivinar
            System.out.print("\nPalabra: ");
            for (char c : palabra.toCharArray()) {
                if (adivinadas.contains(c)) {
                    System.out.print(c + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println("\nOportunidades restantes: " + intentos);
            
            // Pedimos al jugador 2 que adivine una letra
            System.out.print("Adivina una letra: ");
            char letra = sc.nextLine().toUpperCase().charAt(0);
            
            // Comprobamos si la letra ya ha sido adivinada
            if (adivinadas.contains(letra)) {
                System.out.println("Ya has adivinado la letra " + letra + ", intenta con otra.");
                continue;
            }
            
            // Comprobamos si la letra está en la palabra
            if (letras.contains(letra)) {
                System.out.println("¡Acertaste!");
                adivinadas.add(letra);
            } else {
                System.out.println("¡Fallaste!");
                intentos--;
            }
            
            // Comprobamos si se ha adivinado la palabra completa
            if (adivinadas.containsAll(letras)) {
                acertado = true;
                puntos2++;
                System.out.println("\n¡Felicidades, " + jugador2 + "! Has adivinado la palabra \"" + palabra + "\" con la pista \"" + pista + "\".\n");
                System.out.println("Puntuación actual:\n" + jugador1 + ": " + puntos1 + "\n" + jugador2 + ": " + puntos2 + "\n");
                if (puntos2 == 3) {
                    System.out.println("¡Felicidades, " + jugador2 + "! ¡Has ganado el juego!");
                } else {
                    System
*/

