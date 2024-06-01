import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable{

    private String nomeArquivo;
    private String nomeAutor;




    public TarefaBuscaTextual(String nomeArquivo, String nomeAutor) {
    }


    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(new File(nomeArquivo));

            int numeroLinha = 1;
            while (scanner.hasNextLine()) {

                String linha = scanner.nextLine();
             
                if (linha.toLowerCase().contains(nomeAutor.toLowerCase())) {
                    System.out.println(linha);
                    System.out.println("numero linha :" + numeroLinha);
                }
                numeroLinha++;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
