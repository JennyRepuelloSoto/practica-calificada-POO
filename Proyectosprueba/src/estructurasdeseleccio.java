import java.util.Scanner;

public class estructurasdeseleccio {

    public static void main(String[] args) {
        // Definimos dos números enteros
        int numero1 = 100; // Puedes cambiar este valor
        int numero2 = 15; // Puedes cambiar este valor

         Scanner _scaner = new Scanner(System.in);
        // Usamos una estructura de selección para encontrar el número mayor
        int mayor;
        if (numero1 > numero2) {
            mayor = numero1;
        } else {
            mayor = numero2;
        }

        // Imprimimos el número mayor
        System.out.println("El número mayor es: " + mayor);
    }

}
