package org.primerEjercicio;


import java.io.*;

public class lectorTexto {
    public static void main(String[] args) {
        InputStream isr = lectorTexto.class.getClassLoader().getResourceAsStream("archivo.txt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(isr))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error: El archivo " + isr + " no existe o no se puede leer.");
        }
    }
}