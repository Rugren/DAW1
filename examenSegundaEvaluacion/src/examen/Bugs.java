package examen;

//son como los malos, los enemigos.
public class Bugs extends Bando { 
	
	public Bugs(String nombre, int coste, int elAtaque, int laDefensa) {
		super(nombre, coste, elAtaque, laDefensa);
//      this.ataque = elAtaque; // dejar esto si tuvieran un ataque distinto a Developers.
//      this.defensa = laDefensa; // dejar esto si tuvieran defensa distinta a Developers.
		
		
	}
	
	
/*    tendria que ser visible, hecho en clase Padre: Bando.
	@Override
	public String toString() {
		return "Developers {" + "nombre = '" + nombre + '\'' 
				+ ", coste =" + coste 
				+ ", ataque =" + ataque 
				+ ", defensa=" + defensa 
				+ " (atributos de Bugs)"
				+ '}'; 	// si pongo }'; sale error, no se porque no deja espaciarlo.
	}
*/
	

}
