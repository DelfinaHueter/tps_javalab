/*
Una tienda de ropa ofrece un 15% de descuento a las compras superiores a $500.
**Instrucciones**:
- Crea un arreglo `compras` que almacene los montos de las compras de los clientes.
- Escribe una función `aplicarDescuento` que aplique el descuento a las compras que superen los $500.
 */

public class ej7 {

    public static void main(String[] args) {

        double[] compras = {70, 550, 8000, 320, 275};
        double[] descuentosAplicados = aplicarDescuento(compras);

        System.out.println("Compras con el 15% off:");

        for (int i = 0; i < descuentosAplicados.length; i++) {

            if (compras[i] > 500) {

                System.out.println("Compra " + (i + 1) + ": $" + descuentosAplicados[i]);

            }
        }
    }

    public static double[] aplicarDescuento(double[] compras) {

        double[] comprasDescuento = new double[compras.length];

        for (int i = 0; i < compras.length; i++) {

            if (compras[i] > 500) {

                comprasDescuento[i] = compras[i] * 0.85;

            } else {

                comprasDescuento[i] = compras[i];
            }
        }
        return comprasDescuento;
    }
}
