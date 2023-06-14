package examen;

// los dos equipos o el bando de cada uno; Developers y Bugs
// Esta es la clase Padre.
public abstract class Bando {
	private String nombre;
	private int coste;
//	protected int ataque; // protected si queremos que cambie, sino poner private. Ademas que cada uno tendra su ataque y defensa segun sea Developers o Bugs. 
//	protected int defensa; // protected si queremos que cambie, sino poner private. Ademas que cada uno tendra su ataque y defensa segun sea Developers o Bugs. 
	private int ataque;
	private int defensa;
	
	public Bando(String nombre, int coste, int elAtaque, int laDefensa) {
		this.nombre = nombre;
		this.coste = coste;
		this.ataque = elAtaque;
		this.defensa = laDefensa;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getCoste() {
		return coste;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCoste(int coste) {
		this.coste = coste;
	}

	public void setAtaque(int elAtaque) {
		this.ataque = elAtaque;
	}

	public void setDefensa(int laDefensa) {
		this.defensa = laDefensa;
	}

	@Override
	public String toString() {
		return "Developers {" + "nombre= '" + nombre + '\'' 
				+ ", coste=" + coste 
				+ ", ataque=" + ataque 
				+ ", defensa=" + defensa 
				+ '}'; 	// si pongo }'; sale error, no se porque no deja espaciarlo.
	}

	// para el clone hacer .clone + enter.

}
