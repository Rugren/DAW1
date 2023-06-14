package Cuentas;

// es el archivo que subi� el profesor "Cuenta", le hemos a�adido nuevas cosas 23/01/2023.

/* COGER ESTE:
el de: ppackage profesor.cuentas; +++
el de: public class Cuenta { +++
*/

public class CuentaBancaria {

    // Atributos
	
	private static int idCuenta = 1;
	private int numeroCuenta;
	private float saldo;

    private String titular;

    // Constructores
    
    public CuentaBancaria(float paramSaldo){
        this.numeroCuenta = idCuenta;
        idCuenta++;
        if (paramSaldo < 0)
            this.saldo = 0;
        else
            this.saldo = paramSaldo;
    }
    
    public CuentaBancaria() {
    	this.numeroCuenta = idCuenta;
    	idCuenta++;
    	this.saldo = 0;
    }
    
    public float getSaldo() { 
    	return saldo; 
    	}
    
    
    
    
    
    // /// /// ///
    
   


    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    // Métodos get y set
    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0)
            this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Métodos funcionales
    public boolean ingreso(int cantidadAIngresar){
        if (cantidadAIngresar >= 5 && cantidadAIngresar <= 500){
            this.saldo += cantidadAIngresar;
            return true;
        }
        return false;
    }

    public boolean reintegro(int cantidadAReintegrar){
        if (cantidadAReintegrar <= this.saldo &&
            cantidadAReintegrar >= 5 &&
            cantidadAReintegrar <= 500) {
            this.saldo -= cantidadAReintegrar;
            return true;
        }
        return false;
    }

    public boolean transferencia(int cantidadTransferencia, Cuenta c){
        if (cantidadTransferencia <= this.saldo &&
                cantidadTransferencia >= 5 &&
                cantidadTransferencia <= 500) {
            this.saldo -= cantidadTransferencia;
            c.saldo += cantidadTransferencia;
            return true;
        }
        return false;
    }


}
