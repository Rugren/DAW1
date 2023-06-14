package profesor.jugadores;

public class EquipoFF extends Equipo{
    private String arma;

    public EquipoFF(String nombre, int salario, String arma){
        super(nombre, salario);
        this.arma = arma;
    }
    public String getArma() {
        return arma;
    }
}
