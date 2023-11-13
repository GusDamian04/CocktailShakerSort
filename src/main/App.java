package main;

import methods.Methods;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import files.Files;

public class App {
    public static void main(String[] args) throws Exception {
        // Declarando el BufferedReader
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        // Importando los archivos Methods y Files
        Methods methods = new Methods();
        Files files = new Files();

        // Opcion de Escribir el arreglo o Leerlo en un archivo
        System.out.println("Metodo de ordenamiento Cocktail Shaker sort");
        System.out.println("-o-o-o-o-o Menu -o-o-o-o-o");
        System.out.println("Escribir Arreglo..........1");
        System.out.println("Leer Arreglo..............2");
        System.out.println("Leer Arreglo..............3");
        System.out.println("-o-o-o-o-o-o-o-o-o-o-o-o-o");
        System.out.print("->" );
        entrada = bufer.readLine();
        int opcion = Integer.parseInt(entrada);

        switch (opcion) {
            case 1:
                // Declarando variables
                int size;

                // Solicitando el tamaño del arreglo
                System.out.println("Escribe el tamaño del arreglo");
                entrada = bufer.readLine();
                size = Integer.parseInt(entrada);

                // Contruyendo el arreglo
                int[] arreglo = new int[size];
                
                // Imprimiendo el arreglo
                methods.imprimirArreglo(arreglo);

                // Metodo Cocktail Shaker Sort
                methods.cocktailShakerSort(arreglo);

                //Imprimiendo el arreglo ordenado
                methods.imprimirArreglo(arreglo);
                break;
            case 2:
                // Declaracion de variables
                int lines;
                String fileName;

                System.out.println("Escribe el nombre del archivo: ");
                fileName = bufer.readLine();
                lines = files.countFileLines(fileName);
                
                // Declaracion de Arreglo
                int[] array = new int[lines];

                // Imprimir el arreglo
                methods.imprimirArreglo(array);
                
                // Metodo Cocktail Shaker Sort
                methods.cocktailShakerSort(array);

                //Imprimiendo el arreglo ordenado
                methods.imprimirArreglo(array);
            default:
                break;
        }

        
    }
}
