package Objetos;

public class Banco {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*	
		private float saldo = 1200.36f;
		
		public boolean ingresar(float cantidad) {
		if(cantidad > 600)
			return false;
		if (cantidad < 5)
			return false;
		this.saldo += cantidad;
		}
*/
	
		
		// para que nos devuelva un String: 
		
		private float saldo = 1200.36f;
		
		public String ingresar(float cantidad) {
		if(cantidad > 600)
			return "Usted + 600";
		if (cantidad < 5)
			return "Usted -5";
		this.saldo += cantidad;
		return true;
		}

		
		// otro ejemplo, antes ingresar, ahora sacar.
		public boolean sacar(float cantidad) {
			if(cantidad > this.saldo)
				return false;
			if (cantidad > 500) //cantidad máxima que puede sacar
				return false;
			if (cantidad < 5) //cantidad mínima que puede sacar.
				return false;
			this.saldo -= cantidad;
				return true;
		}
	

}
