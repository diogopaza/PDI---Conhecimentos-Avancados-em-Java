import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banheiro {

    private Lock lock = new ReentrantLock();

    public void fazNumero1() throws InterruptedException {
        lock.lock();
            String nome = Thread.currentThread().getName();
            System.out.println(nome + " batendo na porta");
            // synchronized (this) {
            System.out.println(nome + " entrando no banheiro");
            System.out.println(nome + " fazendo coisa rapida");
            Thread.sleep(5000);
            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando as maos");
            System.out.println(nome + " saindo do banheiro");
            // }
        lock.unlock();

    }

    public void fazNumero2() throws InterruptedException {
        lock.lock();
            String nome = Thread.currentThread().getName();
            System.out.println(nome + " batendo na porta");
            // synchronized (this) {
            System.out.println(nome + " entrando no banheiro");
            System.out.println(nome + " fazendo coisa demorada");
            Thread.sleep(10000);
            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando as maos");
            System.out.println(nome + " saindo do banheiro");
        // }
        lock.unlock();
    }
}
