public class TarefaNumero2 implements Runnable {

    private Banheiro banheiro;

    public TarefaNumero2(Banheiro banheiro) {
        this.banheiro = banheiro;
    }


    @Override
    public void run() {
        try {
            banheiro.fazNumero2();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
