package profesor.naves;

public class Dooku extends Nave{
    private int rabia;
    private boolean modoRabia;

    public Dooku(String nombre, int pA, int cD, int vel) {
        super(nombre, pA, cD, vel);
        this.rabia = 0;
        this.modoRabia = false;
    }

    public int getRabia() {
        return rabia;
    }

    public boolean isModoRabia() {
        return modoRabia;
    }

    public void subirRabia(int rabiaASubir){
        this.rabia += rabiaASubir;
    }

    @Override
    public boolean disparar(Nave rival) {
        if (rival.equals(this))
            return false;

        if (this.cantidadDefensas <= 0)
            return false;

        if(this.rabia >= 50 && !this.modoRabia){
            this.potenciaAtaque = this.potenciaAtaque * 2;
            this.cantidadDefensas = this.cantidadDefensas / 2;
            this.modoRabia = true;
        }
        rival.setCantidadDefensas(rival.cantidadDefensas - this.potenciaAtaque);
        this.rabia = this.rabia / 2;

        if(this.rabia < 50) {
            this.modoRabia = false;
            this.potenciaAtaque = this.potenciaAtaque / 2;
        }

        return true;
    }
}
