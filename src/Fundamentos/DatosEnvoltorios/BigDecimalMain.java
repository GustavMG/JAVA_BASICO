package Fundamentos.DatosEnvoltorios;

import java.math.BigDecimal;

public class BigDecimalMain {
    public static void main(String[] args) {
        /**
         * Para usar esta clase envoltorio debemos importar
         *  import java.math.BigDecimal;
         * BigDecimal es útil en diversos casos de uso en el ámbito de la lógica de negocio, especialmente cuando
         * se requiere alta precisión en operaciones con números decimales.
         *
         * Aplicaciones financieras
         * Cálculos fiscales y contables
         * Aplicaciones científicas
         * Cálculos estadísticos
         * Cálculos de ingeniería
         * Cálculos de proporciones y porcentajes
         * Aplicaciones de comercio electrónico: En sistemas de comercio electrónico, donde se manejan precios de
         * productos y cantidades, BigDecimal garantiza cálculos precisos al realizar operaciones como descuentos,
         * sumas totales y cálculos de envío.
         *
         * Para hacer operaciones con big decimal no usamos operadores, necesitamos usar los métodos de la clase
         * y tambien es importante que para hacer las operaciones se debe hacer big decimal con big decimal
         */
        BigDecimal valorA = new BigDecimal(3.14);
        BigDecimal valorB = new BigDecimal(4);

        BigDecimal resultadoSuma = valorA.add(valorB);
        System.out.println(resultadoSuma);
    }
}
