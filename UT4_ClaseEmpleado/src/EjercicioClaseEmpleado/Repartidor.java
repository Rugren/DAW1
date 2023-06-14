package EjercicioClaseEmpleado;

public class Repartidor extends Empleado {

	private String zona;
	
	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
	    this.zona = zona;
	  }

/*	1.1 Es parecido, pero hacer con el super (como esta hecho arriba). 
 *  1.2 DUDA: ¿Por que ya creamos el @Override ? o no tiene que ver el super con que este creado el Override ?¿
	public Repartidor(String nombre, int edad, double salario, String zona) {
	    setNombre(nombre);
	    setEdad(edad);
	    setSalario(salario);
		this.zona = zona;
		}
*/
	public String getZona() {
	  return zona;
	}

	public void setZona(String zona) {
	  this.zona = zona;
	}

	public boolean plus() {
	  if ( getEdad() <= 25 && getZona().equals("zona 3") ) {
		  setSalario( getSalario() + getPLUS() );
		  System.out.println("Tiene edad de 25 o menos y reparte en la -zona 3-. GANA EL PLUS");
	    return true;
	  }
	  System.out.println("Tiene edad mas de 25 o no reparte en la -zona 3-. No gana el plus");
	    return false;
	  }
	
	@Override
	public String toString() {
	    return "Empleado [ " + "Nombre: " + getNombre() + "," + "Edad: " + getEdad() + "," + "Salario: " + getSalario() + "," + "Zona: " + zona + "]";
	    }

	
}	

