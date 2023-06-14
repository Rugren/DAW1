
public class E1_A4_Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1.	Tenemos dos variables (x e y). Son dos variables numéricas, ambas entre 20 y 30. 
		 * Queremos crear otra variable a la que asignar el valor de la mayor de ambas variables (x e y). 
		 * Crea un IF para ello.
		 * Si son iguales guarda el valor de cualquiera de las dos variables.
		 */
	
		
		int x = 20;
		int y = 30;
	
		int variableMayor;
		
		if (x > y) {
			variableMayor = x;
			System.out.println(variableMayor);
		}
		
		if (y > x) {
			variableMayor = y;
			System.out.println(variableMayor);
		}
		
		if (x == y) {
			variableMayor = y;
			System.out.println(variableMayor);
		}	

	/* ¿Así tambien valdría?
		int x = 20;
		int y = 30;
	
		int iguales;
		
		if (x > y) {
			System.out.println(x);
		}
		
		if (y > x) {
			System.out.println(y);
		}
		
		if (x == y) {
			System.out.println(y);
		}
	*/	

		
		/*
		 * 		else {
			variableMayor = 0; //que sea igual a lo mismo x == y, que devuelva una de las 2. ¿Algo así o está bien?
			System.out.println(variableMayor);
		}

		 */
		
		// if x es menor que 20 que no se pueda?
		// if y es mayor que 30 que no se pueda?
		
		

		
	}

}
