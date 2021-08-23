package tp2.eje1;

public abstract class Cliente {
    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        setNombre(nombre);
        setTelefono(telefono);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public abstract float valorPlatoDia(Plato plato);
}
