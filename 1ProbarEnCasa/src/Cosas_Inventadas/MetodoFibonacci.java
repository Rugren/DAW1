package Cosas_Inventadas;

public class MetodoFibonacci {

	public static int fibonacci(int n) {

		// Como lo hico el profesor en clase, ver foto 14/02/23

		if (n <= 2)
			return 1;
		return fibonacci(n -1) + fibonacci(n -2);
		// en la foto no se ve bien si es un + o un *. 
		// Probar a ver si sale bien.
		

		
	}

}
