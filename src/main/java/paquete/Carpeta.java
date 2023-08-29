package paquete;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Carpeta {

    public static void buscarPalabraArchivo(String ruta, String palabraBuscada){
        File carpeta = new File(ruta);
        if (!carpeta.exists()) {
            System.out.println("No se encuentra la carpeta indicada.");
            return;
        }

        if (!carpeta.isDirectory()) {
            System.out.println("La ruta no corresponde a una carpeta.");
            return;
        }

        File[] archivos = carpeta.listFiles();

        if (archivos == null || archivos.length == 0) {
            System.out.println("La carpeta está vacía.");
            return;
        }

        int contadorTotalPalabra = 0;

        for (int i = 0; i < archivos.length; i++) {
            File archivo = archivos[i];
            String nombreArchivo = archivo.getName();

            if (archivo.isFile() && (nombreArchivo.endsWith(".txt") || nombreArchivo.endsWith(".xml") ||
                    nombreArchivo.endsWith(".json") || nombreArchivo.endsWith(".csv"))) {
                System.out.print("En " + nombreArchivo+": ");
                int contadorPalabra = Archivo.contarPalabraEnArchivo(archivo, palabraBuscada);
                System.out.println("la palabra \"" + palabraBuscada + "\" aparece " + contadorPalabra + " veces.");
                contadorTotalPalabra += contadorPalabra;

            }else {
                System.out.println("No se encontró texto en el archivo");
            }
        }

        System.out.println("La palabra \"" + palabraBuscada + "\" aparece en total " + contadorTotalPalabra + " veces en la carpeta.");
    }
}
