package EjercicioClasePelicula;

public class ClasePelicula {
	
	// private String pelicula; (no usar, mejor poner titulo, que es lo mismo)
	
    private String titulo;
    private int anio;
    private int duracion;
    private int numVotos;
    private int puntuacion;
    private int criticas;
    private String critica;

    // Todos los gets y sets
    
    // get y set de titulo
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    // get y set de anio
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    // get y set de duracion
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    // get y set de numVotos
    public int getNumVotos() {
        return numVotos;
    }
    public void setNumVotos(int numVotos) {
        this.numVotos = numVotos;
    }
    
    // get y set de puntuacion
    public int getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

///
    
    // get y set de criticas
    public int getCriticas() {
        return criticas;
    }
    public void setCriticas(int criticas) {
        this.criticas = criticas;
    }
    
    // Criticas = Numero de comentarios que pusieron en la web sobre la pelicula.
    // Critica = Mi comentario de la pelicula.
    
    // Si quiero hacer una "critica" seria lo mismo que "criticas" solo que con String en vez de int, 
    // ya que el int de "criticas" es el numero de criticas que tiene la pelicula.    

    // get y set de critica
    public String getCritica() {
        return critica;
    }
    public void setCritica(String critica) {
        this.critica = critica;
      //this.critica = ""; Cuando se pone??
    }
    
/*    // Método para YO votar la película
    public void votarYoPelicula(int estrellas) {
        this.puntuacion = (this.puntuacion * this.numVotos + estrellas) / (this.numVotos + 1);
        this.numVotos++;
    }
*/    
    
///
    
    
    // Metodo para votar la pelicula
    private int votarPelicula;
    
    public int getVotarPelicula() {
        return votarPelicula;
    }

    public void setVotarPelicula(int estrellas) {
        this.puntuacion = (this.puntuacion * this.numVotos + estrellas) / (this.numVotos + 1); // La "/" es para dividirlo entre el numVotos+1.
        this.numVotos++;
    }
    
    // Metodo para crear una critica
    
    private String CrearCritica;
    
    public String getCrearCritica() {
        return CrearCritica;
    }
   
    public void setCrearCritica(String nuevaCritica) {
        this.critica += nuevaCritica + "\n-----------------\n"; // ?? ver si se suma a una nueva critica la que ponga (experimento)
    	// el += es para concatenarlo. Es como "Hola" + "mundo".
    } 
    
}   


///    FIN.
    
    //__________________________________________________________

    // POR SI QUIERO PROBAR OTRAS COSAS AL MARGEN:
/*    
// Creacion a parte de ClasePelicula, Pelicula 
	/ (probada esta otra por mi cuenta con ajustes de captura de profesor, ver carpeta ClasePelicula de UT4)    
// Cambiada el ".nombre" donde antes he puesto "titulo", es lo mismo, pero cambiado para no liar con la otra parte.   
// Esta OK
    
    /// Desde este 1.0 hasta el 1.1 esta todo OK
    private String nombre;
    // get y set de nombre (lo que antes arriba era titulo)
    public String getnombre() {
        return nombre;
    }
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void Pelicula(String nombre, int puntuacion) {
    	this.nombre = nombre;
    	this.puntuacion = puntuacion;
    	this.critica = "";
    }
    // hasta aqui 1.1+++. De aqui hacia abajo algo falla.
    
    String peliculaAComparar;
    
    public String compararPelicula(ClasePelicula peliculaAComparar) {
    	if (this.puntuacion >= peliculaAComparar.puntuacion)
    		return this.nombre;
    	else
    		return peliculaAComparar.nombre;
    }
    
    int peliculaACompararPuntos;
    
    public int compararPuntuacion(ClasePelicula Puntuacion) {
		if (this.puntuacion >= peliculaACompararPuntos.puntuacion)
    		return this.puntuacion;
    	else
    		return peliculaACompararPuntos.puntuacion;
    }
   
    public static String compararPuntuacionStatic(ClasePelicula pelicula1, ClasePelicula pelicula2) {
    	if (pelicula1.puntuacion >= pelicula2.puntuacion)
    		return pelicula1.nombre;
    	else
    		return pelicula2.nombre;
    }
*/
    


