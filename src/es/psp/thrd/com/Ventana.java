package es.psp.thrd.com;

public class Ventana {
    
    private int numCoches = 0;


    public synchronized void pedir(String id) throws InterruptedException{

        numCoches++;
        System.out.println(id+ " Ha pedido hamburguesas");
        wait();
        System.out.println("\t\t"+id+ " se va con sus hamburguesas");
    }


    public synchronized void servir(String nombre) throws InterruptedException{


        if(numCoches>0){
            System.out.println(" \tEl trabajador "+nombre+" prepara el pedido\n\tCliente despachado");
            notify();
            numCoches--;
        }
    }
}