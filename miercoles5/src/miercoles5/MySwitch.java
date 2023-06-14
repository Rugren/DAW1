package miercoles5;

public class MySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* SWITCH (como el if y el else)
		Ejercicio 2 (pag.8) UD2. Estructuras de control
		(estamos haciendo un switch, no lo estamos haciendo con un operador ternario -que es lo que pone en el ejemplo-)
		*/
		
		/* (puesto como comentario porque no salía)
		String valor = "Uno";
		String valor = "Cero";
		String valor = "Perico";
		int x = 0;
		switch (valor) {
		case "Uno":
			System.out.println("Uno");
			break;
		case "Cero":
			System.out.println("Cero");
			break;
		case "Perico":
			System.out.println("Perico");
			break;
		default:
			System.out.println("Error tío");
			break;
		*/
		
		// un ejemplo:
		
		String valor = "cero";
		int valorNumerico;
		
		switch (valor) {
			case "uno":
				valorNumerico = 1;
				break;
			case "cero":
				valorNumerico = 0;
				break;
			default:
				valorNumerico = -1;
				break;
		}
		
		System.out.println(valorNumerico);
		
		
		
				
			
		}
		
		
		
	}
