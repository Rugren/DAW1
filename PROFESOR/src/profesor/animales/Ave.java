package profesor.animales;

public abstract class Ave extends Animal{

    private String colorPlumaje;

    public Ave(String ojos, String sistemaExcretor, int patas, String colorPlumaje) {
        super(ojos, sistemaExcretor, patas);
        this.colorPlumaje = colorPlumaje;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nColor de plumaje: " + this.colorPlumaje;
    }
}
