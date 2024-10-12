import java.util.Scanner;

public class ejerciciopractica04 {
// problema:Un restaurante ofrece un descuento del 10 % para consumos de hasta S/.100.00 y un descuento de 20% para
// consumos mayores. Para ambos casos se aplica un impuesto del 19 %. Determinar el monto del descuento, el
// impuesto y el importe a pagar.


    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Leer el monto consumido
        System.out.print("Ingrese el monto consumido en soles: S/. ");
        double monto = scanner.nextDouble();

        // Definir las tasas de descuento y el impuesto
        double descuento;
        double impuestoTasa = 0.19;

        // Calcular el descuento según el monto consumido
        if (monto <= 100) {
            descuento = monto * 0.10;  // Descuento del 10%
        } else {
            descuento = monto * 0.20;  // Descuento del 20%
        }

        // Calcular el subtotal después del descuento
        double subtotal = monto - descuento;

        // Calcular el impuesto
        double impuesto = subtotal * impuestoTasa;

        // Calcular el importe total a pagar
        double totalAPagar = subtotal + impuesto;

        // Mostrar los resultados
        System.out.printf("Monto consumido: S/. %.2f%n", monto);
        System.out.printf("Descuento aplicado: S/. %.2f%n", descuento);
        System.out.printf("Subtotal después del descuento: S/. %.2f%n", subtotal);
        System.out.printf("Impuesto (19%%): S/. %.2f%n", impuesto);
        System.out.printf("Importe total a pagar: S/. %.2f%n", totalAPagar);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}


