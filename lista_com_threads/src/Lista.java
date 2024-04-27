import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lista {
    private String[] elementos = new String[100];
    private int indice = 0;
    private Lock lock = new ReentrantLock();

    public void adicionaElementos(String elemento) {       
      synchronized(this){
        this.elementos[indice] = elemento;
        this.indice++;  
      }            
    }

    public int tamanho() {
        return this.elementos.length;
    }

    public String pegaElemento(int posicao) {
        return this.elementos[posicao];
    }
}
