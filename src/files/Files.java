package files;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Files {
    
      public int countFileLines(String name) {
        File archivo; // Apunta a un archivo fisico de dd
        FileReader reader; // Llave con permiso de solo lectura
        BufferedReader bufer; // Recuperar info. del archivo
        int numLineas = 0;
        try {
            archivo = new File("C:\\practica\\" + name + ".txt");
            reader = new FileReader(archivo);
            bufer = new BufferedReader(reader);
            //Contar las lineas que contiene del archivo
            while ((bufer.readLine()) != null) {
                numLineas++;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo:" + e.toString());
        }
        return numLineas;

    }

    public  int[] fileToIntArray(String name) throws FileNotFoundException, IOException {
        File archivo; // Apunta a un archivo fisico de dd
        FileReader reader; // Llave con permiso de solo lectura
        BufferedReader bufer; // Recuperar info. del archivo
        String linea;
        int[] array = null;
        int t;
        int i = 0;

        try {
            t = countFileLines(name);

            array = new int[t];
            archivo = new File("C:\\practica\\" + name + ".txt");
            reader = new FileReader(archivo);
            bufer = new BufferedReader(reader);
            while ((linea = bufer.readLine()) != null) {

                array[i] = Integer.parseInt(linea);
                i++;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo:" + e.toString());
        }

        return array;

    }

    // Craer un archivo con informacion de un arreglo
    public  void writeArrayToFile(String name, int[] array) throws IOException {
        FileWriter archivo;
        PrintWriter writer;

        try {
            archivo = new FileWriter("C:\\practica\\" + name + ".txt");
            writer = new PrintWriter(archivo);

            //Guardar el arreglo a un archivo
            for (int unDato : array) {
                writer.println(unDato);
            }
            archivo.close();
        } catch (Exception e) {
            System.out.println("Error al escribir el archivo " + e.toString());
        }
    }

    
}