package profesor.animales;

public abstract class Animal {
    private String ojos;
    private String sistemaExcretor;
    private int patas;

    public Animal(String ojos, String sistemaExcretor, int patas){
        this.ojos = ojos;
        this.patas = patas;
        this.sistemaExcretor = sistemaExcretor;
    }

    public int getPatas() {
        return patas;
    }

    public String getOjos() {
        return ojos;
    }

    public String getSistemaExcretor() {
        return sistemaExcretor;
    }

    @Override
    public String toString() {
        return "Color de ojos: " + this.ojos + "\n" +
                "Sistema excretor: " + this.sistemaExcretor + "\n" +
                "Número de patas: " + this.patas;
    }
}
