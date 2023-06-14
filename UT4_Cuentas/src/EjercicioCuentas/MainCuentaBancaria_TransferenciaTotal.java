package EjercicioCuentas;

public class MainCuentaBancaria_TransferenciaTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Este es un EJEMPLO creado para practicar y probar el contador y saber como se hace la TRANSFERENCIA TOTAL DE LA CUENTA.
		// Hecho yo aparte por mi cuenta, no lo pide el ejercicio.
		
				System.out.println("TRASPASO TOTAL DE UNA CUENTA A OTRA: -transferenciaTotal- ");
				
		        System.out.println("(Syso1) Total cuentas: " + CuentaBancaria.totalCuentas);
		        
		        CuentaBancaria c1 = new CuentaBancaria("Ruben", "000010",17.50);
		     
		        
		        
		        System.out.println("(Syso2) Nueva cuenta " + c1.getNumeroDeCuenta() + " de " + c1.getNombreCliente() + " con: " + c1.getSaldo() + " euros");
		        System.out.println("(Syso3) Total cuentas: " + CuentaBancaria.totalCuentas);

		        CuentaBancaria c2 = new CuentaBancaria("Pedro", "000011", 20.00);
		        System.out.println("\n(Syso4) Nueva cuenta " + c2.getNumeroDeCuenta() + " de " + c2.getNombreCliente() + " con: " + c2.getSaldo() + " euros");
		        System.out.println("(Syso5) Total cuentas: " + CuentaBancaria.totalCuentas);
		        
		        
		        // Transferencia total de la cuenta c2 a la cuenta c1.
		        c1.transferenciaTotal(c2);
		        //1.1 cambiar aqui abajo el "2(c2)" por el get o setNombreCuenta que me la devuelva su nombre (hacer los get y set...
		        //1.2 ... para que así coja el nombre y diga TRANSFERENCIA DE "usuario(nombre del tio)" a cuenta "nombre usuario2"
		        System.out.println("\n(Syso6) Transferencia total de la cuenta " + c2.getNombreCliente() + " a la cuenta " + c1.getNombreCliente());
		        System.out.println("(Syso7) Cuenta " + c1.getNumeroDeCuenta() + " de " + c1.getNombreCliente() + " con: " + c1.getSaldo() + " euros");
		        System.out.println("(Syso8) Cuenta " + c2.getNumeroDeCuenta() + " de " + c2.getNombreCliente() + " con: " + c2.getSaldo() + " euros");



		
	}

}
