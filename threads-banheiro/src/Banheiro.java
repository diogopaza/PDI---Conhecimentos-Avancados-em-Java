import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banheiro {

    private Lock lock = new ReentrantLock();
    private Boolean ehSujo = true;

    private String[] elementos = new String[1000];
    private int indice = 0;
    private Lock lock2 = new ReentrantLock();

    public /* synchronized */ void adicionaElementos(String elemento) {
        lock2.lock();
        this.elementos[indice] = elemento;
        this.indice++;
        lock2.unlock();
    }

    public int tamanho() {
        return this.elementos.length;
    }

    public String pegaElemento(int posicao) {
        return this.elementos[posicao];
    }

    public void fazNumero1() throws InterruptedException {
        // lock.lock();
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " batendo na porta");
        synchronized (this) {
            System.out.println(nome + " entrando no banheiro");
            if(ehSujo){
                esperaLaFora(nome);
            }            
            System.out.println(nome + " fazendo coisa rapida");
            Thread.sleep(3000);
            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando as maos");
            System.out.println(nome + " saindo do banheiro");
            ehSujo = true;
            System.out.println("Banheiro esta sujo - " + ehSujo);
        }
        // lock.unlock();

    }

    public void fazNumero2() throws InterruptedException {
        //lock.lock();
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " batendo na porta");
        synchronized (this) {
            System.out.println(nome + " entrando no banheiro");
            if(ehSujo){
                esperaLaFora(nome);
            }   
            System.out.println(nome + " fazendo coisa demorada");
            Thread.sleep(5000);
            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando as maos");
            System.out.println(nome + " saindo do banheiro");
            ehSujo = true;
            System.out.println("Banheiro esta sujo - " + ehSujo);
        }
        //lock.unlock();
    }

    private void esperaLaFora(String nome) throws InterruptedException {
        System.out.println(nome + ", eca, banheiro tá sujo");
        if (ehSujo) {            
            this.wait();
        }
    }

    public void limpa() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " batendo na porta");
        synchronized (this) {
            if (!ehSujo) {
                System.out.println(nome + " entrando banheiro");
                System.out.println(nome + " banheiro esta limpo, vou sair");
                return;
            }
            System.out.println(nome + " entrando banheiro");
            System.out.println(nome + " limpando banheiro");
            ehSujo = false;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            this.notifyAll();
            System.out.println(nome + " saindo do banheiro");
        }
    }
}
