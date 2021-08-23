package tp3.eje2;

import java.util.Date;

public class Pasajero implements Frecuencia {
    private int millas;
    private Date ultViaje;

    @Override
    public int millas() {
        return millas;
    }

    @Override
    public Date ultimoViaje() {
        return ultViaje;
    }
}
