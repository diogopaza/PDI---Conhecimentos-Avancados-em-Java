public class App {
    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        Lista lista = new Lista();

        for (int i = 0; i < 10; i++) {
            new Thread(new TarefaAdicionarElemento(lista, i)).start();
            // Thread.sleep(2000);

        }
        new Thread(new TarefaImprimir(lista)).start();       
        
        /*
         * for (int i = 0; i < 10; i++) {
         * var tarefa = new TarefaAdicionarElementoSemThread(lista, i);
         * for (int y = 0; y < tarefa.lista.tamanho(); y++) {
         * System.out.println(y + " - " + lista.pegaElemento(i));
         * }
         * 
         * }
         */

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Tempo decorrido: " + elapsedTime + " milissegundos");
    }

}
