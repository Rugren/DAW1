
public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ejercicio 1 (Con ternarios)
		int numero = -10;
		
		String valorAbsoluto1 = (numero < 0 ) ? "Valor Absoluto: " + (numero *-1) : "Valor Negativo: " + numero;
		System.out.println(valorAbsoluto1);

		
		// Ejercicio 1 (Con If y Else)
		int valorAbsoluto = -10;
		if (valorAbsoluto < 0) {
			valorAbsoluto = valorAbsoluto * -1;
			System.out.println("El valor absoluto es: " + valorAbsoluto);
		}
		else {
			valorAbsoluto = valorAbsoluto;
			System.out.println("El valor absoluto es el mismo: " + valorAbsoluto);
			}
		
		
		
		
		
	}

}
