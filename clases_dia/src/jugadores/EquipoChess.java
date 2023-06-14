package jugadores;

public class EquipoChess extends Equipo {
	
	private int elo;
	// elo es la puntuacion en ajedrez
	public EquipoChess(String nombre, int salario, int elo){
		super(nombre, salario);
		this.elo = elo;
	}
	
	public int getElo() {
		return elo;
	}
}
