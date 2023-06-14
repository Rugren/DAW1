package Cosas_Inventadas;

import javax.swing.JOptionPane;

public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* se dice que el peso ideal es:
		tu altura - 110 si eres hombre
		tu altura - 120 si eres mujer
		*/
		
		String genero = "";
		do {
			genero= JOptionPane.showInputDialog("Introduce tu genero (H/M)");
			//el JOptionPane.showInputDialog es como un syso y escáner que te permite escribir
		} while (genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")== false);
		// el ".equalsIgnoreCase" distingue mayúsculas de minúsculas. Con ".equals" solo distingue minúsculas
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		
		int pesoIdeal = 0;
		if (genero.equalsIgnoreCase("H")) {
			pesoIdeal = altura - 110;
		}
		
		else if (genero.equalsIgnoreCase("M")) {
			pesoIdeal = altura - 120;
		}
	
		System.out.println("Tu peso ideal es " + pesoIdeal + " Kg");
		
	}

}
