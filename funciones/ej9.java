/*
Una empresa quiere calcular el precio final de sus productos después de aplicar un descuento general del 10%.
**Instrucciones**:
- Crea un arreglo `preciosOriginales` que almacene el precio original de varios productos.
- Escribe una función `calcularPrecioFinal` que aplique el descuento a cada producto y devuelva el precio final.
 */

public class ej9 {

    public static void main(String[] args) {

        double[] preciosOriginales = {153500, 67800, 35200, 93781, 876};
        double[] precioFinal = calcularPrecioFinal(preciosOriginales);

        System.out.println("Precios con el 10% off:");

        for (int i = 0; i < precioFinal.length; i++) {

            System.out.println("Producto " + (i + 1) + ": $" + precioFinal[i]);

        }
    }

    public static double[] calcularPrecioFinal(double[] preciosOriginales) {

        double[] preciosDescuento = new double[preciosOriginales.length];

        for (int i = 0; i < preciosOriginales.length; i++) {

            preciosDescuento[i] = preciosOriginales[i] * 0.90;
        }
        return preciosDescuento;
    }
}
