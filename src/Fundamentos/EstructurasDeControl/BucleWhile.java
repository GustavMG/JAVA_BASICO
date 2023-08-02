package Fundamentos.EstructurasDeControl;

public class BucleWhile {
    public static void main(String[] args) {
        /**
         * Tenemos el bucle while y la variación que es el Do while.
         *
         * El ciclo while evalúa primero antes de ejecutar
         * El ciclo Do while ejecuta primero y despues evalúa
         *
         * @Nota: el ciclo while es un bucle INDETERMINADO ya que podriamos tener bucles infinitos
         * Muy impartante NUNCA tener este caso ya que se crashea todo
         *
         * while(true).... esto daría un búcle infinito
         *
         * Los IDE's tienen un botón para detener los programas, identificarlos siempre pq pueden servir en
         * cualquier ocasión
         */

        //Ejemplo de un cilo while
        int contador = 0;
        while (contador < 18){
            //Podemos hacer una evaluación dentro del bucle para "romper" el bucle, lo común es un un if
            if (contador == 15) break;

            System.out.println("Imprimiento desde un bucle while, iteración actual es: " + contador);
            contador++;
        }
        System.out.println(" ");

        //Reseteamos el contador para comparar el while con el Do while
        contador = 0;
        System.out.println("Búcle While");
        while (contador < 10){
            System.out.println("Imprimiento desde un bucle while, iteración actual es: " + contador);
            contador++;
        }
        System.out.println(" ");

        contador = 0;
        System.out.println("Búcle Do While");
        do {
            contador++;
            System.out.println("Imprimiento desde un bucle Do while, iteración actual es: " + contador);
        } while (contador < 10);

        /**
         * Se puede observar que en el búcle while primero se evalua, se imprime y se incrementa el contador
         * en el búcle Do while primero se aumenta el contador, se imprime y se evalua
         * Por lo que el primer búcle imprime del 0 al 9
         * y el segundo búcle imprime del 0 al 10
         */
    }
}
