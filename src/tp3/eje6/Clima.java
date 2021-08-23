package tp3.eje6;

import java.util.Date;

public class Clima {
    private Localidad localidad;
    private Temperatura temperaturaActual;
    private Temperatura minima;
    private Temperatura maxima;
    private Escala escala;
    private double presion;
    private double viento;
    private Direccion direccionViento;
    private double humedad;
    private double visibilidad;
    private Date ultimaActualizacion;

    public Clima(Localidad localidad, Temperatura temperaturaActual, Temperatura minima, Temperatura maxima, Escala escala, double presion, double viento, Direccion direccionViento, double humedad, double visibilidad, Date ultimaActualizacion) {
        setLocalidad(localidad);
        setTemperaturaActual(temperaturaActual);
        setMinima(minima);
        setMaxima(maxima);
        setEscala(temperaturaActual.getEscala());
        setPresion(presion);
        setViento(viento);
        setDireccionViento(direccionViento);
        setHumedad(humedad);
        setVisibilidad(visibilidad);
        setUltimaActualizacion(ultimaActualizacion);
    }

    public Clima() {
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public Temperatura getTemperaturaActual() {
        return temperaturaActual;
    }

    public void setTemperaturaActual(Temperatura temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public Temperatura getMinima() {
        return minima;
    }

    public void setMinima(Temperatura minima) {
        this.minima = minima;
    }

    public Temperatura getMaxima() {
        return maxima;
    }

    public void setMaxima(Temperatura maxima) {
        this.maxima = maxima;
    }

    public Escala getEscala() {
        return escala;
    }

    public void setEscala(Escala escala) {
        this.escala = escala;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public double getViento() {
        return viento;
    }

    public void setViento(double viento) {
        this.viento = viento;
    }

    public Direccion getDireccionViento() {
        return direccionViento;
    }

    public void setDireccionViento(Direccion direccionViento) {
        this.direccionViento = direccionViento;
    }

    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public double getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(double visibilidad) {
        this.visibilidad = visibilidad;
    }

    public Date getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    public void setUltimaActualizacion(Date ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }

    @Override
    public String toString() {
        return "Clima{" +
                "localidad=" + localidad +
                ", temperaturaActual=" + temperaturaActual +
                ", minima=" + minima +
                ", maxima=" + maxima +
                ", escala=" + escala +
                ", presion=" + presion +
                ", viento=" + viento +
                ", direccionViento=" + direccionViento +
                ", humedad=" + humedad +
                ", visibilidad=" + visibilidad +
                ", ultimaActualizacion=" + ultimaActualizacion +
                '}';
    }
}
