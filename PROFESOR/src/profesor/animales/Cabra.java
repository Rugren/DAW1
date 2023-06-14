package profesor.animales;

public class Cabra extends Mamifero{
    private int longitudCuernos;
    public Cabra(String ojos, String sistemaExcretor, int patas, int mamas, int longitudCuernos) {
        super(ojos, sistemaExcretor, patas, mamas);
        this.longitudCuernos = longitudCuernos;
    }

    public int getLongitudCuernos() {
        return longitudCuernos;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLongitud de cuernos: " + this.longitudCuernos;
    }
}
