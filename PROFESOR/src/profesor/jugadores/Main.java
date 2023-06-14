package profesor.jugadores;

//Ver " package jugadores; / public class MainJugadores ", mejor hecho ahí.

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Equipo ekl = new EquipoKL("e1", 1000, "Pepe");
        Equipo eff = new EquipoFF("e2", 1220, "Escopeta");
        Equipo eches = new EquipoChess("e3", 1500, 3000);


        /*for (Equipo e: listaEquipos) {
            System.out.println(e.getSalario());
        }*/

    }
}
