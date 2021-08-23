package tp1.eje2;

import java.util.Date;

public class CuentaAhorro extends CuentaBancaria {

    private int extreccionesMax;

    public CuentaAhorro(double saldo, Persona titular) {
        super(saldo, titular);
        setExtreccionesMax(5);
    }

    public int getExtreccionesMax() {
        return extreccionesMax;
    }

    private void setExtreccionesMax(int extreccionesMax) {
        this.extreccionesMax = extreccionesMax;
    }

    @Override
    public int limMinExtraccion() {
        return 10;
    }

    @Override
    public void extraer(double monto) {
        if (getSaldo() - monto > limMinExtraccion() && getExtreccionesMax() > 0) {
            setSaldo(getSaldo() - monto);
            setExtreccionesMax(getExtreccionesMax() - 1);
            getTransacciones().add(new Transaccion(new Date(), monto, "Extraccion"));
        } else System.out.println("No se pudo realizar la extraccion");
    }
}
