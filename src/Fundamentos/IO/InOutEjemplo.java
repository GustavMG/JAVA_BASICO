package Fundamentos.IO;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class InOutEjemplo {
    public static void main(String[] args) {
        /**
         * Realicemos un ejemplos práctico leyendo los datos de un archivo y escribiendolos en otro
         * para esto aprovecharemos usar los archivos .txt que ya tenemos en nuestro proyecto
         * por lo que necesitamos usar la clase InputStream y la clase PrintStream juntas...
         *
         * @Nota: No olvidarse de cerrar nuestras lecturas y escrituras con el método close();
         */
        try {
            //Creamos una entrada de datos usando InputStream y leeremos los datos de un archivo .txt
            InputStream in = new FileInputStream("ramaGustavMG.txt");
            //Almacenaremos la información leida en un array de bytes
            byte[] datos = in.readAllBytes();
            in.close();
            //Ahora colocaremos la información leida con anterioridad en el otro archivo .txt
            //De esta manera estariamos copiando la información de un archivo a otro
            PrintStream out = new PrintStream("copiaRamaGustavMG.txt");
            out.write(datos);
            out.close();
            /**
             * Debemos cerrar nuestros in y out
             * Porque?
             * Existe algo llamado "File Descriptor" en nuestros sistemas operativos
             * podemos verlo como un número que el sistema operativo le asigna a un archivo abierto.
             * Cuando abrimos un archivo para leer/escribir como lo estamos haciendo aqui con InputStream y PrintStream,
             * el sistema operativo le da un número único que representa ese archivo en el sistema.
             * Nuestro programa utiliza este número para realizar operaciones de lectura/escritura, etc
             * Y el numero de File Descriptor es FINITO, entonces si tuviieramos muuuuuchos archivos abiertos
             * podemos tener problemas
             * @Nota: Cuidar en donde cerramos nuestro programa ya que si por ejemplo cerramos antes de escribir
             * información entonces nunca podremos escribir esta información
             */
        } catch (Exception e){
            System.out.println("Error... " + e.getMessage());
        }
    }
}
