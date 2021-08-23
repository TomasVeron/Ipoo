package tp2.eje2;

public class Estadio {
    private String nombre;
    private int capacidad;

    public Estadio(String nombre, int capacidad) {
        setNombre(nombre);
        setCapacidad(capacidad);
    }

    public Estadio() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Estadio{" +
                "nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
