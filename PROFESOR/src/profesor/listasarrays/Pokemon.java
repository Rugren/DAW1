package profesor.listasarrays;

public class Pokemon {

    private int nivel;

    public Pokemon(){
        this.nivel = 1;
    }

    public void subirNivel(){
        this.nivel++;
    }

    public int getNivel() {
        return nivel;
    }
}
