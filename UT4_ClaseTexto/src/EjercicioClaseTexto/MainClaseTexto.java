package EjercicioClaseTexto;

public class MainClaseTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ClaseTexto t1;
//		t1 = new ClaseTexto(ClaseTexto_EnumColor.ROJO, ClaseTexto_EnumTamanoLetra.tamanoMediano, ClaseTexto_EnumTipografia.Arial);
		
// es la misma forma de hacerlo que el anterior, solo que en una linea de codigo.
//		ClaseTexto t1 = new ClaseTexto(ClaseTexto_EnumColor.ROJO, ClaseTexto_EnumTamanoLetra.tamanoMediano, ClaseTexto_EnumTipografia.Arial);

		ClaseTexto t1 = new ClaseTexto(ClaseTexto_EnumColor.ROJO, ClaseTexto_EnumTamanoLetra.tamanoMediano, ClaseTexto_EnumTipografia.Arial, "Ruben Garcia Ruiz");
		ClaseTexto t2 = new ClaseTexto(ClaseTexto_EnumColor.AZUL, ClaseTexto_EnumTamanoLetra.tamanoPequeno, ClaseTexto_EnumTipografia.ArialBlack, "48703997W");
		ClaseTexto t3 = new ClaseTexto(ClaseTexto_EnumColor.AMARILLO, ClaseTexto_EnumTamanoLetra.tamanoMuyGrande, 
		ClaseTexto_EnumTipografia.TimesNewRoman, "Vamos a crear una nueva clase Texto que represente la letra usada en una aplicación como LibreOffice Writer u Office Word.");
		
		//System.out.println(t1.getColorLetra);
		
		// cambiar el color del dni a rojo?
		// motrar caracteristicas del texto colo amarillo
	}

}
