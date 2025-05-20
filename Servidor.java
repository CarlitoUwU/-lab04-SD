
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {
    private static final int PUERTO = 1099;

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        // System.setProperty("java.rmi.server.hostname", "localhost");
        TarjetaImpl tarjeta = new TarjetaImpl();
        Registry reg = LocateRegistry.createRegistry(PUERTO);
        reg.rebind("ServTarjeta", tarjeta);
        System.out.println("Servidor escuchando en el puerto " + PUERTO);
    }
}

