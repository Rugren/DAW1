package jugadores;

// Utilizar este. En el del paquete "package profesor.jugadores;" hay menos cosas


import java.util.LinkedList;

public class MainJugadores {
	public static void main(String[] args) {
	
/*		
		EquipoKL ekl = new EquipoKL("e1", 1000, "Pepe");
		EquipoFF eff = new EquipoFF("e2", 1200, "Escopeta");
		EquipoChess eches = new EquipoChess("e3", 1500, 3000);
		
*sale mal		Jugador jugador = new Jugador(eches);
*esta bien con "jugador" la primera "j" en minuscula		Jugador jugador = new Jugador(eches);

*/		
        Equipo ekl = new EquipoKL("e1", 1000, "Pepe");
        Equipo eff = new EquipoFF("e2", 1220, "Escopeta");
        Equipo eches = new EquipoChess("e3", 1500, 3000);
		
        jugador jugador = new jugador(eches);

        LinkedList<Equipo> listaEquipos = new LinkedList<>();
        listaEquipos.add(ekl);
        listaEquipos.add(eff);
        listaEquipos.add(eches);

        System.out.println(((EquipoChess)eches).getElo());


        /*for (Equipo e: listaEquipos) {
            System.out.println(e.getSalario());
        }*/
		
	}
}














