import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner scanner = new Scanner(System.in);

        CuentaBancaria Cliente= new CuentaBancaria();
        System.out.println("==== Sistema de cuentas bancarias ====");
        System.out.print("ingrese el nombre del Cliente: ");
        Cliente.setNombre(scanner.nextLine());

        System.out.print("ingrese Saldo Inicial: ");
        Cliente.setSaldo(scanner.nextInt());

        System.out.println("ingrese tipo de cuenta: Ahorros");
        Cliente.setTCuenta(scanner.nextLine());
        System.out.println("Opciones: ");
        System.out.println("1. Depositar Dinero ");
        System.out.println("2. Retirar Dinero");
        System.out.println("3. Consultar Saldo ");
        System.out.println("4. Salir ");
        System.out.print("Selecione una Opcion: ");
        opcion = scanner.nextInt();
        if(opcion==1){
            System.out.print("ingrese Monto a Depositar: ");
            Cliente.setDeposito(scanner.nextInt());
            System.out.println("Saldo Actualizado: "+(Cliente.getDeposito()+Cliente.getSaldo()));
            System.out.println(Cliente.Estado());
        }else if(opcion==2){
            System.out.print("ingrese Monto a Retirar: ");
            Cliente.setRetiro(scanner.nextInt());
            System.out.println("Saldo Actualizado: "+(Cliente.getSaldo()-Cliente.getRetiro()));
            System.out.println(Cliente.Estado());
        }else if(opcion==3){
            System.out.println("Saldo Actualizado: "+Cliente.getSaldo());
        }else{
            System.out.println("Saliendo... ");
            System.exit(0);
        }

    }
}