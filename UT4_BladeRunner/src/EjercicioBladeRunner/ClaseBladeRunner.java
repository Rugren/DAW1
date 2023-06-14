package EjercicioBladeRunner;

public class ClaseBladeRunner {
	
	// Atributos de nuestro Blade Runner
    private String nombre;
    private int ClaseBlaster; //el blaster es la pistola
    private int escudo;
	private enumEstado estado;
 
	private String mascota = "Mascota electrica";
    

	
    // Contador de BladeRunners creados (Aunque solo sea 1, creado el contador)
	private static int numBladeRunners = 0;
 
    public static int getNumBladeRunners() {
        return numBladeRunners;
    }
	public void setNumBladeRunners(int numBladeRunners) {
		this.numBladeRunners = numBladeRunners;
	}

	
	
    public ClaseBladeRunner(String nombre, int blaster, int escudo, enumEstado estado) {
        this.nombre = nombre;
        this.ClaseBlaster = blaster;
        this.escudo = 10;
//		this.distanciaDisparoMetros = new ClaseBlaster(0);
        this.estado = estado.VIVO;
        numBladeRunners++;
        // 1.1 el estado no hace falta ponerlo al lado de "..., int escudo) {"
        // 1.2 es decir, dentro del "public ClaseBladeRunner" porque siempre empieza o se crea VIVO de estado)
        // 1.3+ Si anadido, por si luego nos cambia el estado o algo. 
        // 1.4+ Pero puesto para que se cree siempre VIVO: " this.estado = estado.VIVO; "
    }

   
	
    public String getNombre() {
        return nombre;
    }
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
    public int getBlaster() {
        return ClaseBlaster;
    }
	public void setBlaster(int ClaseBlaster) {
		this.ClaseBlaster = ClaseBlaster;
	}

/*	CAMBIE "blaster" por la clase que hice del blaster: "ClaseBlaster"
 *  En todos estos lugares;
 *  
    private int ClaseBlaster; //el blaster es la pistola
    
	this.ClaseBlaster = blaster;

    public int getBlaster() {
        return ClaseBlaster;
    }
	public void setBlaster(int ClaseBlaster) {
		this.ClaseBlaster = ClaseBlaster;
	}
*/
	
	
	
    public int getEscudo() {
        return escudo;
    }
	public void setEscudo(int escudo) {
		this.escudo = escudo;
	}
	
	
	public enumEstado getEstado() {
		    return estado;
	}
	public enumEstado setEstado(enumEstado estado) {
		this.estado = estado;
		return estado;
	}

	
	
	///	
		// Para disparar como coger en el Main de la ClaseBlaster el disparo?
		// porque con el ".get no nos aparece".

	///	


	
	// Para atacar a BladeRunner, por si me atacan (ver si se puede coger en el Main con la ClaseReplicante).
	private static boolean atacarABladeRunner;
	
    public boolean atacarABladeRunner(ClaseBladeRunner bladeRunner){
    // bladeRunner.estado.VIVO = bladeRunner.estado.VIVO; // da mal
    	bladeRunner.estado = bladeRunner.estado.VIVO;
        if(bladeRunner.estado.MUERTO == bladeRunner.estado.MUERTO){
     // if(bladeRunner.estado.MUERTO == bladeRunner.estado.MUERTO){ //asi da bien pero da mal el anterior
        	numBladeRunners--;
            return true;
        }
        return false;
    	}
    // Para el Main tiene que devolvernos un atacarABladeRunner set y get? Creado por si los uso;
    public static boolean getAtacarABladeRunner() {
    	return true;
    }
    public void SetAtacarABladeRunner(boolean atacarABladeRunner) {
		this.atacarABladeRunner = atacarABladeRunner;
	}

    
    
   // Creo que esta mal porque no resta al contador cuando muere un BladeRunner en el Main. 
	private static boolean comoSeEncuentraElBladeRunner;
    public boolean bladeRunnerEnActivo(ClaseBladeRunner comoSeEncuentraElBladeRunner) {
        if (enumEstado.MUERTO == enumEstado.MUERTO){
        	numBladeRunners--;
        return true;
        }
        return false;
    	}
  	
    // siempre me va a devolver true cuando lo solicite, ponga muerto o vivo en "comoSeEncuentraElBladeRunner".
    public static boolean getComoSeEncuentraElBladeRunner() {
    	return true;
    }
/*    devolvia "Si esta muerto" cuando escribia en el Main el "ClaseBladeRunner.getComoSeEncuentraElBladeRunner".
    public static String getComoSeEncuentraElBladeRunner() {
    	return "Si esta muerto";
    }
*/
    public void setComoSeEncuentraElBladeRunner(boolean comoSeEncuentraElBladeRunner) {
		this.comoSeEncuentraElBladeRunner = comoSeEncuentraElBladeRunner;
	}
 
    
    
    
    
    
}




