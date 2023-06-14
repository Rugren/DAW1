package EjercicioClasePersonaje;

public class ClasePersonaje {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

	private String nombre;
	private ClasePersonajeEstado estado;
	private ClasePersonajePosicion posicion;
	private int nivel;
	private int vitalidad;
	private int magia;

	public ClasePersonaje(String nombre) {
		this.nombre = nombre;
		this.estado = estado.SANO;
		this.posicion = new ClasePersonajePosicion(0, 0);
		this.nivel = 1;
		this.vitalidad = 100;
		this.magia = 20;
		}

		  public String getNombre() {
			  return nombre;
		  }
		  public void setNombre(String nombre) {
			  this.nombre = nombre;
		  }

		  
		  public ClasePersonajeEstado getEstado() {
		    return estado;
		  }
		  public ClasePersonajeEstado setEstado(ClasePersonajeEstado estado) {
			  this.estado = estado;
			  return estado;
		  }
		  // este setEstado no se si esta Ok, porque si ponia " this.estado = estado; " estaba mal, o si metia el " ClasePersonajeEstado " tambien sale mal.
		  // pero he puesto el "this.estado = estado;" junto al "return estado;" y esta bien,...
		  // que pasa si dejo los 2 puestos??????????

		  
		  public ClasePersonajePosicion getPosicion() {
		    return posicion;
		  }
		  public ClasePersonajePosicion setPosicion(ClasePersonajePosicion posicion) {
			  this.posicion = posicion;
			  return posicion;
		  }

		  
		  public int getNivel() {
		    return nivel;
		  }
		  public void setNivel(int nivel) {
			  this.nivel = nivel;
		  }


		  public int getVitalidad() {
		    return vitalidad;
		  }
		  public void setVitalidad(int vitalidad) {
			  this.vitalidad = vitalidad;
		  }

		  
		  public int getMagia() {
		    return magia;
		  }
		  public void setMagia(int magia) {
			  this.magia = magia;
		  }

		  
		  // Para mover al personaje
		  public void mover(int x, int y) {
		    posicion.mover(x, y);
		  }

		  
		  public void curarse(int magiaUsada) {
		    magia -= magiaUsada;
		    vitalidad += 10 * magiaUsada;
		    estadoActual();
		  }
		  // necesito poner getCurarse y setCurarse ? O con esto ya estaria?

		  
		  public void estadoActual() {
		    if (vitalidad >= 80) {
			  estado = estado.SANO;
		    } 
		    //  estado = ClasePersonajeEstado.SANO; 
			  // El "estado = ClasePersonajeEstado.SANO;" esta bien, pero seria "estado" para saber el actual en el que nos encontramos? ir probando

		    else if (vitalidad >= 50) {
		      estado = estado.HERIDO;
		      } 
		    else if (vitalidad >= 25) {
		      estado = estado.MALHERIDO;
		      } 
		    else if (vitalidad >= 10) {
		      estado = estado.CRITICO;
		      } 
		    else if ((vitalidad >= 5) || (vitalidad <= 0 && vitalidad >= 5)) {
		      estado = estado.MEDIOMUERTO;
		      }
		    else { // no deja poner detras del else "(vitalidad == 0)" o (vitalidad <= 0)
			  estado = estado.MUERTO;
			  }
		    System.out.println(vitalidad);
		    // aqui este "System.out.println(vitalidad);" no hace nada, hacer en la clase "ClasePersonajeBocetoMain".
		  }

		  
		  public void teletransporte(int x, int y) {
		    if (magia >= 5) {
		      magia -= 5;
//		      magia = magia -5; - Es lo mismo que la anterior? comprobar si resta.
		      posicion.setX(x);
		      posicion.setY(y);
		      System.out.println("Has usado teletransporte y has gastado 5 de magia."); // poner algo tipo este syso + "Te quedan" + set.magia, pero el set no lo coge.
		    }
		    else if (magia < 5) {// tambien puedo poner: else if (magia <= 4)
		    	System.out.println("No puedes usar teletransporte, necesitas tener 5 de magia");
		    }
		    	
		  }

}

