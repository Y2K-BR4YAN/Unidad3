import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000.0; // Saldo inicial, puedes cambiarlo según tus necesidades

        System.out.println("Bienvenido al Cajero Automático");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Depositar Dinero");
        System.out.println("3. Retirar Dinero");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Su saldo actual es: $" + saldo);
                break;

            case 2:
                System.out.print("Ingrese la cantidad a depositar: $");
                double deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.println("Nuevo saldo: $" + saldo);
                break;

            case 3:
                System.out.print("Ingrese la cantidad a retirar: $");
                double retiro = scanner.nextDouble();
                if (retiro <= saldo) {
                    saldo -= retiro;
                    System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
                } else {
                    System.out.println("Fondos insuficientes");
                }
                break;

            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                break;
        }

        scanner.close();
    }
}
