package POO.Clases;

public class Vehiculo {
    /**
     * Esta será nuestra plantilla para crear diferentes tipos de vehiculos
     * La estructura que se maneja para las clases es la siguiente:
     *
     * 1. Atributos o propiedades
     * 2. Constructores
     * 3. Métodos
     *
     * En la clase principal Main es donde realizamos instancias de objetos
     */

    //1. Atributos
    String fabricante;
    String modelo;
    double cc;
    int anio;
    boolean sport;
    int velocidad;

    //2. Constructores
    //2.1 Constructor vacio (por defecto)
    public Vehiculo(){}

    //2.2 Sobrecarga de metodo constructor(overloading): mismo nombre de método con diferentes parámetros

    public Vehiculo(String fabricante, String modelo, double cc, int anio, boolean sport) {
        /**
         * El operador this se utiliza dentro del constructor para hacer referencia a los atributos de la clase
         * cuando tienen el mismo nombre que los parámetros del constructor.
         * Esto permite distinguir claramente entre los parámetros y los atributos de la clase.
         */
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.anio = anio;
        this.sport = sport;
        this.velocidad = 0;
    }

    //Jugamos con los parámetros de los constructores ya que no siempre se requieren todos los datos de entrada al principio
    public Vehiculo(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Vehiculo(String fabricante, int anio) {
        this.fabricante = fabricante;
        this.anio = anio;
    }

    //3. Métodos(comportamientos)
    public void acelerar(int velocidad){
        this.velocidad += velocidad;
    }

    //4. Getters y Setters (tambien son métodos)
    /**
     * Los getters y setters son métodos especiales utilizados en la
     * programación orientada a objetos para acceder y modificar los atributos
     * privados de una clase. Estos métodos son una parte esencial de la encapsulación
     *
     * Get sirve para obtener valores
     * Set sirve para asignar valores
     */

    //5. toString

}
