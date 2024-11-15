package es.psp.thrd.com;

public class Hamburgueseria {

    public static final int TOTAL = 10;
    public static void main(String[] args) {

        //Region crítica
        Ventana ventana = new Ventana();



        for(int i=0; i<TOTAL; i++){
            Auto auto = new Auto(ventana);
            auto.start();
        }
        
        //Tengo un trabajador
        Trabajador t = new Trabajador(ventana, "TB1");
        t.start();
    }

}