package tp1.eje3;

import java.util.Date;

public class Colectivo extends Vehiculo {
    private int cantPasajeros;

    public Colectivo(String patente, String modelo, float kmRecorridos, int cantPasajeros) {
        super(patente, modelo, kmRecorridos);
        setCantPasajeros(cantPasajeros);
    }

    public Colectivo() {
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    @Override
    public int millas() {
        return (int) (getKmRecorridos() / 1.609);
    }

    @Override
    public Date ultimoViaje() {
        return null;
    }

}
