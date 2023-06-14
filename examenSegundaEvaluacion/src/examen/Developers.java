package examen;

// somos nosotros, los buenos.
public class Developers extends Bando {
	
/*	Esto ya usado en el Constructor Padre(Bando) que lo cogemos abajo con el super.
    private String nombre;
    private int coste;
    protected int ataque;
    protected int defensa;
*/

    public Developers(String nombre, int coste, int elAtaque, int laDefensa){
        super(nombre, coste, elAtaque, laDefensa);
//        this.ataque = elAtaque; // dejar esto si tuvieran un ataque distinto a Bugs.
//        this.defensa = laDefensa; // dejar esto si tuvieran defensa distinta a Bugs.
                   
    }

/*    tendria que ser visible, hecho en clase Padre: Bando.
	@Override
	public String toString() {
		return "Developers {" + "nombre = '" + nombre + '\'' 
				+ ", coste =" + coste 
				+ ", ataque =" + ataque 
				+ ", defensa=" + defensa 
				+ " (atributos de nuestro Developers)"
				+ '}'; 	// si pongo }'; sale error, no se porque no deja espaciarlo.
	}
*/
    
    
    
}