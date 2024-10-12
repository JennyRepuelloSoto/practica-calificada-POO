import java.util.Scanner;

public class ejerciciobucle02 {

    public static void main(String[] args){

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner  Scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número inicial
        System.out.print("Ingrese el número inicial: ");
        int inicio = Scanner.nextInt();

        // Pedir al usuario que ingrese el número final
        System.out.print("Ingrese el número final: ");
        int fin = Scanner.nextInt();

        // Variable para contar los números pares
        int contadorPares = 0;

        // Recorrer el rango de números desde inicio hasta fin
        for (int i = inicio; i <= fin; i++) {
            // Verificar si el número es par
            if (i % 2 == 0) {
                contadorPares++; // Incrementar el contador si es par
            }
        }

        // Mostrar el resultado al usuario
        System.out.println("La cantidad de números pares en el rango es: " + contadorPares);

        // Cerrar el scanner
        Scanner.close();
    }
}
