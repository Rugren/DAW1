import java.util.Scanner;

public class E8_A6_Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* 
Tenemos un videojuego en el que nuestro personaje se coloca en una posición
de un tablero (posición x e y) y se puede mover a una dirección, pudiendo
elegir cuántas casillas se mueve en cada acción.
Pide por teclado que el usuario introduzca una dirección (“Arriba”, “Abajo”,
“Izquierda”, “Derecha”) y el número de casillas que quiere mover.
Muestra por pantalla cómo se va desplazando el personaje. Por ejemplo:
El personaje se encuentra inicialmente en la posición x = 4, y = 6.
Entrada del usuario:
Abajo
3
Se debería mostrar lo siguiente:
El personaje se mueve a la posición x = 4, y = 5
El personaje se mueve a la posición x = 4, y = 4
El personaje se mueve a la posición x = 4, y = 3
*/
		
		System.out.println("Para desplazarte escribe: [arriba, abajo, izquierda, derecha]");
		Scanner sc = new Scanner(System.in);
		
		String movimiento = sc.nextLine().toLowerCase();

		//
		System.out.println("Escribe los pasos que das: [1, 2, 3]");	
		Scanner sc2 = new Scanner(System.in);
		int pasos = sc2.nextInt();
		//
		
		int x = 4;
		int y = 6;
				
		switch (movimiento){
			case "arriba":
				movimiento = "Has movido +1 hacia arriba: " + (y + 1);
				if (pasos == 1) {
					pasos = y + 1;
					System.out.println("Has dado +1 paso hacia arriba: " + (y + 1));
					System.out.println("Posicion x = " + x + "" + "," + "" + "Posicion y = " + y);
				}
				if (pasos == 2) {
					pasos = y + 2;
					System.out.println("Has dado +2 paso hacia arriba: " + (y + 2));
					System.out.println("Posicion x = " + x + "" + "," + "" + "Posicion y = " + y);
				}

				// SERIA SEGUIR CONTINUANDO ASI, pero no me ha dado mas tiempor
					// Y TENGO QUE ENTREGAR LA TAREA antes de las 23:59
				
				break;
			case "abajo":
				movimiento = "Has movido -1 hacia abajo: " + (y - 1); 
	//			if (pasos = 1) {
					
		//		}

				break;
			case "izquierda":
				movimiento = "Has movido -1 hacia a la izquierda: " + (x - 1);
				break;
			case "derecha":
				movimiento = "Has movido +1 hacia a la derecha: " + (x + 1);
				break;
			default:
				movimiento = "No has podido mover";
				break;
		}
		System.out.println(movimiento);

	/*	
		System.out.println("Escribe los pasos que das: [1, 2, 3]");	
		Scanner sc2 = new Scanner(System.in);
		int pasos = sc2.nextInt();
		
		switch (pasos){
		case 1:
			pasos = "Has dado +1 paso hacia arriba: " + (y + 1);
			
			
		default:
			movimiento = "No has podido dar pasos";
			break;
		}
		System.out.println(pasos);
		*/
		
		sc.close(); 
		sc2.close();
	
		
		
	}

}

// es parecido al ejercicio E4 A4 Condicionales.