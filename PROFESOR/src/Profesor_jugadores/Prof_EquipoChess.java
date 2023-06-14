package Profesor_jugadores;

public class Prof_EquipoChess extends Prof_Equipo{

    private int elo;

    public Prof_EquipoChess(String nombre, int salario, int elo){
        super(nombre, salario);
        this.elo = elo;
    }

    public int getElo() {
        return elo;
    }
}
