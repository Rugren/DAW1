package EjercicioCuentas;


public class CuentaBancaria {
	
	private String nombreCliente;
	private String numeroDeCuenta;
	private double tipoDeInteres;
	
//	private double saldoInicial = 0.00;

    private double saldo;
    private double ingreso;
    private double reintegro;
    public static int totalCuentas = 0; // si lo pongo private no va en el Main
    
    private double transferencia;
    

    
    // Metodos
/*    public CuentaBancaria(float saldoInicial) {
        this.saldoInicial = 0.00f;
    }

   public CuentaBancaria() {
        this(0.00);
    }
*/ 
    
   public CuentaBancaria(String nombreCliente, String numeroDeCuenta, double saldo) {
	   this.nombreCliente = nombreCliente;
	   this.numeroDeCuenta = numeroDeCuenta;
//	   this.saldoInicial = 0.00;
	   this.saldo = saldo;
	   //Si ponemos "this.saldo = 0;" nos cambiaria luego el saldo de la cuenta, por eso hemos creado saldoInicial.
       this.tipoDeInteres = 1.5; // Vamos a poner un interes fijo para todas las cuentas.
       nuevaCuentaBancaria();
    }

    
/*    public double saldoInicial() {
        return saldoInicial;
    }    
*/
    
    
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }
    
    public String getNumeroDeCuenta() {
    	return numeroDeCuenta;
    }
    public void setNumeroDeCuenta(String numeroDeCuenta){
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
    public double getTipoDeInteres() {
        return tipoDeInteres;
    }
    public void setTipoDeInteres(double tipoDeInteres){
        this.tipoDeInteres = tipoDeInteres;
    }
  
/*    
    public double getSaldoInicial() {
        return saldoInicial;
    }
    public void setSaldoInicial(double saldoInicial){
        this.saldoInicial = saldoInicial;
    }
*/ 
    
    // SALDO:
    public double getSaldo() {
        return saldo;
    }
    
// Asi BIEN. Si salen problemas al probar cosas activar este de nuevo.   
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

/* 2 VARIACIONES, que no sabemos si estan bien o no.
 * 
    public void setSaldo(double saldo){
        this.saldo = saldo + ingreso - reintegro;
    }    
    public void setSaldo(double saldo){
        this.saldo = saldo + ingreso;
        this.saldo = saldo - reintegro;
    }
*/

    
    // INGRESOS: 
    public double getIngreso() {
        return ingreso;
    }
    public void setIngreso(double ingreso){
        this.ingreso = ingreso;
    }
    
    public boolean ingreso (double saldo){
    	if (saldo >= 5) // que pueda meter minimo 5 euros a ingresar en la cuenta.
    		return true;
    	else
    		this.saldo += saldo;
    	System.out.println("Debes ingresar minimo 5 euros");
    		return false;
    }
/*    asi estaba:
 * public boolean ingreso (double saldo){
    	if (saldo > 0.01) // que pueda meter minimo 1 centimo a ingresar en la cuenta.
    		return false;
    	else
    		this.saldo += saldo;
    	return true;
    } */
    
    // este "public void ingreso" creo que no utilizado
    public void ingreso(CuentaBancaria ingresos) {
    	if (this == ingresos)
        return;
    	saldo = saldo + ingresos.ingreso;
    	ingresos.ingreso = saldo + ingreso;
    }

    
    // REINTEGRO:
/*    reintegro creo que mal hecho
    public boolean reintegro (double saldo){
    	if (this.saldo >= saldo)
    		return false;
    	else
    		this.saldo -= saldo;
    	return true;
    }
*/
    // Reintegro (mejorado y bien hecho)
    public boolean reintegro(double cantidadAReintegrar){
        if (cantidadAReintegrar <= this.saldo &&
            cantidadAReintegrar >= 5 && 	// minimo para retirar
            cantidadAReintegrar <= 600) {	// maximo para retirar
            this.saldo -= cantidadAReintegrar;
            return true;
        }
        System.out.println("Debes tener minimo 5 euros en la cuenta para retirar dinero");
        return false;
    }
    
    public double getReintegro() {
        return reintegro;
    }
    public void setReintegro(double reintegro){
        this.reintegro = reintegro;
    }
    
    public void reintegro(CuentaBancaria reintegrar) {
    	if (this == reintegrar)
        return;
    	saldo = saldo + reintegrar.reintegro;
    	reintegrar.reintegro = saldo - reintegro;
    }
    

    
    // TRANSFERENCIA:
    public void transferencia(CuentaBancaria transferir) {
    	if (this == transferir)
        return;
    	saldo = saldo + transferir.transferencia;
    	transferir.transferencia = saldo + transferencia;
    }
   
    public double getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(float saldo) {
        if (saldo >= 0)
            this.transferencia = transferencia;
    }
    
    
    
    public static void nuevaCuentaBancaria() {
    	totalCuentas++;
    }
 /*   esta puesto arriba como public: public static int totalCuentas, pero con el get luego no los puedo coger en los Main.
    public double getTotalCuentas() {
        return totalCuentas;
    }
    public void setTotalCuentas(int totalCuentas){
        this.totalCuentas = totalCuentas;
    }
*/
    
    
// _______________________________________________________________    

/*		    
    // Transfiere todo el dinero de la cuenta origen a la actual
    
    public void transferenciaTotal(CuentaBancaria origen) {
        saldo += origen.saldo;
        origen.saldo=0;
    }
mejor hecho de la siguiente manera: 
*/		 
    
    // Hecho yo a parte por mi cuenta, no lo pide el ejercicio.
    public void transferenciaTotal(CuentaBancaria origen) {
        if (this == origen)
        return;
        saldo += origen.saldo;
        origen.saldo=0; //se queda en 0 si le transferimos todo.
    }
    
 // _______________________________________________________________    



}
