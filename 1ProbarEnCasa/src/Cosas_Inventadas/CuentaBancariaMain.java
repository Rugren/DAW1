package Cosas_Inventadas;
	
		/**
		 * Ejemplo de uso de la clase CuentaBancaria
		 */
		
		public class CuentaBancariaMain {
// se llamaba public class PruebaCuentaBancaria {		
			
		    public static void main (String [] args) {
		        System.out.println("(Syso1) Total cuentas: " + CuentaBancaria.totalCuentas);
		        CuentaBancaria c1;
		        c1 = new CuentaBancaria(17.5);
		 
		        System.out.println("(Syso2) Nueva cuenta con: " + c1.saldo() + " euros");
		        System.out.println("(Syso3) Total cuentas: " + CuentaBancaria.totalCuentas);
		 
		        CuentaBancaria c2;
		        c2 = new CuentaBancaria(20.0);
		        System.out.println("(Syso4) Nueva cuenta con: " + c2.saldo() + " euros");
		        System.out.println("(Syso5) Total cuentas: " + CuentaBancaria.totalCuentas);
		        System.out.println("(Syso6) Transferencia de cuenta 2 a cuenta 1");
		        
/*		        c1.transferencia(c2);
		        System.out.println("(Syso7) Cuenta 1 con: " + c1.saldo() + " euros");
		        System.out.println("(Syso8) Cuenta 2 con: " + c2.saldo() + " euros");
mejor hecho de la siguiente manera: */		
		        
		        
		        c1.transferenciaSegura(c2);
		        System.out.println("(Syso7) Cuenta 1 con: " + c1.saldo() + " euros");
		        System.out.println("(Syso8) Cuenta 2 con: " + c2.saldo() + " euros");

	}

}
