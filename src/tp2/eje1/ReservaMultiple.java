package tp2.eje1;

import java.util.Date;
import java.util.List;

public class ReservaMultiple extends Reserva {

    private List<Plato> platos;

    public ReservaMultiple(Cliente cliente, Date fecha, List<Plato> platos) {
        super(cliente, fecha);
        setPlatos(platos);
    }

    public List<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(List<Plato> platos) {
        this.platos = platos;
    }


    @Override
    public float valorReserva() {
        return (float) getPlatos().stream()
                .mapToDouble(Plato::getValor)
                .sum() * (1 - 0.05f);
    }

    @Override
    public int cantidadPlatosReservados() {
        return getPlatos().size();
    }
}
