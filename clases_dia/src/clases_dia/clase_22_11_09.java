package clases_dia;

public class clase_22_11_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 09/11/2022
		
		
		String palabra = "moscas";
		System.out.println("ultima letra de la palabra moscas: " + palabra.charAt(palabra.length()-1 ));
		// palabra.length vale 6, ya que dfghjk tiene 6 letras, y como hemos puesto -1, me dar� la �ltima letra "s"
		
		
		String nombre2 = "dfadffg";
			for (int i = 0; i < nombre2.length(); i++) {
				System.out.println("Corta en la letra 'a': " + nombre2.charAt(i));
				
			if (nombre2.charAt(i) == 'a')
			break;
		// termina de darlos letras hasta la 'a', en la letra a, corta y no da las siguientes.
			}
	
	
		// el 		String nombre2 est� arriba
		/* otra manera
		int i = 0;
		while(i < nombre2.length()) {
			System.out.println(nombre2.charAt(i));
			i++;
		}
		*/
			
		//
		
		boolean abierta = true;
		while (!abierta) {
		// en este while est� cerrada, ya que estamos negando (!) abierta, por tanto est� cerrada. No entrar�a en el bucle.
		// si quitamos la negaci�n entrar�a en el bucle. Pero poner un if o algo m�s, porque sino ser�a un bucle infinito.	
		System.out.println("La puerta esta: " + abierta);
		// como es true no nos lo imprime
		}
		
		
		//
		
		
		//esto est� en codigo ascci. Pasar el valor del char al codigo asci.
		char inicial = 'a';
		// el char es un unico caracter, por lo que si decimos 5 da " esto no es una letra", pero si pongo 55 ya explota, o si pongo aa tambien peta.
		
		int inicialEntero = (int) inicial;
		
		if (inicialEntero == 97 || inicialEntero == 101 
			|| inicialEntero == 105 || inicialEntero == 117) {
		System.out.println(inicial + " es una vocal");
		}
			
		else if (inicialEntero >=97 && inicialEntero <=122 ) { // la 122 es la letra z.
		System.out.println(inicial + " es una consonante");
		}
		
		else {
		System.out.println(inicial + " esto no es una letra"); 
		}
		
		
		
		
	}

}
