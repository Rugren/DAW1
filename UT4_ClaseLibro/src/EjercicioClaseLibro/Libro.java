package EjercicioClaseLibro;

public class Libro {
	
	private String tituloLibro;
	private String autor;
	
	//quitado el "static" de numEjemplaresDeUnLibro
	private int numEjemplaresDeUnLibro ;	// antes tenia puesto 	"private int numEjemplaresDeUnLibro = 0;" pero con el 0 creo que salia mal
	// Esto seria como ejemplares totales.
	// si es de todos los libros seria "private static int numEjemplaresDeLibros = 0;"
	
	
	private int numEjemplaresDeUnLibroPrestado;
	
	private int numEjemplaresDeUnLibroDisponibles; //Seria la resta de: numEjemplaresDeUnLibro - numEjemplaresDeUnLibroPrestado. Los que tengamos disponibles

	
	// * Se podria crear una ClaseBiblioteca y hacer ahi listas. Habria que pasar ahi tambien los "numEjemplaresDeUnLibro" y los "numEjemplaresDeUnLibroPrestado".

	
	
	// Constructor por defecto
    public Libro(){
        this.tituloLibro = "Nombre libro por defecto"; 	// Tambien se puede poner: this.tituloLibro = "";
        this.autor = "Autor anonimo"; 					// Tambien se puede poner: this.autor = "";
        this.numEjemplaresDeUnLibro = 0;
        this.numEjemplaresDeUnLibroPrestado = 0;
    }

	// Constructor con parametros
    public Libro(String tituloLibro, String autor, int numEjemplaresDeUnLibro, int numEjemplaresDeUnLibroPrestado){
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.numEjemplaresDeUnLibro = numEjemplaresDeUnLibro;
        this.numEjemplaresDeUnLibroPrestado = numEjemplaresDeUnLibroPrestado;
   }

    
    // Los Setters y Getters
    public String getTituloLibro() {
        return tituloLibro;
    }
	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro = tituloLibro;
	}

    public String getAutor() {
        return autor;
    }
	public void setAutor(String autor) {
		this.autor = autor;
	}
   
	
	public int getNumEjemplaresDeUnLibro() {
		return numEjemplaresDeUnLibro;
	}
	// EL SET SIEMPRE ASI COMO TENGO EL setNumEjemplaresDeUnLibro:
	public void setNumEjemplaresDeUnLibro(int numEjemplaresLibros) {
		this.numEjemplaresDeUnLibro = numEjemplaresLibros;
	}
	
	//1.1 He puesto este metodo para que cuando se creen mas ejemplares de un libro, se sumen a los que ya habian.
	//1.2 Quitado esto del setNumEjemplaresDeUnLibro porque el setNumEjemplaresDeUnLibro tiene que estar limpio, como esta ahora(setNumEjemplaresDeUnLibro), 
	//1.3 por eso he creado este de "anadirMasEjemplares", para que aqui haga la sumatoria a los que ya tenemos con la creacion de un libro.
	public void anadirMasEjemplares(int numEjemplaresLibros) {
		this.numEjemplaresDeUnLibro = numEjemplaresDeUnLibro + numEjemplaresLibros; 
	}

	
	public int getNumEjemplaresDeUnLibroPrestado() {
		return numEjemplaresDeUnLibroPrestado;
	}
	public void setNumEjemplaresDeUnLibroPrestado(int numEjemplaresDeUnLibroPrestado) {
		this.numEjemplaresDeUnLibroPrestado =  numEjemplaresDeUnLibroPrestado;
	}
	
	public void EjemplaresDeUnLibroPrestado(int numEjemplaresDeUnLibroPrestado) {
		this.numEjemplaresDeUnLibroPrestado =  numEjemplaresDeUnLibroPrestado + numEjemplaresDeUnLibroPrestado;
	}

	// Metodo prestamo de un libro
    public boolean prestamo() {
        if (numEjemplaresDeUnLibroPrestado < numEjemplaresDeUnLibro) { // quitado el "=", no ponerlo asi: "numEjemplaresDeUnLibroPrestado <= numEjemplaresDeUnLibro"
        	numEjemplaresDeUnLibroPrestado++;
            System.out.println("Si se ha podido prestar, puesto que hay ejemplares disponibles");
            return true;
        } 
        else {
            System.out.println("No se ha podido prestar, puesto que no hay mas ejemplares del libro");
            return false;
        }
    }

	// Metodo devolucion de un libro
    public boolean devolucion() {
        if (numEjemplaresDeUnLibroPrestado > 0) { // Si ponemos: numEjemplaresDeUnLibroPrestado >= 0), el "=" sale mal.
        	numEjemplaresDeUnLibroPrestado--;
            System.out.println("Devolucion del libro prestado correctamente");
            return true;
        }
        else {
            System.out.println("Puesto que no hay libros prestados, no se puede realizar la devolucion de este libro.");
            return false;
        }
    }
    
