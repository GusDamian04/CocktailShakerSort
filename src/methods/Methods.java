package methods;

public class Methods {

    // Metodo para imprimir Arreglo
    public void imprimirArreglo(int[] arreglo){
        for(int unDato : arreglo)
            System.out.print("   " + unDato + "   ");
    }

    // Metodo para ordenar el arreglo
    public int[] cocktailShakerSort(int[] arreglo){
        boolean cambios;
        int auxiliar;
        do {
            cambios = false;

            // Primer paso de izquerda a derecha
            for(int i = 0; i < arreglo.length -1; i++){
                if(arreglo[i] > arreglo[i + 1]){ 
                    auxiliar = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = auxiliar;
                    cambios = true;
                }
            }
            // Segundo paso de derecha a izquierda
            for(int i = arreglo.length - 1; i > 0; i--){
                if(arreglo[i] > arreglo[i - 1]){
                    auxiliar = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = auxiliar;
                    cambios = true;
                }
            }
            
        }while(cambios);
        return arreglo;
    }
}
