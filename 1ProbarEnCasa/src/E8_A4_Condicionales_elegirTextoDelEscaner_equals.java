import java.util.Scanner;

public class E8_A4_Condicionales_elegirTextoDelEscaner_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/// ejercicio E8_A4_Condicionales_elegirTextoDelEscaner_equals 
		// hecho para que elija texto el usuario
		Scanner ppt = new Scanner(System.in);
		
		System.out.println("Introduce piedra/papel/tijeras");
		
		String opcion = ppt.next();
		String maquina = "papel";
		
		//con .equals ya puedo dar la opcion al usuario de que escriba, y con eso que hagamos cosas
		if (opcion.equals("piedra"));
			if (maquina.equals("papel"))
				System.out.println("gana papel, gana la maquina");
		//falta por hacer m�s, pero ya deja al escaner escanaer el texto
			// entonces si pones piedra y la maquina papel, ganaria papel.
	}

}
