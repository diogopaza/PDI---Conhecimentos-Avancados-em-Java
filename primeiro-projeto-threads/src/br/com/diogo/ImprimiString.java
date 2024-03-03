package br.com.diogo;

public class ImprimiString implements Runnable{

    @Override
    public void run() {
        System.out.println("imprimindo String via Thread");
    }
    
}
