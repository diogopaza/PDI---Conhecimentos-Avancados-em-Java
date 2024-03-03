package br.com.diogo;

public class Principal {
    public static void main(String[] args) throws InterruptedException {        
        System.out.println("vou durmir por 5s");
        Thread.sleep(5000);
        System.out.println("acordei");
        /*ImprimiString imprimiString = new ImprimiString();
        Thread thread = new Thread(imprimiString, "Thread imprimi string");
        thread.start();*/
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("imprimindo String via Thread");
            }
            
        }).start();
        

    }
}
