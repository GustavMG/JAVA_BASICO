package POO.Clases;

import POO.Herencia.Camion;
import POO.Herencia.Coche;
import POO.Herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {
        System.out.println("Comenzamos con POO trabajando con clases");
        /**
         * En POO, una clase es una plantilla o un plano para crear objetos.
         * Define los atributos (variables) y métodos (funciones) que tendrán
         * los objetos creados a partir de ella.
         */

        /**
         * Clase identificador = new Clase();
         * Un poco mas desglosado
         *         NombreDeLaClase nombreDelObjeto = new NombreDeLaClase(parametrosDelConstructor);
         */

        //Primera creación de objeto con el constructor vacio de la clase
//        Vehiculo toyotaPrius = new Vehiculo();
//
//        //Creación de un objeto CON parámetros
//        Motor motorGTI = new Motor("GTI", 190, 459.0, 6);
//        //Le damos como parametro al constructor el objeto motorGTI de la clase Motor
//        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false, 0, motorGTI);
//
//        //Aqui podemos acceder a los atributos de la clase pq NO estan protegidos con su scoop
//        System.out.println(fordMondeo.fabricante);
//        System.out.println(fordMondeo.anio);
//
//        //Aqui accedemos a los métodos del objeto
//        System.out.println(fordMondeo.velocidad);   //Velocidad = 0
//        fordMondeo.acelerar(50);
//        System.out.println(fordMondeo.velocidad);   //Velocidad = 50

        //TODO: HERENCIA
        /**
         * Apartir de aqui estamos trabajando con la herencia
         * desde una clase Vehiculo la cual funge como Clase Padre, Super Clase o Clase Base que hereda sus atributos y métodos a las clases
         *  -Camion
         *  -Motocicleta
         *  -Coche
         * Estas clases que heredan las podemos llamar Clases Hijas, Clase Derivada o Subclase
         */
        Motocicleta kawazakiNinja = new Motocicleta();
        /**
         * Como podemos observar, si nosotros entramos a la clase Motocicleta no vemos un atributo llamadop fabricante
         * sin embargo nosotros podemos accesar a un atributo llamado "fabricante" en el objeto kawazakiNinja de la clase Motocicleta
         *
         * Esta es la implementación de la herencia, ya que Motocicleta esta HEREDANDO las propiedades de su clase Padre Vehiculo, entonces
         * Motocicleta se vuelve la clase Hija de Vehiculo, por lo que si nosotros vamos a la clase Vehiculo podemos observar que ahi
         * es donde EXISTE este atributo al que nosotros estamos tratando de acceder, asi mismo la clase Motocicleta tiene sus propios
         * atributos que son UNICAMENTE de esa clase a menos que Motocicleta tenga una clase hija/subclase y se vaya alargando la linea
         * jerarquia de herencia.
         * Nota: Podria ser un poco obvio pero es necesario hacer la observación que como Vehiculo en este ejemplo tiene 3 clases hijas,
         * estas 3 clases hijas NO comparten sus atributos ni sus métodos entre sí ya que son entidades individuales.
         */
        kawazakiNinja.fabricante = "Kawazaki";

        //TODO: POLIMORFISMO
        /**
         * El polimorfismo es la capacidad que se la da a un MÉTODO para comportarse de manera diferente de acuerdo a la instancia creada
         *
         * Podemos tener una instancia de los vehiculos
         * motocicleta = new Motocicleta();
         * coche = new Coche();
         *
         * ambos pueden tener un metodo acelerar(int velocidad);
         * pero este método se ejecuta de manera diferente en un coche que en una moto
         * ya que en el coche aceleramos con los pies y en la moto aceleramos con las manos.
         */
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(60);

        vehiculo = new Camion();
        vehiculo.acelerar(30);

        //TODO: ABSTRACCIÓN
        /**
         * La abstracción es un concepto que utilizamos en nuestra vida cotidiana, aunque quizás no nos demos cuenta.
         * Se trata de simplificar las cosas para comprenderlas mejor y tomar decisiones de manera más sencilla.
         *
         * @Nota: Las clases abstractas NO se pueden instanciar (crear un objeto), tenemos que acceder mediante la instancia de las clases hijas(HERENCIA)
         *
         * Como la clase Padre Vehiculo se convirtio en abstracta ----> public abstract class Vehiculo { }
         * Se requirió comentar las lineas de codigo de la 23 a la 37
         * @Nota2: Recordar que para comentar varias lineas se usa ctrl + / (la diagonal del teclado numerico)
         * y para descomentar es la misma combinación de teclas
         *
         * Hacemos esta clase abstracta pq NO queremos que se cree un objeto de nuestra plantilla o clase genérica pq realmente no nos dice nada al respecto
         * en las subclases es donde podemos observar ya de que va el programa mirando sus atributos y métodos en acción, la clase padre lo que nos ayuda
         * es para REUTILIZAR código y NO REPETIR lineas ya qe esto hace mas largo el programa.
         */

    }
}
