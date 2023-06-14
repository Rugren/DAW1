package Cuentas;

public class UsuarioBanco {
	
	private String nombre;
	private String pass;
	private String usuario;
	private String password;

	public UsuarioBanco(String nombre, String pass, CuentaBancaria cuenta) {
		this.registro(nombre, pass);
		this.CuentaBancaria = cuenta;
	}
	
	public UsuarioBanco(String nombre, String pass) {
		this.usuario = nombre;
		this.password = pass;
		this.CuentaBancaria = new CuentaBancaria();
	}
		
	public UsuarioBanco(String nombre, String pass, float saldo) {
		this.usuario = nombre;
		this.password = pass;
		this.CuentaBancaria = new CuentaBancaria(saldo);
	}
	
	private void registro
	
	public cuenta getCuenta
	
	
	public boolean bizum (Usuario usuarioReceptor, float cantidad){
		float cantidadActualCuenta = this.cuenta.getSaldo() - cantidad;
		
		if (cantidadActualCuenta < 0)
			return false;
		else {
			this.CuentaBancaria.setSaldo(cantidadActualCuenta);
			float saldoAntiguo = usuarioReceptor.getCuenta().setSaldo();
			usuarioReceptor.getCuentaBancaria().setSaldo(saldoAntiguo + cantidad);
			return true;
		}
	}

}
