
import java.rmi.Remote;

public interface Tarjeta extends Remote{
    public void depositar(int monto) throws Exception;
    public void retirar(int monto) throws Exception;
    public void setSaldo(int sald) throws Exception;
    public int mostrarSaldo() throws Exception;
}
