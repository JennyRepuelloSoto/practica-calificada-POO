import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos del empleado
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el salario base: ");
        double salarioBase = scanner.nextDouble();

        System.out.print("Ingrese el número de horas extras trabajadas: ");
        int horasExtras = scanner.nextInt();

        // Crear el objeto Empleado
        Empleado empleado = new Empleado(nombre, salarioBase, horasExtras);

        // Calcular y mostrar el salario total
        double salarioTotal = empleado.calcularSalarioTotal();
        System.out.printf("El salario total de %s es: %.2f\n", empleado.nombre, salarioTotal);

        // Determinar y mostrar la categoría salarial
        String categoria = empleado.determinarCategoria();
        System.out.printf("La categoría salarial de %s es: %s\n", empleado.nombre, categoria);

        scanner.close();
    }
}


