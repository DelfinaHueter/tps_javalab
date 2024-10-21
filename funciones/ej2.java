public class ej2 {

    public static void main(String[] args) {

        Scanner A = new Scanner(System.in);

        String[] productos = {"Heladera", "Microondas", "Celular", "Auriculares", "Bicicleta"};
        int[] Stock = new int[productos.length];

        for (int i = 0; i < productos.length; i++) {

            System.out.println("Stock de " + productos[i]);
            Stock[i] = A.nextInt();
        }
        generarReporteBajoStock(Stock, productos);
    }

    public static void generarReporteBajoStock(int[] Stock, String[] productos) {

        int elementosStock = Stock.length;

        for (int j = 0; j < productos.length; j++){

            if (Stock[j] < 6) {

                System.out.println("El producto "+ productos[j]+ " tiene "+ Stock[j]+ " unidades en stock");
            }
        }
    }
}
