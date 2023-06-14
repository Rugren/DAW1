package Cosas_Inventadas;

//public class CuentaBancaria {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Enlace: https://www.arkaitzgarro.com/java/capitulo-15.html#uso-alternativo-de-this-como-referencia-al-parametro-implicito
		/**
		 * Declaracion de la clase CuentaBancaria
		 * Ejemplo de declaracion de variables
		 * metodos estaticos y uso de this
		 */

		public class CuentaBancaria {
		    // Atributos o variables miembro
		    private double saldo;
		    public static int totalCuentas=0;
		 
		    // Metodos
		    public CuentaBancaria() {
		        this(0.0);
		    }
		 
		    public CuentaBancaria( double ingreso ) {
		        saldo = ingreso;
		        incCuentas();
		    }
		 
		    public double saldo() {
		        return saldo;
		    }
		 
		    public static void incCuentas () {
		        totalCuentas++;
		    }

/*		    
		    // Transfiere todo el dinero de la cuenta origen a la actual
		     * 
		    public void transferencia( CuentaBancaria origen ) {
		        saldo += origen.saldo;
		        origen.saldo=0;
		    }
mejor hecho de la siguiente manera: */		 
		    
		    public void transferenciaSegura( CuentaBancaria origen ) {
		        // Test de verificacion: ¿destino igual a origen?
		        if ( this == origen )
		            return;
		     
		        saldo += origen.saldo;
		        origen.saldo=0;
		    }
		}
		
//	}

//}
