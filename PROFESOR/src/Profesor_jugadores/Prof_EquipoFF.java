package Profesor_jugadores;

public class Prof_EquipoFF extends Prof_Equipo{
    private String arma;

    public Prof_EquipoFF(String nombre, int salario, String arma){
        super(nombre, salario);
        this.arma = arma;
    }
    public String getArma() {
        return arma;
    }
}
