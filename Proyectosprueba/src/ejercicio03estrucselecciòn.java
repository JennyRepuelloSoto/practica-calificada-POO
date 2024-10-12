public class ejercicio03estrucselecciòn {
    public static void main(String[] args) {
        char caracter = 'C';  // Puedes cambiar este valor para probar diferentes caracteres

        switch (Character.toLowerCase(caracter)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(caracter + " es una vocal.");
                break;
            default:
                System.out.println(caracter + " no es una vocal.");
                break;
        }
    }
}

