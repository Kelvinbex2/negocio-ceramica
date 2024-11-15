package es.etg.psp.ceramica;

public class Alfarero implements Runnable{
    private static final int TIEMPO = 2000;
    private Obra obra;
    

    public Alfarero(Obra obra) {
        this.obra = obra;
    }


    @Override
    public void run() {
        try {
           
            obra.agregar(Thread.currentThread().getName());
            Thread.sleep(TIEMPO);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    
}