package es.etg.dam;

public class Galeria {

    public static final int TOTAL_OBRAS = 10;
    public static void main(String[] args) {
        
        Obra obra = new Obra();

        for (int i = 0; i < TOTAL_OBRAS; i++) {
            Thread alfarero = new Thread(new Alfarero(obra));
            alfarero.start();
        }

        Thread vendedor = new Thread(new Vendedor(obra));
        vendedor.start();
    }

}
