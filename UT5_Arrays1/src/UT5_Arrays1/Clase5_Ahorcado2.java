package UT5_Arrays1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clase5_Ahorcado2 {
	

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
	                	
	        // CONTINUAMOS EL CODIGO:
	                	
	                    // El jugador 2 escribe la palabra y la pista
	                    System.out.print(jugador2 + ", escribe una palabra: ");
	                    palabra = sc.nextLine().toUpperCase();
	                    System.out.print("Escribe una pista para \"" + palabra + "\": ");
	                    pista = sc.nextLine();
	                    System.out.println("\n" + jugador1 + ", adivina la palabra: ");
	                    
	                    // Creamos una lista con las letras de la palabra
	                    letras.clear();
	                    for (char c : palabra.toCharArray()) {
	                        letras.add(c);
	                    }
	                    
	                    // Limpiamos la lista de letras adivinadas
	                    adivinadas.clear();
	                    
	                    // Reiniciamos el número de oportunidades
	                    intentos = 6;
	                    
	                    continue;
	                }
	            }
	        }
	        
	        // Si no se ha acertado la palabra, se suma un punto al jugador 1
	        if (!acertado) {
	            puntos1++;
	            System.out.println("\n¡Lo siento, " + jugador2 + ". No has adivinado la palabra \"" + palabra + "\" con la pista \"" + pista + "\".\n");
	            System.out.println("Puntuación actual:\n" + jugador1 + ": " + puntos1 + "\n" + jugador2 + ": " + puntos2 + "\n");
	            if (puntos1 == 3) {
	                System.out.println("¡Felicidades, " + jugador1 + "! ¡Has ganado el juego!");
	            } else {
	                // El jugador 2 escribe una nueva palabra y pista
	                System.out.print(jugador2 + ", escribe una palabra: ");
	                palabra = sc.nextLine().toUpperCase();
	                System.out.print("Escribe una pista para \"" + palabra + "\": ");
	                pista = sc.nextLine();
	                System.out.println("\n" + jugador1 + ", adivina la palabra: ");
	                
	                // Creamos una lista con las letras de la palabra
	                letras.clear();
	                for (char c : palabra.toCharArray()) {
	                    letras.add(c);
	                }
	                
	                // Limpiamos la lista de letras adivinadas
	                adivinadas.clear();
	                
	                // Reiniciamos el número de oportunidades
	                intentos = 6;
	                
	                // El juego sigue
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
	                    
	                    // Pedimos al jugador 1 que adivine una letra
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
	                    
	                    // Comprobamos si

	                	
	                }
	            }
	        }
	    }


}
