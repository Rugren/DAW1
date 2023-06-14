package EjercicioBladeRunner;

public class ClaseReplicante {
	
	// en caso de crear una lista para los replicantes
	// habria que importar list, poner esto: import java.util.LinkedList;
//  private static LinkedList<ClaseReplicante> listaReplicantes = new LinkedList<>();
	
	// Atributos de los Replicantes
    private String nombreReplicante;
    	//1.1 puesto nombreReplicante para comprenderlo mejor en el Main, 
    	//1.2 aunque en el Main pongamos nombre y nos coja este, es para distinguirlos mejor.
	private enumEstado estado;

	// public static Replicante = 0; (no sirve para nada?)

	
    // Contador de Replicantes
	private static int numReplicantes = 0;
 
    public static int getNumReplicantes() {
        return numReplicantes;
    }
	public void setNumReplicantes(int numReplicantes) {
		this.numReplicantes = numReplicantes;
	}

	
    public ClaseReplicante(String nombreReplicante, enumEstado estado){
        this.nombreReplicante = nombreReplicante;
        numReplicantes++;
    }
    
    public boolean ReplicanteMuere(ClaseReplicante replicante){
    	replicante.estado = replicante.estado;
        if(replicante.estado == replicante.estado.MUERTO) {
           numReplicantes--;
           return true;
        }
        return false;
    }

    
    
    public String getNombreReplicante() {
        return nombreReplicante;
    }
	public void setNombreReplicante(String nombreReplicante) {
		this.nombreReplicante = nombreReplicante;
	}
	
	// Creado el enumEstado con get y set al igual que en "ClaseBladeRunner" para que me lo coja en el MainBladeRuner.
	public enumEstado getEstado() {
	    return estado;
	}
	public enumEstado setEstado(enumEstado estado) {
	this.estado = estado;
	return estado;
	}


    
	// Para atacar a Replicantes, por si me atacan (ver si se puede coger en el Main con la ClaseBladder). 
	private static boolean atacarAReplicante;

    public boolean atacarAReplicante(ClaseReplicante replicante){
    	replicante.estado = replicante.estado.VIVO;
  //1.1	replicante.estado = replicante.estado; // asi tambien da bien, pero imagino que no se podra atacar alguien si esta muerto. 
  //1.2 Pero el caso es que si esta "Herido" tampoco le podria atacar y con un ||(o) tampoco sale bien.
    	
        if(replicante.estado == replicante.estado.MUERTO) {
           //if(replicante.estado.equals(estado.MUERTO) = replicante.estado.MUERTO) {
           numReplicantes--;
           return true;
        }
        return false;
    }
    
    // Para el Main tiene que devolvernos un atacarAReplicante set y get? Creado por si los uso;
    public static boolean getAtacarAReplicante() {
    	return true;
    }
    public void SetAtacarAReplicante(boolean atacarAtacarAReplicante) {
		this.atacarAReplicante = atacarAReplicante;
	}
 
    
    // +++ Si se hace bien el "private static boolean comoSeEncuentraElBladeRunner;" de la ClaseBladeRunner, hacer igual aqui.

    
    



}
