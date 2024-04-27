public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            var result = i * 10;
            System.out.println("Imprimindo " + result);
        }

        new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("Estou executando uma THREAD: " + Thread.currentThread());
            }            
        }).start();        
        
    }
}
