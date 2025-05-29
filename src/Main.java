import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CuentaDeAhorros cuenta = new CuentaDeAhorros(200, 12f);
        Scanner sc = new Scanner(System.in);
        int opcion;
        float cantidad;

        do {
            System.out.println("\n----- MENÚ -----");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar número de depósitos");
            System.out.println("4. Consultar número de retiros");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    System.out.print("Cantidad a depositar: ");
                    cantidad = sc.nextFloat();
                    cuenta.depositar(cantidad);
                    System.out.println("Depósito realizado.");
                    break;
                case 2:
                    System.out.print("Cantidad a retirar: ");
                    cantidad = sc.nextFloat();
                    cuenta.retirar(cantidad);
                    System.out.println("Retiro realizado (si la cuenta está activa y hay saldo suficiente).");
                    break;
                case 3:
                    System.out.println("Número de depósitos: " + cuenta.numeroDepositos);
                    break;
                case 4:
                    System.out.println("Número de retiros: " + cuenta.numeroRetiros);
                    break;
                case 5:
                    System.out.println("Saldo actual: $" + cuenta.saldo);
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while(opcion != 6);

        sc.close();
    }
}