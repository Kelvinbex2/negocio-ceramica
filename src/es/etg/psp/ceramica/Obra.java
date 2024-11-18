package es.etg.psp.ceramica;

public class Obra {

    public static final String MSG_AGG = "Se ha agregado la obra";
    public static final String MSG_VENDER = " ha vendido la obra ";
    public static final String MSG_FIN = "\t\tEl cliente se va con la obra de arte ";
    public static final String TAB = "\t";
    private static final String COMILLAS = " ";

    public static final int TAMANIO_OBRA = 1;
    private int numObra = 0;
    private boolean ocupado = false;

    public synchronized void agregar(String id) throws InterruptedException {

        if (numObra >= TAMANIO_OBRA) {
            wait();
        }
        System.out.println(System.lineSeparator() + id + COMILLAS + MSG_AGG);

        numObra++;
        notify();

    }

    public synchronized void vender(String id) throws InterruptedException {
        if (numObra == 0) {
            this.wait();
        }
        numObra--;
        System.out.println(System.lineSeparator() + TAB + id + MSG_VENDER);
        System.out.println(MSG_FIN);
        this.notify();
       

    }
}
