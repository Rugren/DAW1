package profesor.animales;

public abstract class Mamifero extends Animal{
    private int mamas;
    public Mamifero(String ojos, String sistemaExcretor, int patas, int mamas) {
        super(ojos, sistemaExcretor, patas);
        this.mamas = mamas;
    }

    public int getMamas() {
        return mamas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNúmero de mamas: " + this.mamas;
    }
}
