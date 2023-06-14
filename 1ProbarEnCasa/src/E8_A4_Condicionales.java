import java.util.Random;
import java.util.Scanner;

public class E8_A4_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("A ver si me ganas. Introduce: 0 para usar piedra, 1 para papel, o 2 para tijera");
		Scanner EscanerQueleeAlUsuario = new Scanner(System.in);
		
		int usuario = EscanerQueleeAlUsuario.nextInt();
		System.out.println("Has elegido: " + usuario);
		// este syso sería lo que escribe el usuario en pantalla.

		
		// los 3 final int (piedra,papel,tijera) y el switch de (usuario), los tenía abajo; ordenados por scanner - Random - los 3 final int - switch (maquinaJuega) - switch (usuario) - if.
		// ahora he subido los  3 final int (piedra,papel,tijera) y 
		
		
		final int piedra = 0;
		final int papel = 1;
		final int tijera = 2;
		
		switch (usuario) {
			case piedra: // si ponemos "case 0:" que es elegir piedra, tambien vale.
				System.out.println("El usuario ha usado Piedra");
				break;
			case papel:
				System.out.println("El usuario ha usado Papel");
				break;
			case tijera:
				System.out.println("El usuario ha usado Tijera");
				break;
			default:
				System.out.println("Te has equivocado de numero. Si te equivocas la maquina siempre gana");
				break;
		}

		
		Random maquinaUsa = new Random();
		int maquinaJuega = maquinaUsa.nextInt(3); //poner en el random (3) para que coja 0,1y2(3 números)
		System.out.println("\nEleccion Random de la maquina: " + maquinaJuega);
		// este syso lo puedo quitar, es solo para saber que nº random da. Pero dejado para saber el número que toca.
	
		switch (maquinaJuega) {
			case piedra:
				System.out.println("La maquina usa Piedra");
				break;
			case papel:
				System.out.println("La maquina usa Papel");
				break;
			case tijera:
				System.out.println("La maquina usa Tijera");
				break;
			default:
				System.out.println("Imposible que la maquina ponga otro resultado");
				break;
		}

		
		
		if (usuario == maquinaJuega) {
			System.out.println("\nEmpate.");
		}
		
		else if (usuario == piedra && maquinaJuega == tijera) {
			System.out.println("\nHas  ganado. ENHORABUENA!");
		}
		
		else if (usuario == papel && maquinaJuega == piedra) {
			System.out.println("\nHas  ganado. ENHORABUENA!");
		}
		
		else if (usuario == tijera && maquinaJuega == papel) {
			System.out.println("\nHas  ganado. ENHORABUENA!");
		}
		
		else {
			System.out.println("\nHas  perdido. La maquina gana.");
		}
	

		EscanerQueleeAlUsuario.close();
		
/*		QUITADOS TODOS LOS else if de "perder", porque así en Default se pone que "Pierdes, que gana la máquina" porque son todas las demás opciones restantes.
 			else if (usuario == piedra && maquinaJuega == papel) {
			System.out.println("Has  perdido. La maquina gana");


*/
			
//	scanner.close(); // se cierra scanner? porque da fallos
		
/*	
		¿un random de texto se podría hacer? que me diese al azar entre tijera, piedra o papel?
 		Random ramdom = new Random();

		Random ramdomP = new Random();
		int P = ramdom.ints("piedra", "papel", "tijera"); //¿Algo así? que elija entre las opciones que le hemos dado.
		System.out.println("La maquina usa: " + P);
*/

		
/*			
String[] maquinaAleatoria = new String [3];
String[] maquina = { "Piedra", "Papel", "Tijera"};
System.out.println(maquina);
 */


	// poner que si eligo piedra y coincide con la máquina, que devuelva Piedra == maquinaJuega;

		
/*		
		final String pi = "Piedra";
		final String pa = "Papel";
		final String ti = "Tijera";

		if (maquinaJuega == 0) {
			System.out.println("La maquina usa: " + pi);
		}
		if (maquinaJuega == 1) {
			System.out.println("La maquina usa: " + pa);
		}
		if (maquinaJuega == 2) {
			System.out.println("La maquina usa: " + ti);
		}

		
		
		if (maquinaJuega == 0 && usuario == pi) {
			System.out.println("Empate a piedra");
		}
		if (maquinaJuega == 1 && usuario == pa) {
			System.out.println("Empate a papel");
		}
		if (maquinaJuega == 2 && usuario == ti) {
			System.out.println("Empate a tijera");
		}
*/
		
		/* mal, muy mal
		if (usuario && maquinaJuega == piedra) {
			//aqui poner que haga empate o cosas 
			System.out.println("Es positivo");
		}
		
		if (usuario == (maquinaJuega == piedra)) {
			System.out.println("Es negativo");
		}
*/
		
	//poner que si sale piedra = a piedra, que sea empate, asi con las 3.

/*+++
		 switch (usuario) {
			case "piedra":
				// poner que si eligo piedra y coincide con la máquina, que devuelva Piedra == maquinaJuega;
				System.out.println("Elegiste piedra");
				break;
			case "papel":
				System.out.println("Elegiste papel");
				break;
			case "tijera":
				System.out.println("Elegiste tijera");
				break;
			default:
				System.out.println("Escribe la palabra correctamente");
				break;
		}

 +++*/

/*	
 * este escaner estaría mal, porque es .nextInt al introducir numeros
		System.out.println("A ver si me ganas. Introduce: 0 para usar piedra, 1 para papel, o 2 para tijera");
		Scanner EscanerQueleeAlUsuario = new Scanner(System.in);
		
		String usuario = EscanerQueleeAlUsuario.nextLine().toLowerCase();
		System.out.println("Elegiste: " + usuario);
		// este syso sería lo que escribe el usuario en pantalla.
		 //este syso borrar, pero en funcion de lo que coja el "usuario" actuar
		
		final int piedra = 0;
		final int papel = 1;
		final int tijera = 2;
		
		Random ramdom = new Random();

		Random maquinaUsa = new Random();
		int maquinaJuega = ramdom.nextInt(3);
		System.out.println(maquinaJuega + " eleccion Random de la maquina");
*/
		
		//String Piedra = usuario;

		//		if (usuario )
				
		//hay que sustituir (y que no explote) piedra por la eleccion del usuario "usuario"
/*		if (piedra == 0 && maquinaJuega == 0) {
			System.out.println("Usaste Piedra y la maquina usa Piedra: Empate");
		}
		else if (piedra == 0 && maquinaJuega == 1) {
			System.out.println("Usaste Piedra y la maquina usa Papel: Perdiste");
		}
		else if (piedra == 0 && maquinaJuega == 2) {
			System.out.println("Usaste Piedra y la maquina usa tijeras: Ganaste");
		}
*/
		
		
		
		
		
	}

}


