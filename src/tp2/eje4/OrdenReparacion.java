package tp2.eje4;

public class OrdenReparacion {
    private String reparcion;
    private Componente componente;

    public OrdenReparacion(String reparcion, Componente componente) {
        setReparcion(reparcion);
        setComponente(componente);
    }

    public String getReparcion() {
        return reparcion;
    }

    public void setReparcion(String reparcion) {
        this.reparcion = reparcion;
    }

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }

    public float precioReparacion() {
        return getComponente().getPrecio();
    }
}
