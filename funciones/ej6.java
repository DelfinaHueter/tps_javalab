import java.util.Scanner;

/*
Una pequeña empresa debe calcular el impuesto de venta para cada una de las facturas emitidas.
**Instrucciones**:
- Crea un arreglo `facturas` con los montos de las facturas de los clientes.
- Escribe una función `calcularImpuesto` que aplique un 21% de impuesto a cada factura.
 */

public class ej6 {

    public static void main(String[] args) {

        double[] facturas = {1793, 981, 3411, 6735, 109351, 250000};

        double[] impuestos = calcularImpuesto(facturas);

        System.out.println("21% de cada factura:");

        for (int i = 0; i < impuestos.length; i++) {

            System.out.println("Factura " + (i + 1) + ": $" + impuestos[i]);
        }
    }

    public static double[] calcularImpuesto(double[] facturas) {

        double[] impuestos = new double[facturas.length];

        for (int i = 0; i < facturas.length; i++) {

            impuestos[i] = facturas[i] * 0.21;
        }

        return impuestos;
    }
}
