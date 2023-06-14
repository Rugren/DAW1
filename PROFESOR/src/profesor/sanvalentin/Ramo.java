package profesor.sanvalentin;

import java.util.LinkedList;
import java.util.List;

public abstract class Ramo {
    private final List<Flor> flores;
    private Float precio;

    public Ramo(Flor ... fl){
        this.flores = new LinkedList<>();
        this.precio = 0f;
        for (Flor f: fl) {
            this.flores.add(f);
            this.precio += f.getPrecio();
        }
    }

    public void retirarFlor(Flor f){
        for (Flor flor: flores) {
            if (f.equals(flor))
                flores.remove(flor);
        }
    }

    public Float getPrecio() {
        return precio;
    }

    public List<Flor> getFlores() {
        return flores;
    }

    public void addFlores(List<Flor> listaFlores){
        this.flores.addAll(listaFlores);
    }

    public int contarFlores(String nombreFlor){
        int contadorFloresTipo = 0;
        for (Flor f: flores) {
            if(f.getNombre().equals(nombreFlor))
                contadorFloresTipo++;
        }
        return contadorFloresTipo;
    }
}
