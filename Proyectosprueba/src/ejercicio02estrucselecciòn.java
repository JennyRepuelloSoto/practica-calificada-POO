import java.util.Scanner;

public class ejercicio02estrucselecciòn {

    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es neutro.");
        }
        scanner.close();


   }
}