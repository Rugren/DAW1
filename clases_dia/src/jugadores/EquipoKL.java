package jugadores;

public class EquipoKL extends Equipo {
	private String presidente;
	
	public EquipoKL(String nombre, int salario, String Presidente) {
		super(nombre, salario);
		this.presidente = presidente;
	}
	
    public String getPresidente() {
        return presidente;
    }

}
