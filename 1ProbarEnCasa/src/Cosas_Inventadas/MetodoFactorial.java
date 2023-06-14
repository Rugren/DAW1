package Cosas_Inventadas;

public class MetodoFactorial {

	public static int factorial(int n) {
		
		// Como lo hico el profesor en clase, ver foto 14/02/23
		
		if (n == 0 || n == 1)
			return 1;
		return n*factorial(n -1);
		
		
		
	}

}
