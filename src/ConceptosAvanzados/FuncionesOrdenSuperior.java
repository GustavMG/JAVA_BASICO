package ConceptosAvanzados;

import java.util.ArrayList;
import java.util.function.Function;

public class FuncionesOrdenSuperior {
    /**
     * Las funciones de alto nivel o de orden superior son funciones que pueden TOMAR una o más funciones
     * como ARGUMENTOS/PARAMETROS y/o DEVOLVER una función como resultado.
     * Aqui se trabaja con las funciones lambda
     *
     * Podemos observar la declaración de 2 funciónes, la 1 es la forma de alto nivel y la 2 es la manera convencional
     *
     * ambas hacen lo mismo solo que usando lambdas es de manera funcional y usando métodos convencionales es de manera
     * imperativa
     *
     * @Nota: la utilización de las funciones lambda como una función requiere la importación de la interfaz Function
     * La interfaz funcional Function tiene un método abstracto llamado apply que toma un argumento y devuelve un valor.
     * La firma del método es la siguiente:
     *      R apply(T t);
     * Donde:
     *
     * T es el tipo del argumento.
     * R es el tipo del valor de retorno.
     * Podemos usar la interfaz Function para definir transformaciones o mapeos de un tipo a otro.
     * Por ejemplo, puedes usarla para aplicar una función a cada elemento de una colección o
     * para realizar transformaciones en datos.
     */
    //1. Esta es una función de alto nivel donde estamos usando lambda
    private Function<String, String> toMayusc = (x) -> x.toUpperCase();
    private Function<Integer, Integer> sumador = (x) -> x.sum(x, x);

    //2. Este es un método como comunmente hemos estado trabajado
    public static String toMayuscula(String x){
        return x.toUpperCase();
    }

    public void pruebas(){
        /**
         * Creamos esta función para que podamos ver como estan trabajando nuestras funciones
         * por ejemplo primero estamos llamando a nuestro método convencional para pasar a mayusculas
         * despues llamamos nuestra función lambda que tambien pasa a mayusculas el texto y por ultimo
         * llamamos a nuestra función lambda que suma enteros
         */
        System.out.println(toMayuscula("gustavo"));
        System.out.println(toMayusc.apply("maldonado"));
        System.out.println(sumador.apply(10));

        Saluda(toMayusc, "gustavMG");
    }
    /**
     * Crearemos una función común void, esta función va recibir como parámetro de entrada una función y un String, por
     * lo que usamos la interfaz Function que anteriormente usamos para nuestra lambda.
     */
    public void Saluda(Function<String, String> miFuncion, String nombre){
        /**
         * Aqui estamos haciendo que nuestra función ejecute el método apply de cualquiera función que vaya a recibir
         * como parámetro (en este caso ser la función toMayusc que declaramos arriba pero podria ser cualquier otra)
         * y le estamos dando un parámetro mas que es un String, vemos aqui una matrioshka  de una función dentro
         * de otra.
         * Lo que sigue es que llamamemos a esta función Saluda en nuestra función pruebas y le demos los parámetros
         * correspondientes.
         */
        miFuncion.apply(nombre);
    }
}
