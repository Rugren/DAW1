package Cuentas;

public class MainCuentaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		CuentaBancaria c1 = new CuentaBancaria();
		CuentaBancaria c2 = new CuentaBancaria(1000);
		
		System.out.println(c1.getNumeroCuenta());
		System.out.println(c2.getNumeroCuenta());
		
		UsuarioBanco u1 = new UsuarioBanco("Pepe", "1234", 3);
		CuentaBancaria c3 = u1.getCuenta();
		System.out.println(c3.getNumeroCuenta());

		//

		UsuarioBanco pepe = new UsuarioBanco("Pepe", "1234");
		UsuarioBanco juan = new UsuarioBanco("juan", "3456");
	
		
		System.out.println(pepe.getCuenta().getSaldo);
		System.out.println(juan.getCuenta().getSaldo);
		System.out.println("-----------------------");
		
		System.out.println(juan.bizum(pepe, 20);
		System.out.println(pepe.getCuenta().getSaldo());
		System.out.println(juan.getCuenta().getSaldo());
		System.out.println("#########################");
		
		System.out.println(pepe.bizum(juan, 50);
		System.out.println(pepe.getCuenta().getSaldo());
		System.out.println(juan.getCuenta().getSaldo());
		System.out.println("#########################");

	}

}
