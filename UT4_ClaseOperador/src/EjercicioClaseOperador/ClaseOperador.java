package EjercicioClaseOperador;

public class ClaseOperador {
	
	/*
	//Sumas, restas, multiplicaciones y divisiones.
	
	 */
	
	// elegimos 2 numeros (un num1 y un num2) para los Getters y setters
	// El profesor dice que ya no usemos scanner para pedir a un usuario que ponga los numeros. Ahora todo con el get y el set.
	
    private int num1;
    private int num2;
    
    public ClaseOperador(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //get y set del num1 (nuestro numero1)
    public int getNum1() {
        return num1;
    }
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    //get y set del num2 (nuestro numero2)
    public int getNum2() {
        return num2;
    }
    
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    
	//Sumar, restar, multiplicar y dividir.  
    
    public int sumar() {
        return num1 + num2;
    }
    
    public int restar() {
        return num1 - num2;
    }
    
    public int multiplicar() {
        return num1 * num2;
    }
    
    public double dividir() {
        if(num2 == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        return (double) num1 / num2;
    }
    
    
    /*
	Metodo para mostrar los 2 numeros, es decir, entre el primero y el segundo.
	por ejemplo, en este ejercicio tenemos el primer numero(num1) el 3 y el segundo numero(num2) el 5.
	tiene que mostrar en este caso 3, 4, 5.
    */
    
    public void mostrarNumerosEntreNum1yNum2() {
        for(int i = num1; i <= num2; i++) {
            System.out.print(i + "\n ");
        }
    }
    
/*	esta mal porque asi lo que hace es el primer numero de num1 lo divide entre el segundo numero de num2.
 *     public boolean esDivisiblePorNum2(int num2) {
        return num1 % num2 == 0;
    }
 */
    
// y porque no habria que poner aqui: "private int num;" para el "num" siguiente???
	public boolean esDivisiblePor(int num) {
		return num1 % num == 0;
	}
    
    // hay que poner inverso, es decir, que la division sea divisible a la inversa, viceversa.
/* mal: (corregido abajo)
 *     public boolean esDivisiblePorNum1(int num1) {
        return num2 % num1 == 0;
    }
 */
	public boolean esDivisiblePorViceversa(int num) {
		return num2 % num == 0;
	}
    
    
    // sumar el primer número tantas veces como indique el segundo.
    // Si el primer número es 5 y el segundo es 3, debemos sumar 5 + 5 + 5 e imprimir 3 líneas como siguen.
    
    public void sumarEnElMismoOperadorElPrimerNumeroTantasVecesComoDigaSuSegundoNumero() {
 //     for(int i = num1; i <= num2; i++) el num1 estaria mal esto? Abajo habria que cambiar el *i no?
    	// este si esta OK:
        for(int i = 1; i <= num2; i++) 
        {
            System.out.println(num1 * i);
        }
    }
    
    
    // Suma el primer valor del primer Operador creado con el segundo valor del
	// segundo Operador y muestra el resultado por pantalla (utiliza los
	// operadores get para obtener dichos valores y después sumarlos).
// Suma del primer valor del num1 + suma del segundo valor del num2:

    
    // no se si es algo asi (no probado):
 /*   public int sumaPrimerValorNum1MasSumaDelSegundoValorNum2() {
        return num1 + num2;
    }
    
    public void sumaPrimerValorNum1MasSumaDelSegundoValorNum2(int getNum2) {
        this.num2 = num2;
    }
*/    

}
