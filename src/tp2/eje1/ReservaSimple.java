package tp2.eje1;

import java.util.Date;

public class ReservaSimple extends Reserva {
    private Plato plato;

    public ReservaSimple(Cliente cliente, Date fecha, Plato plato) {
        super(cliente, fecha);
        setPlato(plato);
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    @Override
    public float valorReserva() {
        return getCliente().valorPlatoDia(getPlato());
    }

    @Override
    public int cantidadPlatosReservados() {
        return 1;
    }
}
