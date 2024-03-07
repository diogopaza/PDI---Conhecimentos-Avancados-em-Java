public class App {
    public static void main(String[] args) throws Exception {
        Worker worker1 = new Worker("teste 1");
        Worker worker2 = new Worker("teste 2");
        Worker worker3 = new Worker("teste 3");
        Worker worker4 = new Worker("teste 4");
        Worker worker5 = new Worker("teste 5");
        Thread thread1 = new Thread(worker1, "Threade Worker1");
        Thread thread2 = new Thread(worker2, "Threade Worker2");
        Thread thread3 = new Thread(worker3, "Threade Worker3");
        Thread thread4 = new Thread(worker4, "Threade Worker4");
        Thread thread5 = new Thread(worker5, "Threade Worker5");
        thread1.start();        
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
