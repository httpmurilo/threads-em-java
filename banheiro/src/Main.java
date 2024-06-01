//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Banheiro b = new Banheiro();

        Thread convidado = new Thread(new TarefaNumero1(b), "João");
        Thread convidado2 = new Thread(new TarefaNumero2(b), "Pedro");
        convidado.start();
        convidado2.start();
    }
}