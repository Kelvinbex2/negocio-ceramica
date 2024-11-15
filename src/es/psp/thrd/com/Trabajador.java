package es.psp.thrd.com;

public class Trabajador extends Thread {

    private Ventana ventana;
    private String nombre;

    public Trabajador(Ventana v, String nombre){
        ventana = v;
        this.nombre = nombre;
    }
    
    @Override
    public void run(){
        while (true) {
            
            try {
                Thread.sleep(500); 
                ventana.servir(nombre);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}