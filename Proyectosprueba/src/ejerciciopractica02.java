public class ejerciciopractica02 {
//problema: dado un número, devolver el doble si el número no es par, caso contrario el triple

    public static int procesarNumero(int numero) {
        if (numero % 2 == 0) { // Verifica si el número es par
            return numero * 3; // Retorna el triple si es par
        } else {
            return numero * 2; // Retorna el doble si no es par
        }
    }

    //Método para probar el código
    public static void main(String[] args) {
        int numero = 27; // Puedes cambiar este valor para probar con diferentes números
        int resultado = procesarNumero(numero);
        System.out.println("El resultado para el número " + numero + " es: " + resultado);
    }
}

