package ConceptosAvanzados;

public class FuncionPura {
    public static void main(String[] args) {
        /**
         * Hablemos de las funciones puras...
         * Para simplificar, las funciones puras son aquellas que dados unos mismos parámetros de entrada
         * SIEMPRE obtengamos el mismo resultado de salida
         *
         * @NOTA: Java NO es un lenguaje puramente funcional, como hemos mencionado y visto, esta enfocado a la POO
         * Programación Orientada a Objetos, sin embargo si podemos manejar este concepto de cierta manera!
         *
         * Crearemos una función suma y le daremos unos parámetros
         *
         * Como podemos observar, se cumple el hecho de ser función pura ya que siempre vamos a obtener el mismo
         * resultado, obviamente dependiendo de los parámetros de entrada, pero mientras sean los mismo siempre tenemos
         * el mismo resultado.
         * Ahora, para que se mantenga como función pura, esta función no debe depender de otra ni otras depender
         * de esta, por ejemplo NO podemos invocar a otraas funciones dentro o MODIFICAR variables globales
         * Por ejemplooo, si tuviesemos un contador que se aumente o reste cada que se llame nuestra función suma
         * entonces deja de ser función pura ya que estariamos haciendo modificaciones
         * Tambien es importante tener en cuenta que nuestra función NO debe hacer mas de lo que deberia, por ejemplo
         * si nosotros llamaramos a otra función que reste o multiplique dentro de nuestra función suma
         * estariamos modificando otros parámetros que son ajenos a nuestra función pura
         *
         * Debe devolver siempre el valor acorde a los parámetros de entrada
         */
        int resultado1 = suma(1,2);
        int resultado2 = suma(2,3);
        System.out.println("Los resultados son: " + resultado1 + " y " + resultado2);
    }

    public static int suma(int a, int b){
        return a + b;
    }
}
