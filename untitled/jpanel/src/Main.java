import threads.Lista;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {


        List<String> lista = new ArrayList<>();



        for (int i = 0; i< 10; i++) {
            new Thread(new TarefaAdicionarElementos(lista, i)).start();
        }

        Thread.sleep(3000);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            
        }
    }
}