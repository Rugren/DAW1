package profesor.jugadores;

public class EquipoChess extends Equipo{

    private int elo;

    public EquipoChess(String nombre, int salario, int elo){
        super(nombre, salario);
        this.elo = elo;
    }

    public int getElo() {
        return elo;
    }
}
