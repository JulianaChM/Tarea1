package paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archivo {
    public static int contarPalabraEnArchivo(File archivo, String palabra) {
        int contador = 0;
        try (Scanner scanner = new Scanner(archivo)) {
            while (scanner.hasNext()) {
                String linea = scanner.next();
                linea = linea.replaceAll("[^a-zA-Z0-9]", "");
                if (linea.equalsIgnoreCase(palabra)) {
                    contador++;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + archivo.getName());
        }
        return contador;
    }
}
