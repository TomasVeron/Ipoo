package tp3.eje2;

import java.util.Date;

public class Vehiculo implements Frecuencia {
    private String marca;
    private String modelo;
    private String patente;
    private int milllasRecorridas;
    private Date ultimoViaje;

    public Vehiculo(String marca, String modelo, String patente, int milllasRecorridas, Date ultimoViaje) {
        setMarca(marca);
        setModelo(modelo);
        setPatente(patente);
        setMilllasRecorridas(milllasRecorridas);
        setUltimoViaje(ultimoViaje);
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getMilllasRecorridas() {
        return milllasRecorridas;
    }

    public void setMilllasRecorridas(int milllasRecorridas) {
        this.milllasRecorridas = milllasRecorridas;
    }

    public Date getUltimoViaje() {
        return ultimoViaje;
    }

    public void setUltimoViaje(Date ultimoViaje) {
        this.ultimoViaje = ultimoViaje;
    }

    @Override
    public int millas() {
        return getMilllasRecorridas();
    }

    @Override
    public Date ultimoViaje() {
        return getUltimoViaje();
    }
}
