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

        // Declarando variables
        int opcion;
        int size;

        // Menu de opciones
        System.out.println("Metodo de ordenamiento Cocktail Shaker Sort");
        System.out.println("-o-o-o-o-o-o-Menu-o-o-o-o-o-o-");
        System.out.println("Escribir arreglo.............1");
        System.out.println("Leer arreglo.................2");
        System.out.println("-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o");
        System.out.print("Opcion -> ");
        entrada = bufer.readLine();
        opcion = Integer.parseInt(entrada);

        switch (opcion) {
            case 1:
                // Solicitando el tamaño del arreglo
                System.out.println("Escribe el tamaño del arreglo");
                entrada = bufer.readLine();
                size = Integer.parseInt(entrada);

                // Contruyendo el arreglo
                int[] arreglo = new int[size];
                        
                // Lectura de arreglo
                arreglo = methods.leerArreglo(arreglo);

                // Imprimiendo el arreglo
                methods.imprimirArreglo(arreglo);

                // Metodo Cocktail Shaker Sort
                methods.cocktailShakerSort(arreglo);

                //Imprimiendo el arreglo ordenado
                System.out.println(".............Arreglo ordenado.............");
                methods.imprimirArreglo(arreglo);
                break;
            case 2:
                // Declaracion de variables locales
                String fileName;

                // Escribiendo nombre del archivo
                System.out.println("Escribe el nombre del archivo: ");
                fileName = bufer.readLine();

                // Construyendo el arreglo
                size = files.countFileLines(fileName);
                int[] array = new int[size];

                // Almazenando los datos en el arreglo
                array = files.fileToIntArray(fileName);

               // Imprimiendo el arreglo
                methods.imprimirArreglo(array);

                // Metodo Cocktail Shaker Sort
                methods.cocktailShakerSort(array);

                //Imprimiendo el arreglo ordenado
                System.out.println(".............Arreglo ordenado.............");
                methods.imprimirArreglo(array);

                // Guardando arvhivo
                System.out.println("Escribe el nombre del archivo al guardar: ");
                fileName = bufer.readLine();
                files.writeArrayToFile(fileName, array);
                System.out.println("Archivo guardado con exito...");
                break;
            default:
                break;
        }

        
                
    }
}
