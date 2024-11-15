package es.etg.dam;

public class Alfarero implements Runnable {

    private Obra obra;

    public Alfarero(Obra o){
        obra = o;
    }

    @Override
    public void run(){
        try {
            obra.exponer(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

}
