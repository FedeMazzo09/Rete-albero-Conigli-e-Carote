public class Nodo {
    private int riga;
    private int numero;
    private Nodo genitore;
    private Simbolo simbolo;

    enum Simbolo {
        EMPTY,
        CARROT,
        RABBIT,
        LOCK
    }

    public Nodo(int riga, int numero, Nodo genitore, Simbolo simbolo) {
        this.riga = riga;
        this.numero = numero;
        this.genitore = genitore;
        this.simbolo = simbolo;
    }

    public String toString() {
        return "Nodo [riga=" + riga + ", numero=" + numero + ", genitore=" + genitore + ", simbolo=" + simbolo + "]";
    }
}
