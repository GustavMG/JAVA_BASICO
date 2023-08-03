package POO.Clases;

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
        Vehiculo toyotaPrius = new Vehiculo();

        //Creación de un objeto CON parámetros
        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false);

        //Aqui podemos acceder a los atributos de la clase pq NO estan protegidos con su scoop
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.anio);

        //Aqui accedemos a los métodos del objeto
        System.out.println(fordMondeo.velocidad);   //Velocidad = 0
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.velocidad);   //Velocidad = 50
    }
}
