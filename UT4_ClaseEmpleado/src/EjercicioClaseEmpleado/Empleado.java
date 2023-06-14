package EjercicioClaseEmpleado;

public class Empleado {
	
	  private String nombre;
	  private int edad;
	  private double salario;
	  private static final double PLUS = 300.00;
	  
	  
	  public Empleado(String nombre, int edad, double salario) {
	    this.nombre = nombre;
	    this.edad = edad;
	    this.salario = salario;
	  }

	  public String getNombre() {
	    return nombre;
	  }
	  public void setNombre(String nombre) {
	    this.nombre = nombre;
	  }

	  public int getEdad() {
	    return edad;
	  }
	  public void setEdad(int edad) {
	    this.edad = edad;
	  }

	  public double getSalario() {
	    return salario;
	  }
	  public void setSalario(double salario) {
	    this.salario = salario;
	  }

	  public static double getPLUS() {
	    return PLUS;
	  }
	  
/*	  No hace falta hacer un setPLUS porque esta arriba definida como -"private static final" double PLUS- que no se puede modificar. Es mas no deja crear el setPLUS
	  public void setPLUS(double PLUS) {
		    this.PLUS = PLUS;
	  }
*/

	  @Override
	  public String toString() {
	    return "Empleado [ " + "Nombre: " + nombre + "," + "Edad: " + edad + "," + "Salario: " + salario + "]";
	  }
	  
}

