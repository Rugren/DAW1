package EjercicioBladeRunner;

public class ClaseBlaster {
	
	// El "Blaster" es la pistola.
	
	// static para hacer contador (restar en cada disparo)
	private static int disparosDisponibles = 5;
	
	private int distanciaDisparoMetros = 10;
	private int tiempoRecargaSegundos = 1;
	

	//restar uno cada vez que use cada uno su blaster.
	private static int disparar;
	
	// no creo que use estos 2(dispararAlBlaster y dispararAReplicantes) si puedo usar en cada clase(la claseBladeRunner y la ClaseReplicante) el "disparar" con ambos.
	private int dispararAlBlaster;
	private int dispararAReplicantes;

	
	
	public ClaseBlaster(int disparosDisponibles, int distanciaDisparoMetros, int tiempoRecargaSegundos) {
        this.disparosDisponibles = disparosDisponibles;
        disparosDisponibles--;
        this.distanciaDisparoMetros = distanciaDisparoMetros;
        this.tiempoRecargaSegundos = tiempoRecargaSegundos;
	}

	
	
	public static int getDisparosDisponibles() {
	        return disparosDisponibles;
	}
	public void setDisparosDisponibles(int disparosDisponibles) {
			this.disparosDisponibles = disparosDisponibles;
	}
	
///	
	//Para disparar
	public boolean disparar(ClaseBlaster disparos) {
		disparos.disparar = disparos.disparar - this.disparosDisponibles;
		if (disparos.disparar == disparar) {
			disparosDisponibles--;
			return true;
		}
		return false;
	}
	
	public static int getDisparar() {
		return disparar;
	}
	public void setDisparar(int disparar) {
		this.disparar = disparar;
	}
///	
	
	
	public int getDistanciaDisparoMetros() {
        return distanciaDisparoMetros;
	}
	public void setDistanciaDisparoMetros(int distanciaDisparoMetros) {
		this.distanciaDisparoMetros = distanciaDisparoMetros;
	}
	
	public int getTiempoRecargaSegundos() {
        return tiempoRecargaSegundos;
	}
	public void setTiempoRecargaSegundos(int tiempoRecargaSegundos) {
		this.tiempoRecargaSegundos = tiempoRecargaSegundos;
	}
    
	
	
    // Lo de DISPARAR 10 METROS seria asi? o con un get?
	 public ClaseBlaster(int distanciaDisparoMetros) {
		 this.distanciaDisparoMetros = distanciaDisparoMetros;
		 }
	 
/*	 
    	public ClaseBladeRunner(String nombre) {
		this.distanciaDisparoMetros = new ClaseBlaster(10);
		this.nivel = 1;
		this.vitalidad = 100;
		this.magia = 20;
		}
*/

}
