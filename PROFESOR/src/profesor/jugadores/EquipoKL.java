package profesor.jugadores;

public class EquipoKL extends Equipo{
    private String presidente;

    public EquipoKL(String nombre, int salario, String presidente){
        super(nombre, salario);
        this.presidente = presidente;
    }

    public String getPresidente() {
        return presidente;
    }
}
