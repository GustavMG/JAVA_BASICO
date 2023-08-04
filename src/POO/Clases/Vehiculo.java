package POO.Clases;

public abstract class Vehiculo {
    /**
     * Esta será nuestra Plantilla o Clase Base o Super Clase o Clase Padre para crear diferentes tipos de vehiculos
     * La estructura que se maneja para las clases es la siguiente:
     *
     * 1. Atributos o propiedades
     * 2. Constructores
     * 3. Métodos
     *
     * En la clase principal Main es donde realizamos instancias de objetos
     */

    //1. Atributos
    protected String fabricante;
    protected String modelo;
    protected double cc;
    protected int anio;
    protected boolean sport;
    protected int velocidad;
    //@Nota: Recordar que podemos darle objetos de una clase como un Atributo para evitar que se extienda demasiado una clase
    protected Motor motor;

    //2. Constructores
    //2.1 Constructor vacio (por defecto)
    public Vehiculo(){}

    //2.2 Sobrecarga de metodo constructor(overloading): mismo nombre de método con diferentes parámetros
    /**
     * El operador this se utiliza dentro del constructor para hacer referencia a los atributos de la clase
     * cuando tienen el mismo nombre que los parámetros del constructor.
     * Esto permite distinguir claramente entre los parámetros y los atributos de la clase.
     */
    public Vehiculo(String fabricante, String modelo, double cc, int anio, boolean sport, int velocidad, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.anio = anio;
        this.sport = sport;
        this.velocidad = velocidad;
        this.motor = motor;
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
