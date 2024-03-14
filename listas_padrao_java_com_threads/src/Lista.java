import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lista {
    private String[] elementos = new String[1000];
    private int indice = 0;
    private Lock lock = new ReentrantLock();

    public /*synchronized*/ void adicionaElementos(String elemento) {
        lock.lock();
        this.elementos[indice] = elemento;
        this.indice++;
        lock.unlock();
    }

    public int tamanho() {
        return this.elementos.length;
    }

    public String pegaElemento(int posicao) {
        return this.elementos[posicao];
    }
}
