package tp3.eje6;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EstacionMetereologica {
    private Clima climaActual;
    private Localidad localidad;
    private List<Clima> historial;

    public EstacionMetereologica(Clima climaActual, Localidad localidad) {
        setClimaActual(climaActual);
        setLocalidad(localidad);
        setHistorial(new ArrayList<Clima>());
    }

    public EstacionMetereologica() {
    }

    public Clima getClimaActual() {
        return climaActual;
    }

    public void setClimaActual(Clima climaActual) {
        if (getClimaActual() != null) {
            agregarClima(getClimaActual());
        }
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

    public Clima climaActual() {
        return getClimaActual();
    }

    public void agregarClima(Clima unClima) {
        getHistorial().add(unClima);
    }

    public void eliminarClima(Clima unClima) {
        getHistorial().remove(unClima);
    }

    public void ordenarClimaPorFecha() {
        getHistorial().sort(Comparator.comparing(Clima::getUltimaActualizacion));
    }

    public void ordenarClimaTemperatura() {
        getHistorial().sort(new Comparator<Clima>() {
            @Override
            public int compare(Clima o1, Clima o2) {
                return o1.getTemperaturaActual().comparteTo(o2.getTemperaturaActual());
            }
        });
    }
}
