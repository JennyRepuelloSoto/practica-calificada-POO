import java.util.Scanner;
//problema: De acuerdo a estructuras de selección en el programa IntelliJ IDEA hallar los siguientes ejercicios:
// Debido a los excelentes resultados, el restaurante decide ampliar sus ofertas de acuerdo a la siguiente escala
// de consumo (ver tabla). Determinar el monto del descuento, el importe del impuesto y el importe a pagar.


public class ejerciciopractica05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el consumo
        System.out.print("Ingrese el consumo (s/.): ");
        double consumo = scanner.nextDouble();

        // Inicializar variables
        double descuento = 0.0;
        double impuesto = 0.19; // Tasa de impuesto 19%
        double importeDescuento, importeImpuesto, importeTotal;

        // Determinar el porcentaje de descuento
        if (consumo <= 100) {
            descuento = 10; // 10%
        } else if (consumo <= 200) {
            descuento = 20; // 20%
        } else {
            descuento = 30; // 30%
        }

        // Calcular el monto del descuento
        importeDescuento = consumo * (descuento / 100);

        // Aplicar el descuento al consumo
        double consumoConDescuento = consumo - importeDescuento;

        // Calcular el importe del impuesto sobre el consumo con descuento
        importeImpuesto = consumoConDescuento * impuesto;

        // Calcular el importe total a pagar
        importeTotal = consumoConDescuento + importeImpuesto;

        // Mostrar los resultados
        System.out.printf("Monto del descuento: S/. %.2f\n", importeDescuento);
        System.out.printf("Importe del impuesto: S/. %.2f\n", importeImpuesto);
        System.out.printf("Importe total a pagar: S/. %.2f\n", importeTotal);
    }
}

