package es.etg.psp.ceramica;

public class Galeria {
    public final static int MAX_OBRA = 10;
        private static final String NOMBRE_VENDEDOR = "Kelvin";
    
        public static void main(String[] args) {
            Obra obra = new Obra();
    
            for (int i = 0; i < MAX_OBRA; i++) {
                Alfarero a = new Alfarero(obra);
                Thread hilo = new Thread(a);
                hilo.start();
            }
    
            Thread thread = new Thread(new Vendedor(NOMBRE_VENDEDOR, obra));
            thread.start();

    }

}
