import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       Registro_Vehiculos registro = new Registro_Vehiculos();

        System.out.println("ingrese la marca del vehiculo: ");
        registro.setMarca(input.nextLine());

        System.out.println("ingrese el modelo de vehiculo");
        registro.setModelo(input.nextLine());

        System.out.println("ingrese el año de fabricacion");
        registro.setAnioFab(input.nextInt());

        System.out.println("ingrese la velocidad actual");
        registro.setVelocidadAct(input.nextDouble());

        System.out.println("opciones");
        System.out.println("1.Acelerar vehiculo");
        System.out.println("2.Frenar vehiculo");
        System.out.println("3.Consultar antiguedad del vehiculo");
        System.out.println("4.salir");

        System.out.println("seleccione una opcion");
        int opcion = input.nextInt();

        switch (opcion){
            case 1:
                System.out.println(registro.Acelerar());
                break;
            case 2:
                System.out.println(registro.Frenar());
                break;
            case 3:
                System.out.println("el vehiculo tiene " + registro.edadVehicular() +" años de antiguedad");
                System.out.println("estado del vehiculo " + registro.EstadoVehicular());
                break;
            case 4:
                System.out.println("salir" );
                break;

            default:
                System.out.println("elige una opcion valida");
        }
    }
}
