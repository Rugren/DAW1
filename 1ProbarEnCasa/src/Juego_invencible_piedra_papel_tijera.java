import java.util.Scanner;

public class Juego_invencible_piedra_papel_tijera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("No puedes ganarme, yo nunca empato, ni pierdo! Introduce: Piedra, Papel o Tijera");
		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine().toLowerCase();
	
		String salida;
		
		switch (entrada){
			case "piedra":
				salida = "papel";
				break;
			case "papel":
				salida = "Tijera";
				break;
			case "tijera":
				salida = "Piedra";
				break;
			default:
				salida = "Respueta no valida, asi que gana la maquina";
				break;
		
		}
		System.out.println(salida);

	}

}
