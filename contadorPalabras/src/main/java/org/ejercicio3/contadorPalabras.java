package org.ejercicio3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class contadorPalabras {
    public static void main(String[] args) {
        int contador = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // divide en palabras separadas por espacios
                String[] palabras = linea.trim().split("\\s+");
                if (!linea.trim().isEmpty()) {
                    contador += palabras.length;
                }
            }
            System.out.println("Número total de palabras: " + contador);
        } catch (IOException e) {
            System.err.println("Error al procesar la entrada.");
        }
    }
}