package EjercicioClaseOperador;

public class MainClaseOperador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// no usar los get y set en este ejercicio(salvo en la suma), 
		// asi que usar los "." y poner el nombre del public (ver siguiente linea el ejemplo)
		// por ejemplo coger "operador1.restar"
		
		ClaseOperador operador1 = new ClaseOperador(3, 5);
		ClaseOperador operador2 = new ClaseOperador(8, 4);
	    
		// suma de ambos operadores sin los get.
	    System.out.println("Suma del operador1: " + operador1.sumar());
	    System.out.println("Suma del operador2: " + operador2.sumar());
	    
	    
	    // Sumar con los get (usar los .get)
	    // HAY QUE HACER: (USANDO LOS GETS)
	    	// Suma el primer valor del primer Operador creado con el segundo valor del
	    	// segundo Operador y muestra el resultado por pantalla (utiliza los
	    	// operadores get para obtener dichos valores y después sumarlos).
	    
	    // me da el 3 del primer numero del operador1 y el 4 del segundo numero del operador2 (Como hacerlo bien?)
	    System.out.println("Suma del num1+num2: " + operador1.getNum1() + "+" + operador2.getNum2());
//	    System.out.println("Suma del primer valor del num1 + suma del segundo valor del num2: " ); // descomentar cuando sepa como da el resultado de la suma..
	    
	    
	    System.out.println("Resta: " + operador1.restar());
	    System.out.println("Multiplicacion: " + operador1.multiplicar());
	    System.out.println("Division: " + operador1.dividir());
	    
	    System.out.print("Todos los numeros entre el primero y el segundo del mismo operador: \n ");
	    operador1.mostrarNumerosEntreNum1yNum2();
	    
	    System.out.println("\n ");
	    
	    // divide en operador1 si es "(3, 5);" el 3 entre 5.
	    System.out.println("Es divisible por: " + operador1.esDivisiblePor(2));
	    // al contrario que el anterior, divide en operador1 si es "(3, 5);" el 5 entre 3.
	    System.out.println("Es divisible por inversa: " + operador1.esDivisiblePorViceversa(2));
	    
	    operador1.sumarEnElMismoOperadorElPrimerNumeroTantasVecesComoDigaSuSegundoNumero();
	    // quisiera poner en un syso que diga "Se ha sumando el primer valor del primer numero hasta el valor del...
	   // segundo numero" + (y que imprima el segundo valor del num1, en este caso que diga 5 (del 3, 5 ).
	  // pero asi esta OK, era por saber y añadir mas cosas al ejercicio.  
	    
	}
    
}