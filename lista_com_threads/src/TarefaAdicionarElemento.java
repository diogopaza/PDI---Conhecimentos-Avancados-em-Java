
public class TarefaAdicionarElemento implements Runnable {

    public Lista lista;
    public int numeroThread;

    public TarefaAdicionarElemento(Lista listaParametro, int numeroThread) {
        this.lista = listaParametro;
        this.numeroThread = numeroThread;
    }

    @Override
    public void run() {
       // synchronized (this) {
            for (int i = 0; i < 10; i++) {
                lista.adicionaElementos("Thread " + numeroThread + " - " + i);
            }
       // }
    }
}
