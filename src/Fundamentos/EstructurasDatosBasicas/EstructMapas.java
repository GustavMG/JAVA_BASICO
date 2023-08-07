package Fundamentos.EstructurasDatosBasicas;

import java.util.HashMap;
import java.util.Map;

public class EstructMapas {
    public static void main(String[] args) {
        /**
         * Los mapas son una especia de diccionario y para su uso declaramos una llave y un valor
         * de los mapas tenemos mas de una implementación
         * empezaremos con HashMap<>, como mencionamos al hashmap hay qe darle una llave y un valor por lo que
         * debemos indicar el tipo de dato que llevará, aqui tambien debemos trabajar con datos envoltorios y
         * no con datos primitivos.
         *Lo interesante de los mapas es que las claves NO pueden duplicarse
         * Asi como le damos un String como tipo de llave, le podriamos dar una lista como clave
         *
         * Cada elemento de un HashMap recibe el nombre de "entrada de mapa"
         */
        //     <Tipo Llave, Tipo valor>
        HashMap<String, Integer> mapa = new HashMap<>();
        /**
         * Para añadir datos en el mapa debemos indicar la clave que tendra y el valor que tendrá
         * asociada esta clave
         */
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);

        System.out.println("Impresión de los datos del HashMap");
        System.out.println(mapa);
        /**
         * Si nosotros tratamos de hacer un put a una clave que ya existe
         * el valor actual se sobreescribe
         */
        mapa.put("clave3", 40);
        System.out.println("Impresión de los datos del HashMap");
        System.out.println(mapa);
        /**
         * Podemos tambien acceder a un elemento en especifico mediante su llave y su método
         * correspondiente.
         * Si usamos put creamos nuevos datos y/o reemplazamos un existente
         *
         * Ahora, existe un método especifico para reemplazar datos en el mapa y es con replace(K, value);
         * Si no existe la clave que estamos tratando de modificar simplemente no pasa nada y si NO existe
         * no lo va a crear a diferencia del put
         */
        mapa.replace("clave2", 200);
        System.out.println("Impresión de los datos del HashMap");
        System.out.println(mapa);
        //Podemos eliminar valores con la llave o la llave y el valor
        mapa.put("clave10", 100);
        mapa.put("clave20", 200);
        mapa.put("clave30", 300);
        System.out.println("Impresión de los datos del HashMap");
        System.out.println(mapa);
        mapa.remove("clave20");

        System.out.println("Impresión de los datos del HashMap");
        System.out.println(mapa);

        /**
         * Para recorrer los mapas usaremos los ciclos for
         * para iterar con el HashMap debemos acceder mediante un atributo Entry
         * que como mencionamos anteriormente es el nombre que lleva "entrada de mapa"
         */
        System.out.println("Iterar en el mapa");
        for (Map.Entry<String, Integer> elemento : mapa.entrySet()){
            System.out.println("Clave del elemento es: " + elemento.getKey());
            System.out.println("Elemento de la clave es: " + elemento.getValue());
        }
    }
}
