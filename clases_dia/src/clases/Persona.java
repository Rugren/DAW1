package clases;

public class Persona {
	private int edad;
	private float peso;
	private float altura;
	protected String nombre;
	// esto son 4 atributos de la clase Persona.
	
	// private y protected es lo mismo

	public void saludo () {
		System.out.println("Hola");
	}
	
	public int restarDosNumeros (int n1, int n2) {
		saludo();
		return n1 - n2;
	}	
	
	public int restarDesdeHasta (int inicial, int finale) {
		
		int contador = 0;
		int x;
		for (int i = inicial; i < finale; i++); {
			x = restarDosNumeros(i, i+5);
			contador += x;
		}
		
		return contador;
	}	

	public int sumarDosNumeros (int n1, int n2) {
		return n1 + n2;
	}

	
}
		
	
	// esto es del ejercicio o clase clase_22_11_29_Clases_instancia
		
	// public static void main(String[] args) {
		// TODO Auto-generated method stub

//	}

//}
