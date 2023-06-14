package profesor.estatico;

public class A {
    private int valor;
    private static int contadorAes;

    public A(int valor){
        this.valor = valor;
        contadorAes++;
    }

    public int getContadorAes() {
        return contadorAes;
    }

    public int getValor() {
        return valor;
    }
}
