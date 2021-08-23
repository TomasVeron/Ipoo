package tp1.eje3;

import tp3.eje2.Frecuencia;

import java.util.Date;

public class Chofer implements Frecuencia {
    private String nombre;
    private Colectivo colectivo;

    public Chofer(String nombre, Colectivo colectivo) {
        setNombre(nombre);
        setColectivo(colectivo);
    }

    public Chofer() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Colectivo getColectivo() {
        return colectivo;
    }

    public void setColectivo(Colectivo colectivo) {
        this.colectivo = colectivo;
    }

    public int puedeLlevar() {
        return getColectivo().getCantPasajeros();
    }

    public void registrarKm(float cantkms) {
        getColectivo().setKmRecorridos(getColectivo().getKmRecorridos() + cantkms);
    }

    @Override
    public int millas() {
        return (int) (getColectivo().millas());
    }

    @Override
    public Date ultimoViaje() {
        return new Date();
    }
}
