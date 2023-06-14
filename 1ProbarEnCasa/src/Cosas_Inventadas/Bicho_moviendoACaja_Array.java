package Cosas_Inventadas;

public class Bicho_moviendoACaja_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//public class Equipos {
//	public static void main(String[] args) {
		
		String[] equipo = { "Bicho1", null, "Bicho2", "Bicho3", null };
		String[] caja = new String[equipo.length];
		String bicho = "Bicho2"; // Bicho a mover

// Buscar el bicho en el equipo
		int bichoIndex = -1;
		for (int i = 0; i < equipo.length; i++) {
			if (equipo[i] != null && equipo[i].equals(bicho)) {
				bichoIndex = i;
				break;
			}
		}

		if (bichoIndex != -1) {
// Mover el bicho a la caja
			for (int i = 0; i < caja.length; i++) {
				if (caja[i] == null) {
					caja[i] = equipo[bichoIndex];
					equipo[bichoIndex] = null;
					break;
				}
			}
			
		} else {
			System.out.println("El bicho no se encontró en el equipo.");
		}

		System.out.println("Equipo: ");
		for (String bichoEquipo : equipo) {
			System.out.println(bichoEquipo);
		}

		System.out.println("Caja: ");
		for (String bichoCaja : caja) {
			System.out.println(bichoCaja);
		}
	}
}
