package Profesor_jugadores;

import java.util.LinkedList;

public class Prof_MainJugadores {
    public static void main(String[] args) {
        Prof_Equipo ekl = new Prof_EquipoKL("e1", 1000, "Pepe");
        Prof_Equipo eff = new Prof_EquipoFF("e2", 1220, "Escopeta");
        Prof_Equipo eches = new Prof_EquipoChess("e3", 1500, 3000);

        Prof_Jugador jugador = new Prof_Jugador(eches);

        LinkedList<Prof_Equipo> listaEquipos = new LinkedList<>();
        listaEquipos.add(ekl);
        listaEquipos.add(eff);
        listaEquipos.add(eches);

        System.out.println(((Prof_EquipoChess)eches).getElo());


        /*for (Equipo e: listaEquipos) {
            System.out.println(e.getSalario());
        }*/

    }
}
