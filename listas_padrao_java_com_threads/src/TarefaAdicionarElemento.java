import java.util.List;

public class TarefaAdicionarElemento implements Runnable {

    List<String> lista;
    private int numeroThread;

    public TarefaAdicionarElemento(List<String> listaParametro, int numeroThread) {
        this.lista = listaParametro;
        this.numeroThread = numeroThread;
    }

    @Override
    public void run() {            
            for (int i = 0; i < 10; i++) {
                lista.add("Thread " + numeroThread + " - " + i);                
            }   
            
    }
}

