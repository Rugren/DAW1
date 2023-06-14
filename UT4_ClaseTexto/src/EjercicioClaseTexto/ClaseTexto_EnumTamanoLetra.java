package EjercicioClaseTexto;

public enum ClaseTexto_EnumTamanoLetra {

	tamanoPequeno(12), tamanoMediano(14), tamanoGrande(16), tamanoMuyGrande(18);
	private final int tamanoLetra;
	
	ClaseTexto_EnumTamanoLetra (int tamanoLetra) {
		this.tamanoLetra = tamanoLetra;
	}
	
	public int retornarTamanoLetra() {
		return tamanoLetra;
	}
	
}




/*public enum Mes {
    ENERO(1), FEBRERO(2), MARZO(3), ABRIL(4), MAYO(5), JUNIO(6), JULIO(7), AGOSTO(8), SEPTIEMBRE(9), OCTUBRE(10),
    NOVIEMBRE(11), DICIEMBRE(12);
    private final int numero;

    Mes(int numero) {
        this.numero = numero;
    }

    public int retornarNumero() {
        return numero;
    }

}
*/

//Esto poner similar en el Main para que se vea el tamaño de letra.
/* public class PruebaEnum {
    public static void main(String[] ar) {
        Mes mes1 = Mes.AGOSTO;
        System.out.print(mes1 + " " + mes1.retornarNumero()); // AGOSTO 8
    }
}
*/
