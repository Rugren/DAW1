package Cosas_Inventadas;

import javax.swing.JOptionPane;

public class Aceso_Aplicacion_PassUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Juan";
		String pass = "xd";
		
		while (clave.equals(pass)== false) {
			
			pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
					
			if (clave.equals(pass)==false) {
				System.out.println("Contraseña incorrecta");
			} // cierre del if
		} // cierre del while
		
		System.out.println("Contraseña correcta. Acceso Permitido");
		

	}

}
