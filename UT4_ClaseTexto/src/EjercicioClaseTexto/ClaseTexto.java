package EjercicioClaseTexto;

public class ClaseTexto {

	private ClaseTexto_EnumColor colorLetra;
	private ClaseTexto_EnumTamanoLetra tamanoLetra;
	private ClaseTexto_EnumTipografia tipografia;
	private String negrita;
	private String subrayada;
	private String tachada;
	
	private String contenidoTexto;
	
	public ClaseTexto (
			ClaseTexto_EnumColor color, 
			ClaseTexto_EnumTamanoLetra tamano, 
			ClaseTexto_EnumTipografia tipografia,
//			String negrita,
//			String subrayada,
//			String tachada
			String contenidoTexto
			) {
		this.colorLetra = color;
		this.tamanoLetra = tamano;
		this.tipografia = tipografia;
		this.negrita = negrita;
		this.subrayada = subrayada;
		this.tachada = tachada;
		this.contenidoTexto = contenidoTexto;
	}
	
	public ClaseTexto_EnumColor colorLetra(ClaseTexto_EnumColor colorletra){
		return colorLetra;
	}
	
	
		
		


}


