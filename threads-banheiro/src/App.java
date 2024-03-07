public class App {
    public static void main(String[] args) throws Exception {
        Banheiro banheiro = new Banheiro();
        Thread convidado1 = new Thread(new Tarefa1(banheiro), "Joao");
        Thread convidado2 = new Thread(new Tarefa2(banheiro), "Pedro");
        Thread convidado3 = new Thread(new Tarefa1(banheiro), "Ana");
        Thread convidado4 = new Thread(new Tarefa2(banheiro), "Maria");

        convidado1.start();
        convidado2.start();
        convidado3.start();
        convidado4.start();

    }
}
