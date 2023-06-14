package Profesor_jugadores;

public class Prof_EquipoKL extends Prof_Equipo{
    private String presidente;

    public Prof_EquipoKL(String nombre, int salario, String presidente){
        super(nombre, salario);
        this.presidente = presidente;
    }

    public String getPresidente() {
        return presidente;
    }
}
