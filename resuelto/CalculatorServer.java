import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            Calculator calc = new CalculatorImpl();
            Naming.rebind("rmi://localhost:1099/CalculatorService", calc);

            System.out.println("Servidor listo en rmi://localhost:1099/CalculatorService");
        } catch (Exception e) {
            System.err.println("Error: " + e);
            e.printStackTrace();
        }
    }
}
