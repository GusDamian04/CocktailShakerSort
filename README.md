# CocktailShakerSort
## Descripción

El Cocktail Shaker Sort, también conocido como bidirectional bubble sort, shaker sort, ripple sort, o shuttle sort, es un algoritmo de ordenamiento que mejora el rendimiento del Bubble Sort al ordenar los elementos en ambas direcciones, de izquierda a derecha y viceversa. Esto ayuda a reducir el número de iteraciones necesarias para organizar la lista.

El método Cocktail Shaker sort tiene una complejidad de tiempo de O(n^2) en el peor caso, y de O(n) en el mejor caso, cuando el arreglo ya está ordenado. Es un método de ordenamiento estable, que mantiene el orden relativo de los elementos iguales.

## Cómo funciona

1. *Primer paso:*
   - Comienza desde el inicio de la lista y compara elementos adyacentes.
   - Intercambia los elementos si están en el orden incorrecto.
   - Mueve el índice hacia la derecha.

2. *Segundo paso:*
   - Luego, va en la dirección opuesta, desde el final de la lista hacia el principio.
   - Realiza comparaciones y ajustes de manera similar a la fase de ida.
   - Mueve el índice hacia la izquierda.

3. *Repeticion:*
   - Estos dos pasos se repetira las veces que sean necesarias hasta tener los datos organizados.

## Ejemplo

- [Ejemplo de Cocktail Shaker Sort](https://youtu.be/4LhQtuEzOU8?si=4fUjOMjVSG-wLNLY)
