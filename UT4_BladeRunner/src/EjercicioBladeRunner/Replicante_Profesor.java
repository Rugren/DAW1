package EjercicioBladeRunner;

import java.util.LinkedList;

public class Replicante_Profesor {

	private static int numReplicantes = 0;
    private static LinkedList<Replicante_Profesor> listaReplicantes = new LinkedList<>();
    private String nombre;
    private int vitalidad;
    private int escudo;
    private int potencia;

    public Replicante_Profesor(String nombre, int vitalidad, int potencia){
        this.nombre = nombre;
        this.vitalidad = vitalidad;
        this.potencia = potencia;
        this.escudo = 5;
        numReplicantes++;
        listaReplicantes.add(this);
    }

    public boolean atacar(Replicante_Profesor enemigo){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Venga más tarde.");
        }
        enemigo.vitalidad = enemigo.vitalidad - this.potencia;
        if(enemigo.vitalidad <= 0){
            numReplicantes--;
            return true;
        }
        return false;
    }

    public static int getNumReplicantes() {
        return numReplicantes;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public static void addReplicante(Replicante_Profesor rep){
        listaReplicantes.add(rep);
    }

    public static LinkedList<Replicante_Profesor> getListaReplicantes(){
        return (LinkedList<Replicante_Profesor>) listaReplicantes.clone();
    }

    @Override
    public String toString() {
        return this.nombre + ", " +  this.vitalidad + ", " + this.potencia;
    }
}
