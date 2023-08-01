package Fundamentos.VariablesYTiposDatos;

public class Casteo {
    public static void main(String[] args) {
        //Casting o casteo sirve para realizar una conversión de tipos de datos a uno mas grande o mas pequeño
        double ice = 59.7f;
        //Casteo
        int iceInt = (int)ice;
        System.out.println("Se convirtió el valor float " + ice + " en entero " + iceInt);

        long numlong = (long)ice;
        System.out.println("Se convirtió el valor float " + ice + " en long " + iceInt);

        String cantidad = "85";
        String precio = "59.7";
        int cantEntero = Integer.parseInt(cantidad);
        double cantEnteroPrecio = Double.parseDouble(precio);
        System.out.println(cantEntero);
        System.out.println(cantEnteroPrecio);
        System.out.println("El valor de la compra es: $" + (cantEntero*cantEnteroPrecio));
    }
}
