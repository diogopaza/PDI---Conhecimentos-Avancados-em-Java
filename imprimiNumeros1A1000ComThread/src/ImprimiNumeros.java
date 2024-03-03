public class ImprimiNumeros implements Runnable{

    String nomeThread; 
    Thread threadID;

    public ImprimiNumeros(){}    
    
    public ImprimiNumeros(String nomeThread){
        this.nomeThread = nomeThread;        
    }

    @Override
    public void run() {        
        int cont = 1;             
        if (this.nomeThread != null){
            while (cont <= 1000) {
                System.out.println("Estou na thread: " + nomeThread + " - " + cont);
                cont++;
            }
        }else{
            while (cont <= 1000) {
                System.out.println("Estou na thread: " + threadID.currentThread().getId() + " - " + cont);
                cont++;
            }
        }   
        
    }
    
}
