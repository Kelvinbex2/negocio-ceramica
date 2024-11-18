package es.etg.psp.ceramica;

public class Alfarero implements Runnable {
    private Obra obra;

    public Alfarero(Obra obra) {
        this.obra = obra;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            try {

                Thread.sleep(random());
                obra.agregar(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public int random(){
        int random = (int) (1000 + (Math.random() *3001));
        return  random;
    }

}