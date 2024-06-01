import threads.Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {


        //List<String> lista = Collections.synchronizedList(new ArrayList<String>());
        List<String> lista = new Vector<String>();


        for (int i = 0; i< 10; i++) {
            new Thread(new TarefaAdicionarElementos(lista, i)).start();
        }

        Thread.sleep(3000);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            
        }
    }
}