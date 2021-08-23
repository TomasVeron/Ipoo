package tp2.eje1;

import java.util.Date;

public abstract class Reserva {
    private Cliente cliente;
    private Date fecha;

    public Reserva(Cliente cliente, Date fecha) {
        setCliente(cliente);
        setFecha(fecha);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public abstract float valorReserva();

    public abstract int cantidadPlatosReservados();

}