//	______________________________
    
// 1.1 ESTE GET Y SET DE     numEjemplaresDeUnLibroDisponibles		OCULTADO PORQUE NO HARIAN NADA;
// 1.2 para poner nuevos ejemplares en vez de usar setNumEjemplaresDeUnLibroDisponibles utilizariamos numEjemplaresDeUnLibro
// 1.3.1 y para que nos muestre los ejemplares disponibles, que serian = numEjemplaresDeUnLibro(los existentes) - numEjemplaresDeUnLibroPrestado(los prestados)  
// 1.3.2 pues usariamos "NumeroEjemplaresDeUnLibroDisponibles".

/*	public int getNumEjemplaresDeUnLibroDisponibles() {
		return numEjemplaresDeUnLibroDisponibles;
	}
	public void setNumEjemplaresDeUnLibroDisponibles(int numEjemplaresDeUnLibroDisponibles) {
		this.numEjemplaresDeUnLibroDisponibles = numEjemplaresDeUnLibroDisponibles;
	}
*/

   
    public int NumeroEjemplaresDeUnLibroDisponibles() {
        if (numEjemplaresDeUnLibro > 0) { // Antes estaba: "numEjemplaresDeUnLibro >= 1", dejar con el "> 0" que no da problemas y es mejor. NO PONER "=".
        	numEjemplaresDeUnLibroDisponibles = numEjemplaresDeUnLibro - numEjemplaresDeUnLibroPrestado;
        	numEjemplaresDeUnLibroDisponibles++;
    		System.out.println("Numero de ejemplares disponibles: " + numEjemplaresDeUnLibroDisponibles); // Devuelve en el syso de MainLibro. El texo + numEjemplaresDeUnLibroDisponibles(en numero).
    		return numEjemplaresDeUnLibroDisponibles;
    	//	return numEjemplaresDeUnLibroDisponibles; (no se puede quedar vacio porque da mal y si no lo pongo me coge el return tambien de abajo al hace syso en el MainLibro.
       
    	//1.1 HACER UN if else o algo que deje perfecto; que no pueda ser el -Numero de ejemplares disponibles- negativo. Que si no tienes, no puedes prestar (-32 libros; que esto no se pueda).
    	//1.2 porque si presto 20 libros me salen por ejemplo ( "Numero de ejemplares disponibles: " + -32 ), en lugar de ("No hay ejemplares disponibles ").
        }
        else {
        	numEjemplaresDeUnLibroDisponibles = 0;
        }
		System.out.println("No hay ejemplares disponibles ");
		return numEjemplaresDeUnLibroDisponibles;
    }


    
    
    //	______________________________
    
    // Metodo toString
    @Override
    public String toString() {
        return "Título: " + tituloLibro + "\nAutor: " + autor + "\nNumero de ejemplares totales: " + numEjemplaresDeUnLibro 
        		+ "\nNumero de ejemplares prestados: " + numEjemplaresDeUnLibroPrestado 
        		+ "\nNumero de ejemplares disponibles: " + numEjemplaresDeUnLibroDisponibles + "\n";
    }
   
    
    
	

/*	
	// Metodo prestamo fallido, con un boolean, pero creo que mal hecho:
	public boolean numEjemplaresDeUnLibroPrestado() {
		if ( getNumEjemplaresLibros() <= 1)
			return false;
		else
//			numEjemplaresDeUnLibroPrestado = numEjemplaresDeUnLibroPrestado - 1;
			numEjemplaresDeUnLibroPrestado -= 1;
			return true;
	}
*/
	
}
