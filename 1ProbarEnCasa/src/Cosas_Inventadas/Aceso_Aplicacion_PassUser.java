package Cosas_Inventadas;

import javax.swing.JOptionPane;

public class Aceso_Aplicacion_PassUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Juan";
		String pass = "xd";
		

		while (clave.equals(pass)== false) {
			
			// solucionar lo de que cuando pongo nombre correcto, me pone: "Nombre incorrecto"
			// entra con la contrasena sea cual sea el nombre.
			clave = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
			if (clave.equals(clave)==false) {
				System.out.println("Nombre correcto");
			}
			
			else if (clave.equals(clave)==true) {
				System.out.println("Nombre incorrecto");
			}		
			
			clave = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
					
			if (clave.equals(pass)==false) {
				System.out.println("Contraseña incorrecta");
			} // cierre del if
		} // cierre del while
		
		System.out.println("Contraseña correcta. Acceso Permitido");
		

	}

}

/* // como estaba antes+ (este si iba, 
 * cambiar el: "pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");"
 * por este: "clave = JOptionPane.showInputDialog("Introduce la contraseña, por favor");"
 */

/* public static void main(String[] args) {
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


Con el while solo sería: 
		while (clave.equals(pass)== false) {
			
			// solucionar lo de que cuando pongo nombre correcto, me pone: "Nombre incorrecto"
			clave = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
			if (clave.equals(clave)==false) {
				System.out.println("Nombre correcto");
			}
			
			else if (clave.equals(clave)==true) {
				System.out.println("Nombre incorrecto");
			}		
			
			clave = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
					
			if (clave.equals(pass)==false) {
				System.out.println("Contraseña incorrecta");
			} // cierre del if
		} // cierre del while
		
		System.out.println("Contraseña correcta. Acceso Permitido");
		

	}
	
Con el do while sería: (quitando el "{" y poniendo ";" )
		do {
			clave = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		}
		
		while (clave.equals(pass)== false);
			
			// solucionar lo de que cuando pongo nombre correcto, me pone: "Nombre incorrecto"
			clave = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
			if (clave.equals(clave)==false) {
				System.out.println("Nombre correcto");
			}
			
			else if (clave.equals(clave)==true) {
				System.out.println("Nombre incorrecto");
			}		
			
			clave = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
					
			if (clave.equals(pass)==false) {
				System.out.println("Contraseña incorrecta");
			} // cierre del if
		
		System.out.println("Contraseña correcta. Acceso Permitido");
		

	}
	

*/