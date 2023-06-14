package profesor.operadores;

public class Operador {

    private Operacion operacion;

    public int sumar(int n1, int n2){
        return n1 + n2;
    }

    public int restar(int n1, int n2){
        return n1 - n2;
    }

    public int multiplicar(int n1, int n2){
        return n1 * n2;
    }

    public float multiplicar(float n1){
        return n1 * 5;
    }

    public int dividir(int n1, int n2) {
        if (n2 == 0)
            return 0;
        return n1/n2;
    }
}
