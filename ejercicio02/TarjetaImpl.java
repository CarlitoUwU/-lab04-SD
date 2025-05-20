
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TarjetaImpl extends UnicastRemoteObject implements Tarjeta {
    private int saldoTarjeta;
    public TarjetaImpl() throws RemoteException {
        super();
    }
    public TarjetaImpl(int saldo) throws RemoteException {
        super();
        this.saldoTarjeta = saldo;
    }
    @Override
    public void depositar(int monto) throws Exception {
        saldoTarjeta = saldoTarjeta + monto;
    }
    @Override
    public void retirar(int monto) throws Exception {
        saldoTarjeta = saldoTarjeta - monto;
    }
    @Override
    public int mostrarSaldo() throws Exception {
        return this.saldoTarjeta;
    }
    @Override
    public void setSaldo(int sald) throws Exception {
        this.saldoTarjeta = sald;
    }
}

