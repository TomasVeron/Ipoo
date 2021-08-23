package tp2.eje2;

public class Partido {

    private Equipo local;
    private Equipo visitante;
    private Estadio estadio;
    private double valorEntrada;

    public Partido(Equipo local, Equipo visitante, Estadio estadio, double valorEntrada) {
        setLocal(local);
        setVisitante(visitante);
        setEstadio(estadio);
        setValorEntrada(valorEntrada);
    }

    public Partido() {
    }

    public Partido(Estadio estadio) {
        setEstadio(estadio);
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public int capacidadEstadio() {
        return getEstadio().getCapacidad();
    }

    public double montoRecaudado() {
        return capacidadEstadio() * getValorEntrada();
    }
}
