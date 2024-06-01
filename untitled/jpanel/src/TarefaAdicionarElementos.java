import threads.Lista;

import java.util.List;

public class TarefaAdicionarElementos implements Runnable {

    private List<String> lista;
    private int numeroThread;

    public TarefaAdicionarElementos(List<String> lista, int numeroThread) {
        this.lista = lista;
        this.numeroThread = numeroThread;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            lista.add("Thread " + numeroThread + " - " + i);

        }
    }
}
