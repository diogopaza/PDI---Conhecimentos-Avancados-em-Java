public class Worker implements Runnable{

    String nome;
    Thread thread;    

    public Worker(String nome){
        this.nome = nome;        
    }

    @Override
    public void run() {
        System.out.println("********** Iniciando a " + thread.currentThread().getName()); 
        try {
            thread.currentThread().sleep(2000);
            System.out.println("Finalizando " + thread.currentThread().getName()); 
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }                    
    }    
}
