public class App {
    public static void main(String[] args) throws Exception {
        //primeiro exemplo para obter qual thread esta em execução, é passado via construtor um parametro
        /*ImprimiNumeros imprimiNumeros1 = new ImprimiNumeros("Thread 1");
        ImprimiNumeros imprimiNumeros2 = new ImprimiNumeros("Thread 2");
        Thread threadImprimir1 = new Thread(imprimiNumeros1,"Thread Imprimir 1" );
        Thread threadImprimir2 = new Thread(imprimiNumeros2,"Thread Imprimir 2" );
        threadImprimir1.start();
        threadImprimir2.start();*/
        //segundo exemplo para identificar a thread em execução é usado o metodo getId()
        ImprimiNumeros imprimiNumeros1 = new ImprimiNumeros();
        ImprimiNumeros imprimiNumeros2 = new ImprimiNumeros();
        Thread threadImprimir1 = new Thread(imprimiNumeros1,"Thread Imprimir 1" );
        Thread threadImprimir2 = new Thread(imprimiNumeros2,"Thread Imprimir 2" );
        threadImprimir1.start();
        threadImprimir2.start();
       

    }
}
