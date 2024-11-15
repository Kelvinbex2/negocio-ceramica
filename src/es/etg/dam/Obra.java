package es.etg.dam;

public class Obra {

    private static final String MSG_VENDER = "\tLa obra se ha vendido.";
    private static final int TIEMPO_ESPERA = 1000;
    private byte numObras = 0;


    public synchronized void exponer(String id) throws InterruptedException {
        while (numObras == 1) {
            wait();
        }
        numObras = 1;
        Thread.sleep(TIEMPO_ESPERA);
        System.out.println("\nLa obra "+id+" se ha expuesto.");
    }

    public synchronized void vender() throws InterruptedException {
        if (numObras > 0) {
            Thread.sleep(TIEMPO_ESPERA);
            System.out.println(String.format(MSG_VENDER));
            notify();
            numObras = 0;
        }
        
    }

}
