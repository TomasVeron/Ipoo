package tp2.eje1;

public class Particular extends Cliente {

    public Particular(String nombre, String telefono) {
        super(nombre, telefono);
    }

    @Override
    public float valorPlatoDia(Plato plato) {
        return plato.getValor();
    }
}
