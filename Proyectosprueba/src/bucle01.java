import java.util.Scanner;

public class bucle01 {

    public static void main(String[] args){
// declaraciòn de variables
        int valorfinal = 0;
        int contador = 1;
        int acumulador = 0;

        //captura de datos
        Scanner imput = new Scanner(System.in);
        System.out.println("ingrese el valor final a sumar");
        valorfinal = imput.nextInt();


        // proceso
        while ( contador <= valorfinal){
            acumulador = acumulador + contador; // valor final
            contador += 1; //muy importante

        }
        // salida
        System.out.println("la suma de los:"+ valorfinal + " numero es igual a:"+ acumulador);
    }
}


