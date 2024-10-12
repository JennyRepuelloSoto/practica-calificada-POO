import java.util.Scanner;
//problema: Dados 3 números, devolver los números en orden ascendente.
public class ejerciciopractica03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los tres números
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        // Ordenar los números
        int temp;

        // Comparar num1 con num2
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Comparar num1 con num3
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        }

        // Comparar num2 con num3
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Imprimir los números en orden ascendente
        System.out.println("Números en orden ascendente:");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}



