package es.psp.thrd.com;

public class Auto extends Thread{

    private Ventana ventana;

    public Auto(Ventana v){
        ventana = v;
    }

    @Override
    public void run(){


        try {
            ventana.pedir(currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}