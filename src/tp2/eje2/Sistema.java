package tp2.eje2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sistema {
    private List<Partido> partidos;

    public Sistema() {
        setPartidos(new ArrayList<Partido>());
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    public void agregarPartido(Equipo local, Equipo visita, Estadio estadio, double valorEntrada) {
        getPartidos().add(new Partido(local, visita, estadio, valorEntrada));
    }

    public void agregarPartido(Partido p) {
        getPartidos().add(p);
    }

    public Estadio estadioConMayorCapacidad() {
        return getPartidos().stream()
                .map(Partido::getEstadio)
                .max(Comparator.comparing(Estadio::getCapacidad))
                .orElse(null);
    }


    public int cantidadTotalEspectadores() {
        return getPartidos().stream()
                .mapToInt(Partido::capacidadEstadio)
                .sum();
    }

    public double montoRecaudado(Partido partido) {
        return partido.montoRecaudado();
    }

    public double montoTotalRecaudado() {
        return getPartidos().stream()
                .mapToDouble(this::montoRecaudado)
                .sum();

    }
}
