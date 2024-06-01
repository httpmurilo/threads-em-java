public class Banheiro {

    public void fazNumero1() throws InterruptedException {

        synchronized(this) {

        String nome = Thread.currentThread().getName();
        System.out.println("nome thread :" + nome );

        System.out.println("Entrando no banheiro");
        System.out.println("Fazendo o numero 1");

        Thread.sleep(3000);
        System.out.println("Dando descarga");
        System.out.println("Lavando as maos");
        System.out.println("Saindo do banheiro");
    }
    }
    public void fazNumero2() throws InterruptedException {

        synchronized (this) {
            String nome = Thread.currentThread().getName();
            System.out.println("nome thread :" + nome);


            System.out.println("Entrando no banheiro");
            System.out.println("Fazendo o numero 2");

            Thread.sleep(3000);

            System.out.println("Dando descarga");
            System.out.println("Lavando as maos");
            System.out.println("Saindo do banheiro");

        }
    }
}
