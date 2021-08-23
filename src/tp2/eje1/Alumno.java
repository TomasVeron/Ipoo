package tp2.eje1;

public class Alumno extends Cliente {

    public Alumno(String nombre, String telefono) {
        super(nombre, telefono);
    }

    @Override
    public float valorPlatoDia(Plato plato) {
        return plato.getValor() * (1 - 0.2F);
    }
}
