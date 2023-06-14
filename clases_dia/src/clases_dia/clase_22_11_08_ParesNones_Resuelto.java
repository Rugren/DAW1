package clases_dia;

import java.util.Scanner;

public class clase_22_11_08_ParesNones_Resuelto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leeAlUsuario = new Scanner(System.in);
		System.out.println("�Que prefieres: pares o nones? ");
		
		String usuarioUsa, maquinaUsa;
		usuarioUsa = leeAlUsuario.next().toLowerCase();
		
		//
		
		if (usuarioUsa.equals("pares") ) {
			//.equals es == (en scanner).
			maquinaUsa = "Nones";
			System.out.println("Maquina usa: " + maquinaUsa);
		}
		
		else if (usuarioUsa.equals("nones")) {
			maquinaUsa = "Pares";
			System.out.println("Maquina usa: " + maquinaUsa);
		}
		
		
		leeAlUsuario.close();
		// cerrar siempre el scanner, utilizar el nombre que le dimos al escaner.
		
	}
	
}
