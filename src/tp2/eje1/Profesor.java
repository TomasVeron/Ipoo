package tp2.eje1;

public class Profesor extends Cliente {

    public Profesor(String nombre, String telefono) {
        super(nombre, telefono);
    }

    @Override
    public float valorPlatoDia(Plato plato) {
        return plato.getValor() * (1 - 0.1F);
    }
}
