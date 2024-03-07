
public class Tarefa1 implements Runnable{

    private Banheiro banheiro;    

    public Tarefa1(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        try {
            this.banheiro.fazNumero1();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
