package tp5.eje4.WeatherUI.Modelo;


import ar.edu.unnoba.model.Channel;
import ar.edu.unnoba.model.City;
import ar.edu.unnoba.service.WeatherService;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.*;

public class EstacionMetereologica extends Observable implements Observer {

    WeatherService service;
    private Clima climaActual;
    private Localidad localidad;
    private List<Clima> historial;

    private boolean ordenarPorTemperatura = false;
    private boolean ordenarPorFecha = false;


    public EstacionMetereologica(Clima climaActual, Localidad localidad) {
        setClimaActual(climaActual);
        setLocalidad(localidad);
        setHistorial(new ArrayList<>());
    }

    public EstacionMetereologica() {
        setHistorial(new ArrayList<>());
    }

    public EstacionMetereologica(Localidad localidad) {
        setHistorial(new ArrayList<>());
        setLocalidad(localidad);
    }

    public Clima getClimaActual() {
        return climaActual;
    }

    public void setClimaActual(Clima climaActual) {
        this.climaActual = climaActual;

    }

    public Localidad getLocalidad() {
        return localidad;
    }

    private void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public List<Clima> getHistorial() {
        return historial;
    }

    public void setHistorial(List<Clima> historial) {
        this.historial = historial;
    }

    public WeatherService getService() {
        return service;
    }

    public void setService(WeatherService service) {
        this.service = service;
    }

    public Clima climaActual() {
        return climaActual;
    }

    public boolean isOrdenarPorTemperatura() {
        return ordenarPorTemperatura;
    }

    public void setOrdenarPorTemperatura(boolean ordenarPorTemperatura) {
        this.ordenarPorTemperatura = ordenarPorTemperatura;
    }

    public boolean isOrdenarPorFecha() {
        return ordenarPorFecha;
    }

    public void setOrdenarPorFecha(boolean ordenarPorFecha) {
        this.ordenarPorFecha = ordenarPorFecha;
    }

    public void agregarClima(Clima unClima) {
        getHistorial().add(unClima);
    }

    public void eliminarClima(Clima unClima) {
        getHistorial().remove(unClima);
    }

    public void limpiarHistorial() {
        getHistorial().clear();
        setChanged();
        notifyObservers();
    }

    public void agregarPorTemp(Clima clima) {
        Clima ultimo = getHistorial().get(getHistorial().size() - 1);
        if (ultimo.getTemperaturaActual().compareTo(clima.getTemperaturaActual()) <= 0)
            getHistorial().add(clima);
        else
            getHistorial().stream()
                    .filter(x -> x.getTemperaturaActual().compareTo(clima.getTemperaturaActual()) > 0)
                    .mapToInt(x -> getHistorial().indexOf(x))
                    .findFirst()
                    .ifPresent(x -> getHistorial().add(x, clima));
    }

    public void agregarPorFecha(Clima clima) {
        Clima ultimo = getHistorial().get(getHistorial().size() - 1);
        if (ultimo.getUltimaActualizacion().compareTo(clima.getUltimaActualizacion()) <= 0)
            getHistorial().add(clima);// si la temp del ultimo clima es menor o igual al clima a agregar lo agrego al final
        else
            getHistorial().stream()
                    .filter(x -> x.getUltimaActualizacion().compareTo(clima.getUltimaActualizacion()) > 0)
                    .mapToInt(x -> getHistorial().indexOf(x))
                    .findFirst()
                    .ifPresent(x -> getHistorial().add(x, clima));
    }

    public void ordenarClimaPorFecha() {
        Collections.sort(getHistorial(), Comparator.comparing(Clima::getUltimaActualizacion));
        setOrdenarPorFecha(true);
        setOrdenarPorTemperatura(false);
        setChanged();
        notifyObservers();
    }

    public void ordenarClimaTemperatura() {
        Collections.sort(getHistorial(), new Comparator<Clima>() {
            @Override
            public int compare(Clima o1, Clima o2) {
                return o1.getTemperaturaActual().compareTo(o2.getTemperaturaActual());
            }
        });
        setOrdenarPorFecha(false);
        setOrdenarPorTemperatura(true);
        setChanged();
        notifyObservers();
    }

    public void iniciarServicio() {
        setService(new WeatherService(City.valueOf(getLocalidad().getCiudad()), 10));
        service.addObserver(this);
        service.start();
    }

    public void detenerServicio() {
        service.stop();
        service.deleteObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        Channel c1 = ((WeatherService) o).getChannel();
        Clima clima = new Clima();
        clima.setLocalidad(getLocalidad());
        clima.setTemperaturaActual(new Temperatura(c1.getTemperature(), Escala.Celsius));
        clima.setEscala(Escala.Celsius);
        clima.setHumedad(c1.getHumidity());
        clima.setViento(c1.getWind());
        clima.setPresion(c1.getPressure());
        clima.setUltimaActualizacion(new Date());
        clima.setEstado(c1.getState());
        clima.setIconClima(c1.getWeatherIconUrl());
        if (isOrdenarPorTemperatura()) {// lo hago de esta forma porque luego de ordenar, se ordenan solo los que ya estan en la colleccion y al agregar no se ordenan
            agregarPorTemp(clima);
        } else if (isOrdenarPorFecha()) {
            agregarPorFecha(clima);
        } else {
            agregarClima(clima);
        }
        setClimaActual(clima);
        setChanged();
        notifyObservers();

    }

    public String mostrarClimaActual() {
        Clima clima = getClimaActual();
        Temperatura temp = clima.getTemperaturaActual();
        return getLocalidad().getCiudad() + " " + (int) temp.getValor() + "°C " + clima.getEstado();
    }

    public ImageIcon iconClima() throws IOException {
        ImageIO.setUseCache(true);
        Image image = ImageIO.read(new URL(getClimaActual().getIconClima()));
        return new ImageIcon(image);
    }


}
