
public class Tarefa2 implements Runnable{
    private Banheiro banheiro;    

    public Tarefa2(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        try {
            this.banheiro.fazNumero2();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
