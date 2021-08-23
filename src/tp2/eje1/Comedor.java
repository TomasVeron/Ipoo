package tp2.eje1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Comedor {
    private List<Reserva> reservas;
    private String direcccion;
    private String telefono;

    public Comedor(String direcccion, String telefono) {
        setReservas(new ArrayList<Reserva>());
        setDirecccion(direcccion);
        setTelefono(telefono);
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public String getDirecccion() {
        return direcccion;
    }

    public void setDirecccion(String direcccion) {
        this.direcccion = direcccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void agregarReserva(Cliente cliente, Plato plato) {
        Reserva r = new ReservaSimple(cliente, new Date(), plato);
        getReservas().add(r);
    }

    public void agregarReserva(Cliente cliente, List<Plato> platos) {
        Reserva r = new ReservaMultiple(cliente, new Date(), platos);
        getReservas().add(r);
    }

    public float valorReserva(Reserva reserva) {
        return reserva.valorReserva();
    }

    public int totalPlatosReservados() {
        return getReservas().stream()
                .mapToInt(Reserva::cantidadPlatosReservados)
                .sum();
    }

    public float totalValorReservas() {
        return (float) getReservas().stream()
                .mapToDouble(Reserva::valorReserva)
                .sum();
    }

    public Reserva reservaMasPlatos() {
        return getReservas().stream()
                .max(Comparator.comparingInt(Reserva::cantidadPlatosReservados))
                .orElse(null);

    }

}
