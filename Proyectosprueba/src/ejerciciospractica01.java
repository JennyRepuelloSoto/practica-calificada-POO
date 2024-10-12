import java.util.Scanner;

public class ejerciciospractica01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer tres números enteros del usuario
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int numero3 = scanner.nextInt();

        // Encontrar el número mayor usando estructuras de selección
        int mayor;
        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        // Imprimir el número mayor
        System.out.println("El número mayor es: " + mayor);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

