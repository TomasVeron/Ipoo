package tp1.eje2;

import java.util.Date;

public class CuenteCorriente extends CuentaBancaria {

    public CuenteCorriente(double saldo, Persona titular) {
        super(saldo, titular);
    }

    @Override
    public int limMinExtraccion() {
        return -150;
    }

    @Override
    public void extraer(double monto) {
        if (getSaldo() - monto > limMinExtraccion()) {
            setSaldo(getSaldo() - monto);
            getTransacciones().add(new Transaccion(new Date(), monto, "Extraccion"));
        } else System.out.println("No se pudo realizar la extraccion");
    }
}
