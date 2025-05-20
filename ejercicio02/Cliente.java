
import java.rmi.Naming;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws Exception {
        int opc = 0, mont = 0;
        Scanner sc = new Scanner(System.in);
        Tarjeta tarjeta = (Tarjeta) Naming.lookup("ServTarjeta");
        System.out.println("-Sistema de tarjetas-");
        while (opc != 4) {
            System.out.println("Ingrese opcion:");
            System.out.println("1: Depositar, 2: Retirar, 3: Ver saldo, 4: Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese monto: ");
                    mont = sc.nextInt();
                    if (mont > 0) {
                        System.out.println("Deposito de : " + mont);
                        tarjeta.depositar(mont);
                        System.out.println("Su nuevo saldo es : " + tarjeta.mostrarSaldo());
                    } else {
                        System.out.println("Ingrese un monto positivo");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese monto: ");
                    mont = sc.nextInt();
                    if (mont <= tarjeta.mostrarSaldo() && mont > 0) {
                        System.out.println("Retiro de : " + mont);
                        tarjeta.retirar(mont);
                        System.out.println("Su nuevo saldo es : " + tarjeta.mostrarSaldo());
                    } else {
                        System.out.println("Ingrese un monto valido");
                    }
                    break;
                case 3:
                    System.out.println("Su saldo es : " + tarjeta.mostrarSaldo());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
    }
}

