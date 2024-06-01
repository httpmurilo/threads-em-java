public class TarefaNumero1 implements Runnable {

    private Banheiro banheiro;

    public TarefaNumero1(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        try {
            banheiro.fazNumero1();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
