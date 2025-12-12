public class ReteAlbero {
    Nodo[] mappa;

    public ReteAlbero(int dimensione) {
        mappa = new Nodo[dimensione];
    }

    public void aggiungiNodo(Nodo nodo) {
        for (int i = 0; i < mappa.length; i++) {
            if (mappa[i] == null) {
                mappa[i] = nodo;
                return;
            }
        }
    }

    public void stampaMappa() {
        for (Nodo nodo : mappa) {
            if (nodo != null) {
                System.out.println(nodo);
            }
        }
    }
}
