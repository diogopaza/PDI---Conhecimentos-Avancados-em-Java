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
                System.out.println("Estou na thread diferente NULL: " + nomeThread + " - " + cont + " idThread: " + threadID.currentThread());
                cont++;
            }
        }else{
            while (cont <= 1000) {
                System.out.println("Estou na thread igual NULL: " + threadID.currentThread().getId() + " - " + cont + " idThread: " + threadID);
                cont++;
            }
        }   
        
    }
    
}
