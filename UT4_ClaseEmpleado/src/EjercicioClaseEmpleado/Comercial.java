package EjercicioClaseEmpleado;

public class Comercial extends Empleado {

	
	private double comision;
	

	public Comercial(String nombre, int edad, double salario, double comision) {
	  super(nombre, edad, salario);
	  this.comision = comision;
	  }

	public double getComision() {
	  return comision;
	  }

	public void setComision(double comision) {
	  this.comision = comision;
	  }

	public boolean plus() {
	  if (getEdad() >= 30 && getComision() >= 200) {
	      setSalario( getSalario() + getPLUS() );
		  System.out.println("Comercial mayor de 30 y su comision es 200 o mas. SE LLEVA EL PLUS");
	    return true;
	    }
	  	System.out.println("Comercial no mayor de 30 o su comision no es 200 o mas. No cobra el plus");
	    return false;
	    }
	  
	@Override
	public String toString() {
	    return "Empleado [ " + "Nombre: " + getNombre() + "," + "Edad: " + getEdad() + "," + "Salario: " + getSalario() + "," + "Comision: " + comision + "]";
	    }

}




