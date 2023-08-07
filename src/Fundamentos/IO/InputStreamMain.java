package Fundamentos.IO;

import java.io.*;
import java.util.Scanner;

public class InputStreamMain {
    public static void main(String[] args) {
        /**
         * InputStream... lo veremos como que es una forma de leer datos (información) de una fuente,
         * como un archivo o una conexión de red. Imaginemos que es como un tubo que puede leer información
         * y traerla a tu programa desde diferentes lugares.
         *
         * Por ejemplo, si tenemos un archivo de texto con palabras, el InputStream puede leer palabra por
         * palabra y traer esas palabras a tu programa para que puedas trabajar con ellas.
         * Es muy útil cuando necesitas obtener información de fuera de nuestro programa y usarla en el código.
         *
         * Lo usaremos para leer un archivo txt
         * Comenzaremos haciendo una instancia de InputStream para crear un objeto
         *
         * Como vimos anteriormente, el código que puede generar una excepción debemos trabajarlo con try y catch
         * el IDE detecta que el FileInputStream puede generar un error, que debe ser por ejemplo si no se
         * puede accesar a la ruta, por lo que debemos usar try catch..
         *
         * El FileInputStream nos devuelve una secuencia de byte's, lo que haremos es leer los datos del "fichero"
         * y asignarlo en un array de byte's
         *
         * Un detalle, es que el método leer los bytes de FileInputStream es sensible a un error
         * por lo que debemos usar un try catch para poder usarlo y aqui tenemos una pequeña "anidación" de try catch
         *
         * Ahora, si queremos leer todo el documento, no usaremos byte si no enteros int pero de forma INDIVIDUAL
         * por lo que para esto leeremos los datos con un while
         * Para lo que es el traslado o lectura de información dependiendo de el tipo de transmisión de datos que usemos
         * vamos a requerir un indicador de inciio de transmisión de mensaje y fin de transmisión de mensaje
         * para el método read(); del FileInputStream, el -1 indica el fin de mensaje, por lo que nos resulta mejor
         * el uso de un bucle while que funciona mientras NO recibamos un -1, ya que el -1 seria el EOF, es decir
         * el End Of File...
         * Como mencionamos, read(); lee individualmente cada dato entero, por lo que si nosotros dejamos solo la primera
         * lectura .read(); se quedará con ese dato y no cambiará, por lo que debemos hacer una actualización
         * del dato que se esta leyendo, en este caso al final de la iteración del búcle...
         *
         * @Nota: estamos leyendo bytes, enteros, etc. pero debemos castear y convertir a un caracter para poder
         * visualizar esta representación que es mas entendible para nosotros, a menos que sepamos código ascii...
         *
         * @Nota2: leer archivos byte x byte es muuuuy lento por lo que es "mejor" leer con read() la cual nos lee
         * la información completa, la almacena en memoria y luego la trabajamos aunque esto podria ser pesado para
         * los procesos si es muuuuuuucha info
         *
         * La opción intermedia es leer los archivos por sección
         *
         * Donde podriamos estar leyendo archivos/ficheros....?
         * Puede ser en programas donde no se usen base de datos o se simulen bases de datos tipo un json que simule
         * un endPoint o un archivo de configuración de un programa, o convertir archivos de un tipo a otro.
         */
        try {
            InputStream fichero = new FileInputStream("ramaGustavMG.txt");
            try {
//                byte[] datos = fichero.readAllBytes();
//                for (int dato : datos){
//                    System.out.println((char) dato);
//                }
                int dato = fichero.read();
                while (dato != -1){
                    System.out.print((char) dato);
                    dato = fichero.read();
                }
                System.out.println("");
            } catch (IOException e){
                System.out.println("No puedo leer el archivo: " + e.getMessage());
            }
        } catch (FileNotFoundException e){
            System.out.println("Error con la lectura del archivo: " + e.getMessage());
        }

        /**
         * Existe el InputBufferStream, esta clase lo que hace es leer o trabajar con entradas de sistema
         * lee de poco en poco y de igual manera no podemos acceder a toda la info completa si no que
         * de poco en poco...
         * Entonces vamos a trabajar con esta nueva instancia perooo recibiendo los datos del primer txt
         * que leimos
         *
         * Usar el InputBufferStream nos da la ventaja que lo que leemos esta parcialmente en memoria y
         * parcialmente no, esto pq como se lee de poco en poco, hace lectura, se "llena" el espacio que puede
         * almacenar y pasa a leer lo siguiente y queda disponible para su uso...
         */

        try {
            InputStream archivoTXT = new FileInputStream("ramaGustavMG.txt");
            BufferedInputStream archivoBuffer = new BufferedInputStream(archivoTXT);

            int dato = archivoBuffer.read();
            System.out.println("Impresión de la lectura del archivo txt");
            while (dato != -1){
                System.out.print((char)dato);
                dato = archivoBuffer.read();
            }
        } catch (IOException e){
            System.out.println("Error con la lectura del archivo: " + e.getMessage());
        }

        /**
         * Algo de lo que no nos dariamos cuenta pero podriamos tal vez intuir, es que la clase Scanner
         * trabaja internamente con un InputStream, solo que la lectura es desde lo que ingresamos en consola
         * ya que si leemos la documentación podemos observar en la clase un public static final InputStream in = null;
         */
        Scanner scanner = new Scanner(System.in);
    }
}
