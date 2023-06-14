package profesor.cuentas;

public class Cuenta {

    // Atributos
    private static int idCuenta = 1;
    private int numeroCuenta;
    private float saldo;

    // Constructores
    public Cuenta(float paramSaldo){
        this.numeroCuenta = idCuenta;
        idCuenta++;
        if (paramSaldo >= 5)
            this.saldo = paramSaldo;
        else
            this.saldo = 5;
    }
    
    // Esto editado yo en casa: (asi es como tenia el archivo de clase: "

    public Cuenta() {
        this.numeroCuenta = idCuenta;
        idCuenta++;
        this.saldo = 0;
    }

    // Métodos get y set
    public float getSaldo() {
        return saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0)
            this.saldo = saldo;
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

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", saldo=" + saldo +
                '}';
    }
}
