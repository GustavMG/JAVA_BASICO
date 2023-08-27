package ConceptosAvanzados;

import java.util.ArrayList;
import java.util.stream.Stream;

public class OrdenSuperiorMain {
    public static void main(String[] args) {
        /**
         * Instanciamos nuestra clase FuncionesOrdenSuperior para poder usar sus métodos
         */
        FuncionesOrdenSuperior funcionPruebas = new FuncionesOrdenSuperior();
        funcionPruebas.pruebas();
        System.out.println("");

        /**
         * Ventaja principal de usar la programación funcional y funciones lambdas?
         * La reducción y obtimización de código...
         */
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juanito");
        nombres.add("Miguelito");
        nombres.add("Panchito");

        System.out.println("Usando un for each convencional");
        for (String nombre : nombres){
            System.out.println(nombre);
        }
        System.out.println("");
        /**
         * Podemos hacer la impresión u obtención de los datos de nuestra lista mediante el uso de la
         * programación funcional, para esto nos apoyamos del método .stream()
         * Cuando se llama al método .stream() en una colección, como un ArrayList, se crea un flujo que
         * representa los elementos contenidos en esa colección. Este flujo permite realizar operaciones de
         * procesamiento, filtrado, transformación y más, de una manera más funcional y declarativa.
         */
        System.out.println("Usando una función lambda");
        nombres.stream().forEach(x -> System.out.println(x));
        System.out.println("");

        /**
         * Una de las cosas mas comunes de usar programación funcional y en concreto stream() son los MAPEOS
         * el map permite transformar cada elemento de un flujo en otro valor usando una función específica.
         * Esta operación crea un nuevo flujo que contiene los resultados de aplicar la función a cada
         * elemento del flujo original.
         *
         * @Nota: El stream nos hace el for automatico pero una vez que se consume nuestro stream ya NO podemos
         * utilizarlo
         *
         * La forma corta de usar nuestro Stream seria:
         *      Stream<String> nombresStream= nombres.stream().map(x -> "Hola, " + x.toUpperCase());
         * Tambien tenemos la forma larga que la pondremos pq a fin de cuentas es una función solo que expresada
         * de otra manera:
         *      Stream<String> nombresStream= nombres.stream()
         *                 .map((x) -> {
         *                     return "Hola, " + x.toUpperCase();
         *                 });
         *
         */
        System.out.println("Usando el stream con un foreach y el método toUpperCase()");
        Stream<String> nombresStream= nombres.stream().map((x) -> "Hola, " + x.toUpperCase());
        nombresStream.forEach(x -> System.out.println(x));
        System.out.println("");
    }
}
