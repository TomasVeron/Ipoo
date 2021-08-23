package tp1.eje2;

import java.util.Date;
import java.util.Vector;

public abstract class CuentaBancaria {
    private double saldo;
    private Persona titular;
    private Date fechaApertura;
    private Vector<Transaccion> transacciones;


    public CuentaBancaria(double saldo, Persona titular) {
        setSaldo(saldo);
        setTitular(titular);
        setFechaApertura(new Date());
        setTransacciones(new Vector<Transaccion>());
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    private void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Vector<Transaccion> getTransacciones() {
        return transacciones;
    }

    private void setTransacciones(Vector<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public abstract int limMinExtraccion();

    public void depositar(double monto) {
        setSaldo(getSaldo() + monto);
        getTransacciones().add(new Transaccion(new Date(), monto, "Deposito"));
    }

    public abstract void extraer(double monto);

}
