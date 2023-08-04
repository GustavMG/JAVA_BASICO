package POO.Herencia;

import POO.Clases.Motor;
import POO.Clases.Vehiculo;

public class Motocicleta extends Vehiculo {
    boolean baul;
    public Motocicleta(){}

    public Motocicleta(String fabricante, String modelo, double cc, int anio, boolean sport, int velocidad, Motor motor, boolean baul) {
        super(fabricante, modelo, cc, anio, sport, velocidad, motor);
        this.baul = baul;
    }
}
