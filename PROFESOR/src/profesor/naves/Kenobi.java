package profesor.naves;

public class Kenobi extends Nave{

    private boolean modoJedi;

    public Kenobi(String nombre, int pA, int cD, int vel) {
        super(nombre, pA, cD, vel);
        this.modoJedi = false;
    }

    public boolean isModoJedi() {
        return modoJedi;
    }

    @Override
    public boolean disparar(Nave rival) {
        if (rival.equals(this))
            return false;

        if (this.cantidadDefensas <= 0)
            return false;

        int cantidadPotencia = this.potenciaAtaque;

        if (this.modoJedi){
            cantidadPotencia = (int) (this.potenciaAtaque * 1.5);
        }
        rival.setCantidadDefensas(rival.cantidadDefensas - cantidadPotencia);
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "{ModoJedi: " + this.modoJedi + "}";
    }
}