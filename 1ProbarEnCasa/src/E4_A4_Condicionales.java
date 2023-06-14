

import java.util.Scanner;

public class E4_A4_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Para mover escriba: [arriba, abajo, izquierda, derecha]");
		Scanner sc = new Scanner(System.in);
		
		String movimiento = sc.nextLine().toLowerCase();

		int x = 1;
		int y = 8;
		
		switch (movimiento){
			case "arriba":
				movimiento = "Has dado +1 paso hacia arriba: " + (y + 1);
				break;
			case "abajo":
				movimiento = "Has dado -1 paso hacia abajo: " + (y - 1); 
				break;
			case "izquierda":
				movimiento = "Has dado -1 paso a la izquierda: " + (x - 1);
				break;
			case "derecha":
				movimiento = "Has dado +1 paso a la derecha: " + (x + 1);
				break;
			default:
				movimiento = "No has podido dar un paso";
				break;
		
		}
		System.out.println(movimiento);
		sc.close(); 
		
		
	}

}
