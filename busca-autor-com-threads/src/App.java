public class App {
    public static void main(String[] args) throws Exception {
        String nome = "da";
        Thread threadAssinatura1 = new Thread(new TarefaBuscaTextual("assinaturas1.txt", nome), "Thread Assinaturas 1"); 
        Thread threadAssinatura2 = new Thread(new TarefaBuscaTextual("assinaturas2.txt", nome), "Thread Assinaturas 2"); 
        Thread threadAssinatura3 = new Thread(new TarefaBuscaTextual("autores.txt", nome), "Thread Assinaturas 3"); 

        threadAssinatura1.start();
        threadAssinatura2.start();
        threadAssinatura3.start();
    }
}
