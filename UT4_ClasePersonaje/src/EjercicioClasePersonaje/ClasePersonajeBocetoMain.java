package EjercicioClasePersonaje;

public class ClasePersonajeBocetoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// puesto personaje1 con la intencion de saber que se puede crear personaje2 distintos movimientos, etc.
		
		ClasePersonaje personaje1 = new ClasePersonaje(null);
		personaje1.setNombre("Nombre del personaje 1: Ruben");
		System.out.println(personaje1.getNombre());
		personaje1.setEstado(ClasePersonajeEstado.SANO);
		System.out.println("Estado de Salud: " + personaje1.getEstado());
		
		ClasePersonajePosicion posicionPrimeraDePersonaje1 = new ClasePersonajePosicion(0, 0);
		System.out.println("Posicion primera del personaje1: " + posicionPrimeraDePersonaje1);

		personaje1.setNivel(1);
		System.out.println("Nivel personaje1: " + personaje1.getNivel());

		personaje1.setVitalidad(100);
		System.out.println("Vitalidad del personaje1: " + personaje1.getVitalidad());
		
		personaje1.setMagia(20);
		System.out.println("Magia del personaje1: " + personaje1.getMagia());
	
		ClasePersonajePosicion posicionPrimeraDePersonaje2 = new ClasePersonajePosicion(20, 13);
		System.out.println("Posicion segunda del personaje1: " + posicionPrimeraDePersonaje2);
	
		
		
		
	
	/* hecho en la clase "ClasePersonaje", hacerlo aqui para el syso, pero da mal algo.
		private int vitalidad;
		private ClasePersonajeEstado estado
		
	    if (vitalidad >= 80) {
	    	estado = estado.SANO;
	    }

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
	  }
*/
		
/*		
		if (personaje1.getMagia() >= 5) { //asi?
		      magia -= 5;
		      posicion.setX(x);
		      posicion.setY(y);
		      System.out.println("Has usado teletransporte y has gastado 5 de magia."); // poner algo tipo este syso + "Te quedan" + set.magia, pero el set no lo coge.
		    }
		    else if (magia < 5) {// tambien puedo poner: else if (magia <= 4)
		    	System.out.println("No puedes usar teletransporte, necesitas tener 5 de magia");
		    }
*/
		  
	}
	



}
