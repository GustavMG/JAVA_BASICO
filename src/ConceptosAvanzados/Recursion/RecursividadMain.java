package ConceptosAvanzados.Recursion;

import java.util.stream.IntStream;

public class RecursividadMain {
    /**
     * El principal problema de la recursividad es el consumo de memoria, esto es pq cada vez que se llama a si mismo
     * se tiene que crear una copia de las variables que se estan utilizando para NO modificar las variables
     * lo podemos observar en los ejemplos de head recursive y tail recursive, esto lo podemos observar con el debug.
     *
     * La mejor implementación de la recursividad es cuando hacemos recorridos de arboles
     * tipo arbol binario o arbol no balanceado...
     */
    public static void main(String[] args) {
        /**
         * Diferentes formas de obtener un mismo resultado con diferentes funciones
         */
        System.out.println("Suma iterativa: " + suma(5));
        System.out.println("Suma recursiva: " + sumaRecursiva(5));
        System.out.println("Suma funcional: " + sumaFuncional(5));

        //Tail recursion o Recursividad de cola
        System.out.println("Tail Recursion");
        tailRecursion(5);

        //Head recursión o recursividad de cabeza
        System.out.println("Head Recursion");
        headRecursion(5);

        /**
         * Estas lineas de código nos permite evaluar un tiempo transcurrido usando
         *      currentTimesMillis();
         */
        long tiempoInicial = System.currentTimeMillis();
        long tiempoFinal = System.currentTimeMillis();
        long contador = 0;
        for (int i = 0; i < 100000000; i++){
            contador *= i;
        }
        System.out.println("Tiempo transcurrido: " + (tiempoFinal - tiempoInicial));
    }

    public static int suma(int max){
        /**
         * Esta es la forma iterativa ya que estamos usando un bucle for
         */
        int resultado = 0;
        for (int i = 0; i <= max; i++){
            resultado = resultado + i;
        }
        return resultado;
    }

    public static int sumaRecursiva(int numero){
        /**
         * Esta es la forma recursiva, donde la función se llama asi misma
         * No olvidemos que SIEMPRE debemos tener una sentencia de control para que nuestra función recursiva
         * no se llame infinitamente ya que esto nos daría un error de desbordamiento.
         *
         * 1. Recursividad de cola o tail recursion:
         *  Aquí lo último que se ejecuta es la llamada de la función así misma
         *  como por ehjemplo en esta función ya que primero hacemos algo y luego llamamos a la función
         *
         * 2. Recursividad de cabeza o Head recursion:
         *  Aqui primero llamamos a la función
         */
        if(numero == 1){
            return 1;
        }
        return numero + suma(numero - 1);
    }
    public static int sumaFuncional(int numero){
        /**
         * estamos aplicanco la programación funcional con el uso de lambdas
         * para eso usamos Stream para obtener una colección de datos de los cuales podemos aplicar los
         * métodos que necesitemos de esta interfaz, por ejemplo aqui estamos definiendo un rango de trabajo desde
         * 1 hasta el numero ingresado como parametro para la función, usamos reduce para obtener la concatenación
         * que en este caso es la suma de todos estos valores que estan dentro del rango...
         */
        return IntStream.rangeClosed(1,numero)
                .reduce(0, (a, b) -> a + b);
    }

    public static void tailRecursion(int valor){
        /**
         * En este ejemplo de recursión pasa lo siguiente:
         *  Recibimos el parámetro de entrada 5 y hacemos la evaluación de si es igual a 0 (esto no se cumplirá si no
         *  hasta el final)
         *  entonces imprimimos el valor actual y entramos a la función nuevamente pero con otro valor (restando 1 al valor actual)
         *  y volvemos a comparar con el if y al no cumplirse entonces imprime y vuelve a llamar a la función y así sucesivamente
         *  hasta que valor sea igual a 0, entonces lo que nosotros tendriamos si checamos el debugger seria:
         *      valor = 5 entonces imprime 5 y entra la función restando 1 a valor
         *          valor = 4 entonces imprime 4 y entra la función restando 1 a valor
         *              valor = 3 entonces imprime 3 y entra la función restando 1 a valor
         *                  valor = 2 entonces imprime 3 y entra la función restando 1 a valor
         *                      valor = 1 entonces imprime 1 y entra la función restando 1 a valor
         *                          aqui ahora valor vale 0 entonces retornamos nada
         */
        if(valor == 0){
            return;
        }
        System.out.println(valor);
        tailRecursion(valor - 1);
    }

    public static void headRecursion(int valor){
        /**
         * En este ejemplo de recursión pasa lo siguiente:
         *  Recibimos el parámetro de entrada 5 y hacemos la evaluación de si es igual a 0 (esto no se cumplirá si no
         *  hasta el final)
         *  entonces entramos a la función nuevamente pero con otro valor (restando 1 al valor actual) y volvemos a
         *  comparar con el if y al no cumplirse entonces vuelve a llamar a la función y así sucesivamente hasta que
         *  valor sea igual a 0,
         *  si nos damos cuenta, mientras valor no sea igual a cero nos quedamos "en búcle" ya que nunca estamos
         *  imprimiendo los valores ya que no da chance de entrar a esa linea de código, la unica manera de continuar a
         *  esta linea de código es ya NO llamando a la función y como hemos dicho esto solo pasa cuando valor == 0
         *  al momento de cumplirse esta condición y ya no entrar a la función pasa que "empezamos" desde el final de
         *  la recursión que vendría siendo en donde se detiene la recursión, entonces iriamos ejecutando del fin al
         *  principio y tendriamos lo siguiente:
         *      valor = 1 entonces imprime 1
         *          valor = 2 entonces imprime 2
         *              valor = 3 entonces imprime 3
         *                  valor = 4 entonces imprime 4
         *                      valor = 5 entonces imprime 5
         *        aqui ahora estariamos en la primera llamada que hicimos a la función y si comparamos con
         *        la otra función se "invierte" los numeros pq primero se espera a finalizar toda la recursión
         *        de la función para ejecutar el código restante de la función, en cambio en la tail recursion
         *        lo ultimo que hacemos es llamar a la función por lo que hay chance de que se ejecute el código
         *        ANTES de llamarse a si misma nuevamente.
         */
        if(valor == 0){
            return;
        }
        headRecursion(valor - 1);
        System.out.println(valor);
    }
}
