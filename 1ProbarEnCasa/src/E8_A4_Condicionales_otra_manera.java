import java.util.Scanner;

public class E8_A4_Condicionales_otra_manera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 System.out.println("Juego piedra-papel-tijera");
	     Scanner teclado = new Scanner(System.in);
	     
	     
	     int seleccionCompu = (int)(Math.random() * 3) + 1;
	     System.out.println("La computadora ya escogio...");
	     //este sería el random de la maquina
	     
	     
	     System.out.print("Indique su seleccion [1=Piedra, 2=Papel, 3=Tijera]: ");
	     int seleccionUsuario = teclado.nextInt();
	 
	    
		System.out.print("La computadora habia escogido: ");
		switch (seleccionCompu) {
		// el switch principal de la maquina (case 1)
			case 1:
				System.out.println("Piedra"); //aquí la maquina usaría Piedra y ya ponemos el switch dentro de otro switch que jugaría el usuario
				
				switch (seleccionUsuario) {
				//este switch es la elección del usuario, 
				
				case 1:
					System.out.println("Empate!");
				//como nosotros hemos usado Piedra, caso 1(el primer switch de arriba; el switch principal de la maquina) (donde el usuario habría dicho 1, que nosotros tenemos definido Piedra como 1, pues sería empate)
					
					break;
				case 2:
					System.out.println("Usted gana!");
					break;
				case 3:
					System.out.println("La computadora gana!");
					break;
				}
				break;

			case 2:
				System.out.println("Papel");
		// el switch principal de la maquina (case 2). Aquí la maquina usaría Papel.				
				
				switch (seleccionUsuario) {
				case 1:
					System.out.println("La computadora gana!");
					break;
				case 2:
					System.out.println("Empate!");
					break;
				case 3:
					System.out.println("Usted gana!");
					break;
				}
				break;

			case 3:
				System.out.println("Tijera");
		// el switch principal de la maquina (case 3). Aquí la maquina usaría Papel.				
				
				switch (seleccionUsuario) {
				case 1:
					System.out.println("Usted gana!");
					break;
				case 2:
					System.out.println("La computadora gana!");
					break;
				case 3:
					System.out.println("Empate!");
					break;
				}
				break;
	        }
	    
	        
	        
	}

}
