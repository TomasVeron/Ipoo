package tp5.eje4.WeatherUI.Modelo;

import java.util.Comparator;
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
    private String estado;
    private String iconClima;

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String nomclima) {
        this.estado = nomclima;
    }

    public String getIconClima() {
        return iconClima;
    }

    public void setIconClima(String iconClima) {
        this.iconClima = iconClima;
    }


    public String informacionCompleta() {
        return "localidad: " + getLocalidad().getCiudad() + ", " + getLocalidad().getProvincia() + ", " + getLocalidad().getPais() + "\n" +
                "Temperatura: " + (int) getTemperaturaActual().getValor() + "°\n" +
                "Estado: " + getEstado() + "\n" +
                "Escala: " + getEscala() + "\n" +
                "Velocidad del Viento: " + getViento() + " m/s \n" +
                "Presion: " + getPresion() + "\n" +
                "Humedad: " + getHumedad() + "%\n" +
                "Visibilidad: " + getVisibilidad() + "%\n" +
                "fecha: " + getUltimaActualizacion().toLocaleString() + "\n";
    }

}
