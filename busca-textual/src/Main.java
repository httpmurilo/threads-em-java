//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome = "Jon";

        Thread thread = new Thread(new TarefaBuscaTextual("autores.txt", nome));
        Thread threadAutores2 = new Thread(new TarefaBuscaTextual("assinaturas1.txt", nome));
        Thread threadAutores3 = new Thread(new TarefaBuscaTextual("assinaturas1.txt", nome));

        thread.start();
        threadAutores2.start();
        threadAutores3.start();

    }
}