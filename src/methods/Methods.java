package methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Methods {

    BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    String entrada;
    
    // Metodo para escribir arreglo
    public int[] leerArreglo(int[] arreglo) throws IOException{
        for (int i = 0; i < arreglo.length; i++){
            System.out.print("Escribe el primer numero -> ");
            entrada = bufer.readLine();
            arreglo[i] = Integer.parseInt(entrada);
            System.out.println("");
        }
        return arreglo;
    }

    // Metodo para imprimir Arreglo
    public void imprimirArreglo(int[] arreglo){
        for(int unDato : arreglo)
            System.out.print("   " + unDato + "   ");
        System.out.println("");
    }

    // Metodo para ordenar el arreglo
    public int[] cocktailShakerSort(int[] arreglo){
        boolean cambios;
        int auxiliar;
        do {
            cambios = false;

            // Primer paso de izquerda a derecha
            for(int i = 0; i < arreglo.length - 1; i++){
                if(arreglo[i] > arreglo[i + 1]){ 
                    auxiliar = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = auxiliar;
                    cambios = true;
                }
            }

            if (cambios == false)
                break;
            
            // Segundo paso de derecha a izquierda
            for(int i = arreglo.length - 1; i > 0; i--){
                if(arreglo[i] < arreglo[i - 1]){
                    auxiliar = arreglo[i];
                    arreglo[i] = arreglo[i - 1];
                    arreglo[i - 1] = auxiliar;
                    cambios = true;
                }
            }
            
        }while(cambios);
        return arreglo;
    }
}
