package profesor.recipientes;

// Completa todos los TODO indicados en el fichero. La clase Botella no tiene el atributo precio, este se calcula
// mediante el método calcularPrecio, que debéis modificar.
public class Botella {

    // Atributos
    // TODO: TipoContenido es un enumerado con tres opciones [AGUA, TE, CAFE], debemos crearlo.
    private TipoContenido contenido;
    private final float CAPACIDAD_MAXIMA = 300;
    private Boolean abierta;
    private float cantidadMl;

    // Constructor
    public Botella(TipoContenido cont){
        this.abierta = false;
        this.contenido = cont;
        this.cantidadMl = this.CAPACIDAD_MAXIMA;
    }

    //TODO: El constructor sin parámetros debe crear una botella cerrada, con agua.
    public Botella(){

    }

    // TODO: Crea todos los métodos get y set, para cada uno de los campos.

    //TODO: Calcular el precio dependiendo del material de la botella
    // La fórmula para calcular el precio es: CAPACIDAD_MAXIMA/100 * valorContenido
    // siendo valorContenido -> 0.5 para AGUA, 0.75 para TE y 0.8 para CAFE
    private float calcularPrecio(){
        return 0;
    }

    //TODO: Este método debe abrir la botella, se debe comprobar si la botella está abierta para poder cerrarla
    // y si está cerrada para poder abrirla. Por ejemplo: si una botella está abierta ya, abrirBotella debe decirnos
    // que NO HA PODIDO ABRIRLA (por ello devuelve un boolean).
    private boolean abrirBotella(){
        return true;
    }

    private boolean cerrarBotella(){
        return true;
    }

    // TODO: Crea el método consumirLiquido, que reciba como parámetro la cantidad de ml que quieres consumir
    // El método debe devolver el número de ml que ha podido consumir de la botella.
    // Ejemplo: Si la botella tiene de contenido 40 ml e intentas consumir 50, la botella quedará a 0 ml pero se
    // habrán podido consumir solo 40, que son los ml que debemos devolver en el método.
    private int consumirLiguido(){
        return 0;
    }
}
