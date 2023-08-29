package paquete;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la ruta de la carpeta: ");
        String ruta = scanner.nextLine();
        System.out.print("Ingrese la palabra que desea buscar: ");
        String palabraBuscada = scanner.nextLine();
        scanner.close();

        Carpeta.buscarPalabraArchivo(ruta, palabraBuscada);

    }

}


