package Cosas_Inventadas;

public class NombresAleatorios {

		/**
		 * este metodo genera nombres con apellidos. El proceso es aleatorio. Cada vez
		 * que se corra el programa mostrara nombres diferentes.
		 * 
		 * @param cantidad
		 *            Cantidad de nombres que se quieren generar.
		 * @return un arreglo de String con los nombres y apellidos generados. El
		 *         formato de salida es: Nombre Apellido
		 */
		public static String[] generarNombresAleatorios(int cantidad) {
			
			
			String[] nombresAleatorios = new String[cantidad];

			String[] nombres = { "Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
					"Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
					"Caritina", "Carlota", "Baltazar"};
			String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
					"Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
					"Grigalva" };

			for (int i = 0; i < cantidad; i++) {
				nombresAleatorios[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + " "
						+ apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
			}
			return nombresAleatorios;
		}

		/**
		 * Imprime un arreglo de String
		 * 
		 * @param nombresGenerados
		 *            arreglo con los nombres generados
		 */
		public static void dameNombresConApellidos(String[] nombresGenerados) {
			for (int i = 0; i < nombresGenerados.length; i++) {
				System.out.println(nombresGenerados[i]);
			}
		}

		
		// El Main donde se ejecuta (que llama al metodo dameNombresConApellidos
		public static void main(String[] args) {
			System.out.println("Nombres y apellidos aleatorios: \n");
			dameNombresConApellidos(generarNombresAleatorios(5));
			//AQUI ES DONDE PONER EL NÚMERO ENTRE PARÉNTESIS QUE QUERAMOS QUE SAQUE
			
			
			//Con syso sale mal, imprime: [Ljava.lang.String;@71dac704
			// System.out.println("Nombres y apellidos aleatorios: \n" + generarNombresAleatorios(5));
			
			
		}
	}
