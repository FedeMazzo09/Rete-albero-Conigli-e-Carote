public class ReteAlbero {
    private Nodo mappa[];

    public ReteAlbero(int dimensione) {
        mappa = new Nodo[dimensione];
    }

    public void inserisci(int indice, Nodo.Simbolo simbolo) {
        if (indice >= 0 && indice < mappa.length) {
            mappa[indice] = new Nodo(0, 0, null, simbolo);
        }
    }

}
