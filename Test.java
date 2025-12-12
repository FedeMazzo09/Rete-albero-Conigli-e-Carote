public class Test {
    static void main(String[] args) {
        ReteAlbero rete = new ReteAlbero(10);

        Nodo nodo1 = new Nodo(0, 0, null, Nodo.Simbolo.EMPTY);
        Nodo nodo2 = new Nodo(1, 0, nodo1, Nodo.Simbolo.EMPTY);
        Nodo nodo3 = new Nodo(1, 1, nodo1, Nodo.Simbolo.LOCK);
        Nodo nodo4 = new Nodo(1, 2, nodo1, Nodo.Simbolo.EMPTY);
        Nodo nodo5 = new Nodo(2, 0, nodo2, Nodo.Simbolo.RABBIT);
        Nodo nodo6 = new Nodo(2, 1, nodo2, Nodo.Simbolo.EMPTY);
        Nodo nodo7 = new Nodo(2, 2, nodo2, Nodo.Simbolo.EMPTY);
        Nodo nodo8 = new Nodo(3, 0, nodo5, Nodo.Simbolo.CARROT);
        Nodo nodo9 = new Nodo(3, 1, nodo6, Nodo.Simbolo.RABBIT);

        rete.aggiungiNodo(nodo1);
        rete.aggiungiNodo(nodo2);
        rete.aggiungiNodo(nodo3);
        rete.aggiungiNodo(nodo4);
        rete.aggiungiNodo(nodo5);
        rete.aggiungiNodo(nodo6);

        rete.stampaMappa();
    }
}
