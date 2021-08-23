package tp2.eje4;

import java.util.ArrayList;
import java.util.List;

public class Taller {

    private List<OrdenReparacion> reparaciones;

    public Taller() {
        setReparaciones(new ArrayList<OrdenReparacion>());
    }

    public List<OrdenReparacion> getReparaciones() {
        return reparaciones;
    }

    public void setReparaciones(List<OrdenReparacion> reparaciones) {
        this.reparaciones = reparaciones;
    }

    public void addReparacion(OrdenReparacion reparacion) {
        getReparaciones().add(reparacion);
    }

    public float costoReparacion(OrdenReparacion ordenReparacion) {
        return ordenReparacion.precioReparacion();
    }

    public float costoTotalReparaciones() {
        float costoTotal = 0;
        for (OrdenReparacion orden : getReparaciones()) {
            costoTotal += costoReparacion(orden);
        }
        return costoTotal;
    }

}
