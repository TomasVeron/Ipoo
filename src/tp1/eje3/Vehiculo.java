package tp1.eje3;

import tp3.eje2.Frecuencia;

public abstract class Vehiculo implements Frecuencia {

    private String patente;
    private String modelo;
    private float kmRecorridos;

    public Vehiculo(String patente, String modelo, float kmRecorridos) {
        setPatente(patente);
        setModelo(modelo);
        setKmRecorridos(kmRecorridos);
    }

    public Vehiculo() {
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(float kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

}
