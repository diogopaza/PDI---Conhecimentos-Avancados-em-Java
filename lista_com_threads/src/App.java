public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();

        for (int i = 0; i < 10; i++) {
            new Thread(new TarefaAdicionarElemento(lista, i)).start();
             
        }
        Thread.sleep(2000);      
        for (int i = 0; i < lista.tamanho(); i++) {
            System.out.println(i + " - " + lista.pegaElemento(i));
        }
    }

}
