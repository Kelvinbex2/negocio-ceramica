package es.etg.psp.ceramica.lanzador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lanzador {
    private static final String[] COMMANDO = { "java", "es/etg/psp/ceramica/Galeria" };
    private static final String ERR_BUENO = "Ha ido bien";
    private static final String ERR_MALO = "No ha ido bien";

    public static void main(String[] args) {
        try {
            ejecutar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int ejecutar() {
        int exitVal = 0;
        StringBuilder st = new StringBuilder();
        String line;
        try {
            Process process = Runtime.getRuntime().exec(COMMANDO);

            BufferedReader bf = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((line = bf.readLine()) != null) {
                st.append(line).append(System.lineSeparator());
            }

            exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println(ERR_BUENO);
                System.out.println(line);
            } else {
                System.out.println(ERR_MALO);
            }
        } catch (IOException | InterruptedException e) {
            System.err.println(e.getMessage());
        }

        return exitVal;

    }
}