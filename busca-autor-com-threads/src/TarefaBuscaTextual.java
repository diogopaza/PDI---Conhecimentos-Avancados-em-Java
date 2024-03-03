import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable{

    String nomeArquivo;
    String nomePessoa;
    
    
    public TarefaBuscaTextual(String nomeArquivo, String nomePessoa) {
        this.nomeArquivo = nomeArquivo;
        this.nomePessoa = nomePessoa;
    }

    @Override
    public void run() {
        try {
            int numeroLinha = 1;
            Scanner scanner = new Scanner(new File(nomeArquivo));
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if(linha.toLowerCase().contains(nomePessoa.toLowerCase())){                    
                    System.out.println(nomeArquivo + " - " + numeroLinha + " - " + linha);                    
                }
                numeroLinha++;
            }            

            scanner.close();
        } catch (FileNotFoundException e) {           
            e.printStackTrace();
        }
    }
}
