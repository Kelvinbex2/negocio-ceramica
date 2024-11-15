package es.etg.dam;

public class Vendedor implements Runnable {

    private Obra obra;

    public Vendedor(Obra o) {
        obra = o;
    }

    @Override
    public void run() {
        while (true) {
            try {
                obra.vender();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }  
        }
        
    }

}
