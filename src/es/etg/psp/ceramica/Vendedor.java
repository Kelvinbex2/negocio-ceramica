package es.etg.psp.ceramica;


public class Vendedor implements Runnable {
    private static final int TIEMPO = 1000;
    private String nombre;
    private Obra obra;

    

    public Vendedor(String nombre, Obra obra) {
        this.nombre = nombre;
        this.obra = obra;
    }



    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(TIEMPO);
            obra.vender(nombre);
            }
            
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
