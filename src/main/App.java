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
        int size;

        // Solicitando el tamaño del arreglo
        System.out.println("Metodo de ordenamiento Cocktail Shaker sort");
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
    }
}
