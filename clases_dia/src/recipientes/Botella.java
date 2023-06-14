package recipientes;

public class Botella {

	private String contenido; // era "private TipoContenido contenido;" que enlzaba a la Clase Enum; AGUA, TE, CAFE.
	private final float CAPACIDAD_MAXIMA = 300; 
	// Cuando pones "final" que no puede modificarse se pone en mayuscula y con barra baja para saber que no se modifica
	
	//private String material; (quitada para no poner mucha cosa, pero en funcion del material puede tener un precio u otro.)
	// A Hacer (To Do); Calcular el precio dependiendo del material de la botella. En función al material o la marca.

	// private String marca; (quitada para no poner mucha cosa)
	private float precio;
	// private String forma; (quitada para no poner mucha cosa)
	// private String color; (quitada para no poner mucha cosa)
	private Boolean abierta;
	private float cantidadMl;
	// private Boolean reciclada; (quitada para no poner mucha cosa)

	
	// CONSTRUCTOR: 
	// Se puede poner "String cont" en vez de "String contenido".
	// o incluso si pongo "float precio", el float precio no es el mismo el de arriba que este de ahora:
	// no hace falta que digamos al constructor (Boolean abierta) ya que siempre vendrá cerrada (el boolean false) 
	// tampoco hace falta "cantidadMl" ya que todas tienen lo mismo.
	public Botella (String cont, float precio) {
		this.abierta = false;
		this.contenido = cont;
		this.cantidadMl = CAPACIDAD_MAXIMA;
		this.precio = precio;
		
	}
	
	}

