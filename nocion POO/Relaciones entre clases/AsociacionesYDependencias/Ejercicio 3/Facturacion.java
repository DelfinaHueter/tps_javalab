package AsociacionYDependencia;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Facturacion {
    private static ArrayList<Articulos> articulos = new ArrayList<>();

    public static void main(String[] args) {
        llenarArrayListDeArticulos();
        menuDeArticulosParaFactura();
    }

    private static void llenarArrayListDeArticulos() {
        articulos.add(new Articulos(101, "Leche", 25));
        articulos.add(new Articulos(102, "Gaseosa", 30));
        articulos.add(new Articulos(103, "Fideos", 15));
        articulos.add(new Articulos(104, "Arroz", 28));
        articulos.add(new Articulos(105, "Vino", 120));
        articulos.add(new Articulos(106, "Manteca", 20));
        articulos.add(new Articulos(107, "Lavandina", 18));
        articulos.add(new Articulos(108, "Detergente", 46));
        articulos.add(new Articulos(109, "Jabón en Polvo", 96));
        articulos.add(new Articulos(110, "Galletas", 60));
    }

    private static void menuDeArticulosParaFactura() {
        Scanner scanner = new Scanner(System.in);
        Factura factura = new Factura();

        System.out.print("Ingrese la fecha de la factura (DD/MM/AAAA): ");
        factura.setFechaFactura(scanner.nextLine());

        long numeroFactura;
        do {
            System.out.print("Ingrese el número de factura: ");
            numeroFactura = scanner.nextLong();
            if (numeroFactura <= 0) {
                System.out.println("El número de factura debe ser mayor a 0.");
            }
        } while (numeroFactura <= 0);
        factura.setNumeroFactura(numeroFactura);

        scanner.nextLine(); // Consumir el salto de línea
        String cliente;
        do {
            System.out.print("Ingrese el nombre del cliente: ");
            cliente = scanner.nextLine();
            if (cliente.isEmpty()) {
                System.out.println("El nombre del cliente no puede estar vacío.");
            }
        } while (cliente.isEmpty());
        factura.setCliente(cliente);

        System.out.println("\nLista de artículos disponibles:");
        mostrarListaDeArticulos();

        while (true) {
            System.out.print("Ingrese el código del artículo (o 'fin' para terminar): ");
            String codigoArticuloInput = scanner.next();

            if ((codigoArticuloInput.toLowerCase()).equalsIgnoreCase("fin")) {
                break;
            }

            long codigoArticulo;

            try {
                codigoArticulo = Long.parseLong(codigoArticuloInput);
            } catch (NumberFormatException e) {
                System.out.println("Código inválido. Intente nuevamente.");
                continue;
            }

            Articulos articulo = buscarArticulo(codigoArticulo);
            if (articulo == null) {
                System.out.println("El código ingresado no existe, intente nuevamente.");
                continue;
            }

            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();
            double precioUnitario = articulo.getPrecio();
            double descuento = cantidad > 5 ? precioUnitario * 0.1 : 0;
            double subtotal = (precioUnitario - descuento) * cantidad;

            DetalleFactura detalle = new DetalleFactura();
            detalle.setCodigo_articulo(String.valueOf(articulo.getCodigo()));
            detalle.setNombre_articulo(articulo.getDescripcion());
            detalle.setCantidad(cantidad);
            detalle.setPrecio_unitario(precioUnitario);
            detalle.setDescuento_item(descuento);
            detalle.setSubTotal(subtotal);

            factura.getDetalles().add(detalle);
        }

        factura.calcularMontoTotal();
        imprimirFactura(factura);
        scanner.close();
    }

    private static Articulos buscarArticulo(long codigoArticulo) {
        for (Articulos articulo : articulos) {
            if (articulo.getCodigo() == codigoArticulo) {
                return articulo;
            }
        }
        return null;
    }

    private static void imprimirFactura(Factura factura) {
        System.out.println("Fecha: " + factura.getFechaFactura());
        System.out.println("Número: " + factura.getNumeroFactura());
        System.out.println("Cliente: " + factura.getCliente());
        System.out.printf("%-20s %-20s %-10s %-20s %-12s %-12s%n", "Código Artículo",  "Nombre Artículo",  "Cantidad",  "Precio Unitario",  "Descuento",  "Subtotal");

        for (DetalleFactura detalle : factura.getDetalles()) {
            System.out.printf("%-20s %-20s %-10d %-20.2f %-12.2f %-12.2f%n",
                    detalle.getCodigo_articulo(),
                    detalle.getNombre_articulo(),
                    detalle.getCantidad(),
                    detalle.getPrecio_unitario(),
                    detalle.getDescuento_item(),
                    detalle.getSubTotal());
        }

        System.out.println("Total: " + factura.getTotalCalculadoFactura());
    }

    private static void mostrarListaDeArticulos() {
        System.out.printf("%-10s %-20s %-10s%n", "Código", "Descripción", "Precio");
        for (Articulos articulo : articulos) {
            System.out.printf("%-10d %-20s %-10.2f%n",
                    articulo.getCodigo(),
                    articulo.getDescripcion(),
                    articulo.getPrecio());
        }
    }
}

