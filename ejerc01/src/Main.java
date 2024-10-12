import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercio 001");





        //Empleado trabaja01 = new Empleado("Luis",3000, 48, 2);
        Scanner input = new Scanner(System.in);
        Empleado trabaja01 = new Empleado();
        System.out.println("Ingrese Nombre");
        trabaja01.setNombre(input.next());
        System.out.println("Ingrese Horas Trabajadas");
        trabaja01.setHoras(input.nextDouble());
        System.out.println("Ingrese Horas Extras");
        trabaja01.setHorasExtras(input.nextDouble());
        System.out.println("Ingrese Salario Base");
        trabaja01.setSalarioBase(input.nextDouble());
        System.out.println(trabaja01.calcularSalarioTotal());
        System.out.println(trabaja01.determinarCategoria());








            }
}