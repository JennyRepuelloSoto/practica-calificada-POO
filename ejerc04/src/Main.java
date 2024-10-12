import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        control_de_asistencia aplicacion = new control_de_asistencia();

        System.out.println("ingrese el nombre del estudinate: ");
        aplicacion.setEstudiante(input.nextLine());

        System.out.println("ingrese la cantidad de dias asistidos");
        aplicacion.setDiasAsistidos(input.nextShort());

        System.out.println("calculando porcentaje de asitencia");

        System.out.println("el porcentaje de asistencia " + aplicacion.Porcentaje());

        System.out.println("estado del estudiante" + aplicacion.estadoestudiante());
    }
}